package com.itheima;



import com.itheima.domain.Comment;
//import com.itheima.mapper.ArticleMapper;
import com.itheima.mapper.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter03ManualApplicationTests {
    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void selectComment() {
//        Comment comment = commentMapper.findById(1);
//        System.out.println(comment);
    }


    }



