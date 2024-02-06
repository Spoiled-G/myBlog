package com.myblog11.service;

import com.myblog11.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostByID(long id);

    List<PostDto> getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
}
