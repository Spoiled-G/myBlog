package com.myblog11.repository;

import com.myblog11.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PostRepository extends JpaRepository<Post,Long> {

}
