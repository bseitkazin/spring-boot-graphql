package com.example.grapgqldemo.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.grapgqldemo.model.Post;
import com.example.grapgqldemo.service.PostService;

@Component
public class PostQuery implements GraphQLQueryResolver {
	
	@Autowired
	private PostService service;
	
	public List<Post> getPosts() {
		return service.getAllPosts();
	}
	
	public Post getPost(long id) {
		return service.getPost(id);
	}
}
