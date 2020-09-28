package com.kgc.service.impl;

import com.kgc.mapper.UsersMapper;
import com.kgc.pojo.Users;
import com.kgc.pojo.Users;
import com.kgc.pojo.UsersExample;
import com.kgc.pojo.UsersExample;
import com.kgc.service.UsersService;
import com.kgc.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usersservice")
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public Users selectByName(String user_code) {
        Users usersname=null;
        UsersExample example=new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(user_code);
        List<Users> users = usersMapper.selectByExample(example);
        if(users!=null&&users.size()>0){
            usersname=users.get(0);
        }
        return usersname;
    }
}
