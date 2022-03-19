package com.rip.postservice.mybatis.entity;


import java.io.Serializable;

public class Post implements Serializable {
    private Long postId;
    private String title;
    private String content;

    public Post(Long postId, String title, String content) {
        this.postId = postId;
        this.title = title;
        this.content = content;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

