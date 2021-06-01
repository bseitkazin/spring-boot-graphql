package com.example.grapgqldemo.graphql;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.grapgqldemo.model.Post;
import com.example.grapgqldemo.service.PostService;

@Component
public class PostMutation implements GraphQLMutationResolver {
	private PostService service;
	
	public Post createPost(String title, String author, String type) {
		return service.createPost(title, author, type);
	}
}
