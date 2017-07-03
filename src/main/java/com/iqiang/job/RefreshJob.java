package com.iqiang.job;

/**
 * 每天定时请求三次数据，保存到数据库。0 8 16 24
 * @author anyware
 *
 */
public class RefreshJob {

	public void excute(){
		System.out.println("任务开始执行");
	}
	
	// 获取版本更新的内容
	private void pullBanBenGengXin(){
		
	}
	
	// 获取电竞新闻的内容
	private void pullDianJingXinWen(){
		
	}
	
	// 撸图八卦
	private void pullLuTuBaGua(){
		
	}
	
	// 最新资讯
	private void pullZuiXinZiXun(){
		
	}
}
