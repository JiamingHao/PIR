package com.rip.postservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postController {

    @GetMapping("/")
    String mainPage(){
        return "Hello World";
    }

    @GetMapping("/post/{postId}")
    String getPostById(@PathVariable Integer postId){
        return String.valueOf(postId);
    }

}

