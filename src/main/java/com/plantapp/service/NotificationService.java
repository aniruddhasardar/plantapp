package com.plantapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.plantapp.dto.NotificationDTO;
import com.plantapp.mapper.NotificationMapper;
import com.plantapp.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;

    public List<NotificationDTO> getPending() {
        return repository.findByIsSentFalse()
                .stream()
                .map(NotificationMapper::toDTO)
                .toList();
    }
}
