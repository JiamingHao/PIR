package com.rip.postservice.DTO;

public class PostCommentDTO {

    public String title;

    public int author_id;

    public int post_id;

    public String content;

    public PostCommentDTO(){}

    public PostCommentDTO(int author_id, int post_id, String title, String content){
        this.author_id   = author_id;
        this.title = title;
        this.content = content;
        this.post_id = post_id;
    }

    public String getTitle(){return this.content;}
    public int getAuthor_id(){return this.author_id;}
    public int getPost_id(){return this.post_id;}
    public String getContent(){return this.content;}

    @Override
    public String toString() {
        return "PostCommentDTO{" +
                "title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", author_id=" + getAuthor_id()  +
                ", post_id=" + getPost_id() +
                '}';
    }
}





