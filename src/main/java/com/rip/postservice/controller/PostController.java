package com.rip.postservice.controller;

import com.rip.postservice.DTO.PostDTO;
import com.rip.postservice.mybatis.entity.Post;
import com.rip.postservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String mainPage(){
        return "Hello World";
    }

    @GetMapping("/post/{postId}")
    public Post findById(@PathVariable Integer postId){
        return postService.findById(postId);
    }

    @GetMapping("/posts")
    public List<Post> findAll(){
        return postService.findAll();
    }

    @PostMapping("/post")
    public String create(@RequestBody PostDTO post){
        postService.create(post);
        return "insertion success";
    }

    @PutMapping("/post/{postId}")
    public String update(@PathVariable Integer postId, @RequestBody PostDTO post){
        postService.update(postId, post);
        return "update success";
    }

    @DeleteMapping("/post/{postId}")
    public String delete(@PathVariable Integer postId){
        postService.delete(postId);
        return "delete success";
    }

}

