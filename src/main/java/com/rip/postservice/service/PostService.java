package com.rip.postservice.service;


import com.rip.postservice.DTO.PostDTO;
import com.rip.postservice.mybatis.entity.Post;
import com.rip.postservice.mybatis.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService{

    @Autowired
    private PostMapper postMapper;

    public List<Post> findAll(){
        return postMapper.findAll();
    }

    public Post findById(Integer id){
        return postMapper.findById(id);
    }

    public boolean create(PostDTO post){
        postMapper.create(post);
        return true;
    }

    public boolean update(Integer id, PostDTO newPost){
        postMapper.update(id, newPost);
        return true;
    }

    public boolean delete(Integer id){
        postMapper.delete(id);
        return true;
    }
}

