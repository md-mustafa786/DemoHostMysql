package com.example.DemoHostMysql.service;

import com.example.DemoHostMysql.dao.PostRepo;
import com.example.DemoHostMysql.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;
    public void addpost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getPost() {
      return   postRepo.findAll();
    }
}
