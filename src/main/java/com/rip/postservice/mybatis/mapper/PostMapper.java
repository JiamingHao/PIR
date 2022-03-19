package com.rip.postservice.mybatis.mapper;

import com.rip.postservice.DTO.PostDTO;
import com.rip.postservice.mybatis.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();

    Post findById(Integer postId);

    void create(PostDTO post);

    void update(@Param("id") Integer postId, @Param("post") PostDTO post);

    void delete(Integer postId);
}
