package dev.niceleader.gym_buddy_connect.controller;

import dev.niceleader.gym_buddy_connect.logic.service.ClubService;
import org.springframework.stereotype.Controller;

@Controller
public class ClubController {
    private final ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

}
