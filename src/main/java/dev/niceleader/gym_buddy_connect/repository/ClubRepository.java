package dev.niceleader.gym_buddy_connect.repository;

import dev.niceleader.gym_buddy_connect.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
}
