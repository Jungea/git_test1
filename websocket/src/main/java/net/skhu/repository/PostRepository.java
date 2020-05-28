package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
