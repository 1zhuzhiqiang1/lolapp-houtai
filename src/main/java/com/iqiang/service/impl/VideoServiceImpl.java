package com.iqiang.service.impl;

import com.iqiang.dao.TbVideoMapper;
import com.iqiang.pojo.TbVideo;
import com.iqiang.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    TbVideoMapper tbVideoMapper;

    public TbVideo getVideos() {
        TbVideo selectByPrimaryKey = tbVideoMapper.selectByPrimaryKey((long) 1);
        return selectByPrimaryKey;
    }
}
