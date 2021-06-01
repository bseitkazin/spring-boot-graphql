package com.example.grapgqldemo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grapgqldemo.model.Post;
import com.example.grapgqldemo.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostRepository repository;
	
	public List<Post> getAllPosts() {
		return repository.findAll();
	}
	
	public Post getPost(long id) {
		return repository.getById(id);
	}
	
	public Post createPost(String title, String author, String type) {
		final Post post = new Post();
		post.setTitle(title);
		post.setAuthor(author);
		post.setType(type);
		post.setCreatedDate(LocalDate.now());
		return repository.save(post);
	}
}
