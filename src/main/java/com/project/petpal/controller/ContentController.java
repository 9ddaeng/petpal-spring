package com.project.petpal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContentController {

    @GetMapping("/contents/write") //localhost:8090/contents/write
    public String contentsWriteForm() {

        return "contentswrite";
    }
}
