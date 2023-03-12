package com.example.DemoHostMysql.dao;

import com.example.DemoHostMysql.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {
}
