package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.UsersMapper;
import cn.kgc.ssm.pojo.Users;
import cn.kgc.ssm.pojo.UsersExample;
import cn.kgc.ssm.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-28 8:52
 */
@Transactional
@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public Users uLogin(String usercode) {
        Users users = null;
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsercodeEqualTo(usercode);
        List<Users> users1 = usersMapper.selectByExample(example);
        if (users1!=null&&users1.size()>0){
            users = users1.get(0);
        }
        return users;
    }
}
