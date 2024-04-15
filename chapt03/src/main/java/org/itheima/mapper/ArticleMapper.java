package org.itheima.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.itheima.domain.*;

@Mapper
public interface ArticleMapper {
    public Article selectArticle(Integer id);

    public int updateArticle(Article article);

}
