package com.iqiang.atest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iqiang.pojo.TbVideo;
import com.iqiang.service.VideoService;

@Controller
@RequestMapping("/test")
public class TestC {

	@Autowired
	VideoService videoService;

	@RequestMapping("/getAllVideos")
	@ResponseBody
	public Object getAllVideos() {
		TbVideo videos = videoService.getVideos();
		return videos;
	}

}
