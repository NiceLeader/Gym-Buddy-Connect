package dev.niceleader.gym_buddy_connect.logic.service;

import dev.niceleader.gym_buddy_connect.dto.ClubDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClubService {
    List<ClubDto> findAllClubs();
}
