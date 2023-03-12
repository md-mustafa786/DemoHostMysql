package com.example.DemoHostMysql.controlller;

import com.example.DemoHostMysql.model.Post;
import com.example.DemoHostMysql.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping(value = "add-post")
    public ResponseEntity<String> addPost(@RequestBody Post post){
        postService.addpost(post);
        return new ResponseEntity<>("saved post", HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "get-all")
    public List<Post> getall(){
        return postService.getPost();
    }
}
