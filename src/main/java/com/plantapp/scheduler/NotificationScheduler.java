package com.plantapp.scheduler;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.plantapp.entity.EventSchedule;
import com.plantapp.entity.Notification;
import com.plantapp.repository.EventScheduleRepository;
import com.plantapp.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class NotificationScheduler {

    private final EventScheduleRepository scheduleRepo;
    private final NotificationRepository notificationRepo;

    @Scheduled(cron = "0 0 8 * * ?") // daily at 8 AM
    public void generateNotifications() {

        LocalDateTime now = LocalDateTime.now();

        List<EventSchedule> dueSchedules =
                scheduleRepo.findByNextDueDateLessThanEqualAndActiveTrue(now);

        for (EventSchedule schedule : dueSchedules) {

            boolean exists = notificationRepo.existsByPlantIdAndEventTypeIdAndDueDate(
                    schedule.getPlantId(),
                    schedule.getEventTypeId(),
                    schedule.getNextDueDate()
            );
        
            if (!exists) {
                Notification n = new Notification();
                n.setPlantId(schedule.getPlantId());
                n.setEventTypeId(schedule.getEventTypeId());
                n.setMessage("Task due for plant: " + schedule.getPlantId());
                n.setDueDate(schedule.getNextDueDate());
                n.setIsSent(false);
        
                notificationRepo.save(n);
            }
        
            // update next schedule
            schedule.setNextDueDate(
                    schedule.getNextDueDate().plusDays(schedule.getFrequencyDays())
            );
        
            scheduleRepo.save(schedule);
        }
    }
}