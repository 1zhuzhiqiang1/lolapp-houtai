package com.iqiang.controller;

import java.io.File;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/me/upload")
public class FileUploadC extends BaseController {

	@RequestMapping(value = "/header", method = RequestMethod.POST)
	@ResponseBody
	public Object upload(@RequestParam(required = true, value = "file") MultipartFile file) {
		String originalFilename = file.getOriginalFilename();
		System.out.println("上传的文件名是：" + originalFilename);
		String savePath = "/Users/anyware/Documents/MyProject/JavaEE/images";
		File targetFile = new File(savePath, originalFilename);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// 保存
		try {
			file.transferTo(targetFile); // 传送 失败就抛异常
		} catch (Exception e) {
			e.printStackTrace();
		}

		Map<String, Object> result = this.ajaxSuccessResponse("请求成功");
		return result;
	}

}
