package com.project.petpal.controller;

import org.slf4j.LoggerFactory;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class HomeController {
    @PostMapping("/memberJoin")
    @CrossOrigin(origins = "http://localhost:3000")
    public void memberJoin(@RequestBody Map<String, String> userInfo) {

        Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);
        logger.info("hey");

    }

}
