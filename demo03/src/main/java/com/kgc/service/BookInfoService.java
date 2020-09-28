package com.kgc.service;

import com.kgc.pojo.Book_info;

import java.util.List;

public interface BookInfoService {

    List<Book_info> selectAll(int bookType, String bookName, int isBorrow);

}
