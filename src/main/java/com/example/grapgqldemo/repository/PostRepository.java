package com.example.grapgqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.grapgqldemo.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
