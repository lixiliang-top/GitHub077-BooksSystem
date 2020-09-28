package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Users;

/**
 * @author 李锡良
 * @create 2020-09-28 8:51
 */
public interface UsersService {

    //登录
    Users uLogin(String usercode);

}
