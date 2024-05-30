package com.mjc.school.mapper;

import com.mjc.school.repository.model.News;
import com.mjc.school.dto.NewsRequestDto;
import com.mjc.school.dto.NewsResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NewsMapper {

    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    List<NewsResponseDto> newsListToDtoList(List<News> newsLIst);

    NewsResponseDto newsToDto(News news);

    @Mappings(value = {@Mapping(target = "createDate", ignore = true), @Mapping(target = "lastUpdateDate", ignore = true)})
    News dtoToNews(NewsRequestDto newsRequest);
}
