package com.iqiang.service;

import com.iqiang.pojo.TbUser;

/**
 * Created by zhuzhiqiang on 17/6/19.
 */
public interface UserService {

    /**
     * 查询用户
     *
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    public TbUser searchUserByUserNameAndPW(String userName, String password);

    /**
     * 创建用户
     *
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    public boolean createUserWithUserNameAndPW(String userName, String password);

}
