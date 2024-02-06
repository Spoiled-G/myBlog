package com.myblog11.service.impl;

import com.myblog11.entity.Post;
import com.myblog11.exception.ResourceNotFoundException;
import com.myblog11.payload.PostDto;
import com.myblog11.repository.PostRepository;
import com.myblog11.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    private ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository,ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = mapToEntity(postDto);

//        Post post = new Post();
//
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());

       Post savedPost = postRepository.save(post);


       PostDto dto = mapToDto(post);


//       dto.setTitle(savedPost.getTitle());
//       dto.setDescription(savedPost.getDescription());
//       dto.setContent(savedPost.getContent());

        return dto;
    }

    @Override
    public PostDto getPostByID(long id) {
       Post post = postRepository.findById(id).orElseThrow(
               ()-> new ResourceNotFoundException("Post not found with id:"+id)
       );
        PostDto dto = mapToDto(post);

        return dto;
    }

    @Override
    public List<PostDto> getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = (sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo,pageSize, sort);
        Page<Post> pagePost = postRepository.findAll(pageable);

        List<Post> content = pagePost.getContent();

        List<PostDto> collect = content.stream().map(post -> mapToDto(post)).collect(Collectors.toList());
        return collect;
    }

    PostDto mapToDto(Post post) {

        PostDto dto = modelMapper.map(post, PostDto.class);

//        PostDto dto = new PostDto();
//
//        dto.setTitle(post.getTitle());
//        dto.setDescription(post.getDescription());
//        dto.setContent(post.getContent());
        return dto;

    }

    Post mapToEntity(PostDto postDto){

        Post post = modelMapper.map(postDto, Post.class);

//        Post post = new Post();
//
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
        return post;

    }
}
