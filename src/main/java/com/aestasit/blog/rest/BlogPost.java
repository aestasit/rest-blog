package com.aestasit.blog.rest;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name = "post")
public class BlogPost implements Serializable {


    private long id;
    private String title;
    private String context;
    private Date postDate;
    private String author;

    public BlogPost() {} // Default Constructor, don't remove

    public BlogPost(long id, String title, String context, Date postDate, String author) {

        this.id = id;
        this.title = title;
        this.context = context;
        this.postDate = postDate;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
