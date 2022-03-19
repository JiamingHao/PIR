package com.rip.postservice.DTO;

public class PostDTO {

    public String title;

    public String content;

    public PostDTO(){}

    public PostDTO(String title, String content) {
        this.title = title;
        this.content = content;
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

    @Override
    public String toString() {
        return "PostDTO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

