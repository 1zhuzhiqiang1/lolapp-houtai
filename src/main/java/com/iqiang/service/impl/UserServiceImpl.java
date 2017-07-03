package com.iqiang.service.impl;

import com.iqiang.dao.TbUserMapper;
import com.iqiang.dao.TbVideoMapper;
import com.iqiang.pojo.TbUser;
import com.iqiang.pojo.TbUserExample;
import com.iqiang.pojo.TbVideo;
import com.iqiang.service.UserService;
import com.iqiang.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by zhuzhiqiang on 17/6/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TbUserMapper tbUserMapper;
    @Autowired
    TbVideoMapper tbVideoMapper;

    public TbUser searchUserByUserNameAndPW(String userName, String password) {
        if (null == userName || null == password) {
            return null;
        }
        TbUserExample tbUserExample = new TbUserExample();
        TbUserExample.Criteria criteria = tbUserExample.createCriteria();
        criteria.andNameEqualTo(userName);
//        TbUser tbUser = tbUserMapper.selectByPrimaryKey("123213123");
        TbVideo selectByPrimaryKey = tbVideoMapper.selectByPrimaryKey((long) 1);
        System.out.println(selectByPrimaryKey);
        return null;
    }

    public boolean createUserWithUserNameAndPW(String userName, String password) {
        if (null == userName || null == password) {
            return false;
        }
        TbUser tbUser = new TbUser();
        tbUser.setUid(UUIDUtil.getUUID());
        tbUser.setName(userName);
        tbUser.setPassword(password);
        return tbUserMapper.insert(tbUser) > 0;
    }
}
