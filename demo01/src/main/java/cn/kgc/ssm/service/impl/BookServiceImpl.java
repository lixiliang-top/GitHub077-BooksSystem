package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.BooksMapper;
import cn.kgc.ssm.pojo.Books;
import cn.kgc.ssm.pojo.BooksExample;
import cn.kgc.ssm.service.BooksService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-28 9:30
 */
@Transactional
@Service("bookService")
public class BookServiceImpl implements BooksService {

    @Resource
    BooksMapper booksMapper;

    @Override
    public PageInfo<Books> bList(Integer pageIndex, Integer pageSize,Integer booktype,String bookname,Integer isborrow) {
        BooksExample example = new BooksExample();
        BooksExample.Criteria criteria = example.createCriteria();
        if (booktype!=0){
            criteria.andBooktypeEqualTo(booktype);
        }
        if (bookname!=null&&bookname.length()!=0){
            criteria.andBooknameLike("%"+bookname+"%");
        }
        if (isborrow!=01){
            criteria.andIsborrowEqualTo(isborrow);
        }
//        if (booktype==0&&bookname==""&&isborrow==01){//判断图书分类、图书名称、是否借阅等于空查全部
//            booksMapper.selectByExample(example);
//        }else if (booktype!=0&&bookname==""&&isborrow==01){//判断图书分类不等于空、图书名称、是否借阅等于空根据图书分类查寻
//            criteria.andBooktypeEqualTo(booktype);
//        }else if (booktype!=0||bookname!=""||isborrow==01){//判断图书分类、图书名称不等于空、是否借阅等于空根据图书分类、图书名称查寻
//            criteria.andBooktypeEqualTo(booktype);
//            criteria.andBooknameLike("%"+bookname+"%");
//        }else if (booktype!=0||bookname!=""||isborrow!=01){//判断图书分类、图书名称、是否借阅都不等于空根据图书分类、图书名称查寻
//            criteria.andBooktypeEqualTo(booktype);
//            criteria.andBooknameLike("%"+bookname+"%");
//            criteria.andIsborrowEqualTo(isborrow);
//        }
        PageHelper.startPage(pageIndex,pageSize);
        PageHelper.orderBy("bookid desc");
        List<Books> books = booksMapper.selectByExample(example);
        PageInfo<Books> pageInfo = new PageInfo<>(books);
        return pageInfo;
    }
}
