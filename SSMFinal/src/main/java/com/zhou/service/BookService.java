package com.zhou.service;

import com.zhou.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    //增加一本书
    int addBooks(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书
    List<Books> queryAllBook();

    //查询书ByName
    Books queryBookByName(String bookName);

    //重排序
    int sortBookID();

}
