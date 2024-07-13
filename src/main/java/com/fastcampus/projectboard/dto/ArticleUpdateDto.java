package com.fastcampus.projectboard.dto;

import com.fastcampus.projectboard.domain.Article;

import java.io.Serializable;

/**
 * DTO for {@link Article}
 */
public record ArticleUpdateDto(
        String title,
        String content,
        String hashtag
) {
    public static ArticleUpdateDto of(String title, String content, String hashtag) {
        return new ArticleUpdateDto(title, content, hashtag);
    }
}