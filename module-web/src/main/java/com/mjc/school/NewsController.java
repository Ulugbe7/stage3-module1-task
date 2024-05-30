package com.mjc.school;


import com.mjc.school.dto.NewsRequestDto;
import com.mjc.school.dto.NewsResponseDto;
import com.mjc.school.service.NewsService;

import java.util.List;

public class NewsController {

    private final NewsService newsService = new NewsService();

    public NewsController() {
    }

    public List<NewsResponseDto> getAllNews() {
        return newsService.getAllNews();
    }

    public NewsResponseDto getById(long id) {
        return newsService.readById(id);
    }

    public NewsResponseDto create(NewsRequestDto dtoRequest) {
        return newsService.create(dtoRequest);
    }

    public NewsResponseDto update(NewsRequestDto dtoRequest) {
        return newsService.update(dtoRequest);
    }

    public boolean delete(long id) {
        return newsService.delete(id);
    }
}