package com.aestasit.blog.rest;

import java.util.List;

public interface BlogService {

    BlogPost getPostById(String id);
    List getTags();
}
