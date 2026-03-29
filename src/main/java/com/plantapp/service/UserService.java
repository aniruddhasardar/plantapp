package com.plantapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.plantapp.dto.UserDTO;
import com.plantapp.entity.AppUser;
import com.plantapp.mapper.UserMapper;
import com.plantapp.repository.AppUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final AppUserRepository repository;

    public UserDTO create(UserDTO dto) {
        AppUser user = UserMapper.toEntity(dto);
        return UserMapper.toDTO(repository.save(user));
    }

    public List<UserDTO> getAll() {
        return repository.findByDeleteFlagFalse()
                .stream()
                .map(UserMapper::toDTO)
                .toList();
    }
}