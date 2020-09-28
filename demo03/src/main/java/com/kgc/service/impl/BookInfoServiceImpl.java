package com.kgc.service.impl;

import com.kgc.mapper.Book_infoMapper;
import com.kgc.pojo.Book_info;
import com.kgc.pojo.Book_infoExample;
import com.kgc.service.BookInfoService;
import com.kgc.service.BookInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookinfoservice")
public class BookInfoServiceImpl implements BookInfoService {

    @Resource
    Book_infoMapper bookInfoMapper;

    @Override
    public List<Book_info> selectAll(int bookType, String bookName, int isBorrow) {
        Book_infoExample example=new Book_infoExample();
        Book_infoExample.Criteria criteria = example.createCriteria();
        if(bookType==0 && isBorrow==2 && bookName==""){
            System.out.println("Hahah");
            return bookInfoMapper.selectByExample(null);
        }
        if(bookName!=""){
            criteria.andBookNameLike("%"+bookName+"%");
        }
        if(isBorrow!=2){
            criteria.andIsBorrowEqualTo(isBorrow);
        }
        if(bookType!=0){
            criteria.andBookTypeEqualTo(bookType);
        }
        return bookInfoMapper.selectByExample(example);
    }
}
