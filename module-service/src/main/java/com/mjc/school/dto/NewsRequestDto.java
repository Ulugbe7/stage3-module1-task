package com.mjc.school.dto;

import lombok.Builder;

public record NewsRequestDto(
        String title,
        String content,
        Long authorId
) {
}
