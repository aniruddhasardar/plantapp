package com.plantapp.repository;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.AppUser;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface AppUserRepository extends BaseRepository<AppUser, Integer> {
    AppUser findByEmail(String email);
}