package com.example.grapgqldemo.service;

import java.util.List;

import com.example.grapgqldemo.model.Post;

public interface PostService {
	public List<Post> getAllPosts();
	public Post getPost(long id);
	public Post createPost(String title, String author, String type);
}
