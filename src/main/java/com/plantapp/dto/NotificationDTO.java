package com.plantapp.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class NotificationDTO {
    private Integer id;
    private Integer plantId;
    private Integer eventTypeId;
    private String message;
    private String dueDate;
}