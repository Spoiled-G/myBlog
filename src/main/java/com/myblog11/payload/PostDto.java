package com.myblog11.payload;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    @Id
    private long id;

    private String description;

    private String content;


    private String title;
}
