package com.iqiang.controller;

import com.iqiang.entity.VideoCenterEntity;
import com.iqiang.utils.JSONPUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("/video")
public class VideoController extends BaseController {

    /**
     * 爬虫多玩网站的视频
     *
     * @return
     * @throws IOException
     */
    @RequestMapping("/duowan")
    @ResponseBody
    public String duowanVideo(
            @RequestParam(value = "page", required = true) String page,
            @RequestParam(value = "jsonpcallback", required = false) String jsonp) throws IOException {
        String url = "";
        if (page.equals("1")) {
            url = "http://video.duowan.com/t/zhuboqushi.html";
        } else {
            url = "http://video.duowan.com/t/zhuboqushi_" + page + ".html";
        }
        System.out.println(url);
        ArrayList<VideoCenterEntity> datas = new ArrayList<VideoCenterEntity>();
        Document document = Jsoup.connect(url).get();
        Element newsbox__bd = document.getElementsByClass("m-newsbox__bd").first();
        Elements uiVideos = newsbox__bd.getElementsByClass("uiVideo__item");
        for (Element element : uiVideos) {
            Element a_0 = element.getElementsByClass("uiVideo__ori").first();
            String imgUri = a_0.getElementsByClass("uiVideo__img").first().attr("src");
            String videoTime = a_0.getElementsByClass("uiVideo__time").first().text();
            Element uiVideo__meta = element.getElementsByClass("uiVideo__meta").first();
            String zuozhe = uiVideo__meta.getElementsByClass("uiVideo__metaauthor").first().attr("title");
            String bofangliang = uiVideo__meta.getElementsByClass("uiVideo__playtotal").attr("data-num");
            Element subtitleEle = element.getElementsByClass("uiVideo__subtitle").first();
            String miaoshu = subtitleEle.text();
            String videoUrl = subtitleEle.attr("href");
            videoUrl = videoUrl.replace("com", "cn");
            VideoCenterEntity item = new VideoCenterEntity(imgUri, videoTime, zuozhe, bofangliang, miaoshu, videoUrl);
            datas.add(item);
        }
        Map<String, Object> result = this.ajaxSuccessResponse("请求成功");
        result.put("data", datas);
//		System.out.println(datas.size());
//		System.out.println(new Gson().toJson(result));
        return JSONPUtil.toJson(result, jsonp);
    }

    @RequestMapping("/getVideoAddress")
    @ResponseBody
    public Object getVideoAddress(@RequestParam(value = "url", required = true) String url) throws IOException {
        String videoUrl = "";
        Document document = Jsoup.connect(url).get();
        videoUrl = document.getElementById("video").attr("src");
        Map<String, Object> result = this.ajaxSuccessResponse();
        result.put("data", videoUrl);
        return result;
    }

}
