package com.iqiang.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iqiang.entity.BBGXEntity;
import com.iqiang.entity.ZXZXEntity;
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
@RequestMapping("/zixun")
public class ZiXunController extends BaseController {

	private final String InitPage = "1";
	private final String BaseUrl = "http://lol.duowan.cn";

	/**
	 * 版本更新
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/banbengengxin")
	@ResponseBody
	public Map<String, Object> banbengengxin(@RequestParam(value = "page", required = true) String page)
			throws IOException {
		String url = "";
		if (page.equals(InitPage)) {
			url = "http://lol.duowan.com/tag/136318484427.html";
		} else {
			url = "http://lol.duowan.com/tag/136318484427_" + page + ".html";
		}
		ArrayList<BBGXEntity> datas = new ArrayList<BBGXEntity>();
		Document document = Jsoup.connect(url).get();
		Element m_list = document.getElementsByClass("ch-list-sec").first();
		Elements lists = m_list.getElementsByTag("li");
		System.out.println(lists.size());
		for (Element element : lists) {
			// System.out.println(element);
			Element img_A = element.getElementsByClass("ch-img").first().getElementsByTag("a").get(0);
			String link = "http://lol.duowan.com" + img_A.attr("href");
			String img_link = img_A.getElementsByTag("img").first().attr("src");
			String title = element.getElementsByClass("titles").first().getElementsByTag("p").text();
			String subtitle = element.getElementsByClass("contents").first().text();
			String user = element.getElementsByClass("users").first().text();
			String time = element.getElementsByClass("times").first().text();
			BBGXEntity entity = new BBGXEntity(link, img_link, title, subtitle, user, time);
			System.out.println(new ObjectMapper().writeValueAsString(entity));
			datas.add(entity);
		}
		// System.out.println(new ObjectMapper().writeValueAsString(datas));
		Map<String, Object> result = this.ajaxSuccessResponse("请求成功");
		result.put("data", datas);
		return result;
	}

	/**
	 * 电竞新闻
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/dianjingxinwen")
	@ResponseBody
	public Object dianjingxinwen(@RequestParam(value = "page", required = true) String page) throws IOException {
		String url = "";
		if (page.equals(InitPage)) {
			url = "http://lol.duowan.com/tag/172578469745.html";
		} else {
			url = "http://lol.duowan.com/tag/172578469745_" + page + ".html";
		}
		ArrayList<ZXZXEntity> datas = new ArrayList<ZXZXEntity>();
		Document document = Jsoup.connect(url).get();
		Element m_list = document.getElementsByClass("m-list").first();
		Elements lists = m_list.getElementsByTag("li");
		System.out.println(lists.size());
		for (Element element : lists) {
			String time = element.getElementsByClass("date").first().text();
			Element ele_a = element.getElementsByTag("a").first();
			String link = BaseUrl + ele_a.attr("href");
			String title = ele_a.text();
			ZXZXEntity poZiXun = new ZXZXEntity(title, link, time);
			datas.add(poZiXun);
		}
		Map<String, Object> result = this.ajaxSuccessResponse("请求成功");
		result.put("data", datas);
		return result;
	}

	/**
	 * 撸图八卦
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/lutubagua")
	@ResponseBody
	public Object lutubagua(@RequestParam(value = "page", required = true) String page) throws IOException {
		String url = "";
		if (page.equals(InitPage)) {
			url = "http://lol.duowan.com/tag/316006859067.html";
		} else {
			url = "http://lol.duowan.com/tag/316006859067_" + page + ".html";
		}
		ArrayList<ZXZXEntity> datas = new ArrayList<ZXZXEntity>();
		Document document = Jsoup.connect(url).get();
		Element m_list = document.getElementsByClass("m-list").first();
		Elements lists = m_list.getElementsByTag("li");
		System.out.println(lists.size());
		for (Element element : lists) {
			String time = element.getElementsByClass("date").first().text();
			Element ele_a = element.getElementsByTag("a").first();
			String link = BaseUrl + ele_a.attr("href");
			String title = ele_a.text();
			ZXZXEntity poZiXun = new ZXZXEntity(title, link, time);
			datas.add(poZiXun);
		}
		Map<String, Object> result = this.ajaxSuccessResponse("请求成功");
		result.put("data", datas);
		return result;
	}

	/**
	 * 最新资讯
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/zuixinzixun")
	@ResponseBody
	public Object zuixinzixun(@RequestParam(value = "page", required = true) String page) throws IOException {
		String url = "";
		if (page.equals(InitPage)) {
			url = "http://lol.duowan.com/tag/131026281878.html";
		} else {
			url = "http://lol.duowan.com/tag/131026281878_" + page + ".html";
		}
		ArrayList<ZXZXEntity> datas = new ArrayList<ZXZXEntity>();
		Document document = Jsoup.connect(url).get();
		Element m_list = document.getElementsByClass("m-list").first();
		Elements lists = m_list.getElementsByTag("li");
		System.out.println(lists.size());
		for (Element element : lists) {
			String time = element.getElementsByClass("date").first().text();
			Element ele_a = element.getElementsByTag("a").first();
			String link = BaseUrl + ele_a.attr("href");
			String title = ele_a.text();
			ZXZXEntity poZiXun = new ZXZXEntity(title, link, time);
			datas.add(poZiXun);
		}
		Map<String, Object> result = this.ajaxSuccessResponse("请求成功");
		result.put("data", datas);
		return result;
	}

}
