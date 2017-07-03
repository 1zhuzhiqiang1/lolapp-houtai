package com.iqiang.utils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;

public class HtmlunitClient {
	private static WebClient webClient = null;

	public static WebClient getInstance() {
		BrowserVersion bv = BrowserVersion.CHROME;
		// 设置语言，否则不知道传过来是什么编码
		bv.setUserLanguage("zh_cn");
		bv.setSystemLanguage("zh_cn");
		bv.setBrowserLanguage("zh_cn");
		// 源码里是写死Win32的，不知道到生产环境（linux）会不会变，稳妥起见还是硬设
		bv.setPlatform("Win32");
		webClient = new WebClient(bv);
		webClient.getOptions().setUseInsecureSSL(true); // 允许使用不安全的SSL连接。如果不打开，站点证书过期的https将无法访问
		webClient.getOptions().setJavaScriptEnabled(true); // 启用JS解释器
		webClient.getOptions().setCssEnabled(false); // 禁用css支持
		// 禁用一些异常抛出
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);

		webClient.getOptions().setDoNotTrackEnabled(false); // 随请求发送DoNotTrack
		webClient.setJavaScriptTimeout(1000); // 设置JS超时，这里是1s
		webClient.getOptions().setTimeout(5000); // 设置连接超时时间 ，这里是5s。如果为0，则无限期等待
		webClient.setAjaxController(new NicelyResynchronizingAjaxController()); // 设置ajax控制器
		return webClient;
	}
}
