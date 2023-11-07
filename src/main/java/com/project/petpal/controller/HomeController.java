package com.project.petpal.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController("HomeController")
@RequestMapping(path="/")
@CrossOrigin
public class HomeController {
    @PostMapping("/memberJoin")
    public void memberJoin(@RequestBody Map<String, String> info) {


    }

}
