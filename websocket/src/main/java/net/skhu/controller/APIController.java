package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.skhu.domain.Post;
import net.skhu.repository.PostRepository;

@RestController
@RequestMapping("api")
public class APIController {
	@Autowired
	PostRepository postRepository;

	@RequestMapping("/posts")
	public List<Post> posts() {
		return postRepository.findAll();
	}

	@RequestMapping(value = "/post/{postId}", method = RequestMethod.GET)
	public Post post(@PathVariable("postId") int postId) {
		return postRepository.findById(postId).get();
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public void post1(@RequestParam("file") MultipartFile file) {
		System.out.println(file);
	}

}
