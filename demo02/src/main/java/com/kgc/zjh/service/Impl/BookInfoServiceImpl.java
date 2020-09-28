package com.kgc.zjh.service.Impl;

import com.kgc.zjh.mapper.BookInfoMapper;
import com.kgc.zjh.pojo.BookInfo;
import com.kgc.zjh.pojo.BookInfoExample;
import com.kgc.zjh.service.BookInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookinfoservice")
public class BookInfoServiceImpl implements BookInfoService{

    @Resource
    BookInfoMapper bookInfoMapper;

    @Override
    public List<BookInfo> selectAll(int bookType,String bookName,int isBorrow) {
        BookInfoExample example=new BookInfoExample();
        BookInfoExample.Criteria criteria = example.createCriteria();
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
