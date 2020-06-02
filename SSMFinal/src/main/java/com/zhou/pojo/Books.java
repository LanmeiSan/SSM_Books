package com.zhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor /*有参构造*/
@NoArgsConstructor /*无参构造*/
public class Books {

    /*保持和数据库字段一致，防止空指正错误*/
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
