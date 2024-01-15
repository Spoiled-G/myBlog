package com.myblog11.service.impl;

import com.myblog11.entity.Post;
import com.myblog11.exception.ResourceNotFoundException;
import com.myblog11.payload.PostDto;
import com.myblog11.repository.PostRepository;
import com.myblog11.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();

        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

       Post savedPost = postRepository.save(post);

       PostDto dto = new PostDto();

       dto.setTitle(savedPost.getTitle());
       dto.setDescription(savedPost.getDescription());
       dto.setContent(savedPost.getContent());

        return dto;
    }

    @Override
    public PostDto getPostByID(long id) {
       Post post = postRepository.findById(id).orElseThrow(
               ()-> new ResourceNotFoundException("Post not found with id:"+id)
       );
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());

        return dto;
    }
}
