package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Books;
import com.github.pagehelper.PageInfo;

/**
 * @author 李锡良
 * @create 2020-09-28 9:30
 */
public interface BooksService {

    PageInfo<Books> bList(Integer pageIndex, Integer pageSize,Integer booktype,String bookname,Integer isborrow);

}
