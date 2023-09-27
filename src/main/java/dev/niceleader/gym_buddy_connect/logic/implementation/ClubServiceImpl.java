package dev.niceleader.gym_buddy_connect.logic.implementation;

import dev.niceleader.gym_buddy_connect.dto.ClubDto;
import dev.niceleader.gym_buddy_connect.logic.service.ClubService;
import dev.niceleader.gym_buddy_connect.model.Club;
import dev.niceleader.gym_buddy_connect.repository.ClubRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ClubServiceImpl implements ClubService {
    private final ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream()
                .map(this::mapToClubDto).collect(Collectors.toList());
    }
    private ClubDto mapToClubDto(Club club) {
        return ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
    }
}
