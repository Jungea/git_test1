package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.Post;
import net.skhu.repository.PostRepository;

@RestController
@RequestMapping("api")
public class APIController {
	@Autowired
	PostRepository postRepository;
	
	@RequestMapping("/a")
	public List<Post> a() {
		return postRepository.findAll();
	}
}
