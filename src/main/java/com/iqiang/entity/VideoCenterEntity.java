package com.iqiang.entity;

/**
 * 视频中心实体类
 * 
 * @author anyware
 *
 */
public class VideoCenterEntity {
	private String imgUri;
	private String videoTime;
	private String zuozhe;
	private String boFangLiang;
	private String miaoShu;
	private String videoUrl;

	public VideoCenterEntity(String imgUri, String videoTime, String zuozhe, String boFangLiang, String miaoShu,
			String videoUrl) {
		super();
		this.imgUri = imgUri;
		this.videoTime = videoTime;
		this.zuozhe = zuozhe;
		this.boFangLiang = boFangLiang;
		this.miaoShu = miaoShu;
		this.videoUrl = videoUrl;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public String getVideoTime() {
		return videoTime;
	}

	public void setVideoTime(String videoTime) {
		this.videoTime = videoTime;
	}

	public String getZuozhe() {
		return zuozhe;
	}

	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}

	public String getBoFangLiang() {
		return boFangLiang;
	}

	public void setBoFangLiang(String boFangLiang) {
		this.boFangLiang = boFangLiang;
	}

	public String getMiaoShu() {
		return miaoShu;
	}

	public void setMiaoShu(String miaoShu) {
		this.miaoShu = miaoShu;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
