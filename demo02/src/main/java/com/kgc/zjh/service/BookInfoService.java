package com.kgc.zjh.service;

import com.kgc.zjh.pojo.BookInfo;

import java.util.List;

public interface BookInfoService {

    List<BookInfo> selectAll(int bookType,String bookName,int isBorrow);

}
