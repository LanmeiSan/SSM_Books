package com.zhou.dao;

import com.zhou.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBooks(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);//传入bookid，在BookMapper.xml接收

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询全部的书
    List<Books> queryAllBook();

    //查询一本书ByName
    Books queryBookByName(@Param("bookName") String bookName);

    //重排序
    int sortBookID();
}
