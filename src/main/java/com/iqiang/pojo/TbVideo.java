package com.iqiang.pojo;

public class TbVideo {
    private Long id;

    private String imgUri;

    private String videoTime;

    private String zuozhe;

    private String boFangLiang;

    private String miaoShu;

    private String videoUrl;

    public TbVideo() {
		super();
	}

	public TbVideo(Long id, String imgUri, String videoTime, String zuozhe, String boFangLiang, String miaoShu,
			String videoUrl) {
		super();
		this.id = id;
		this.imgUri = imgUri;
		this.videoTime = videoTime;
		this.zuozhe = zuozhe;
		this.boFangLiang = boFangLiang;
		this.miaoShu = miaoShu;
		this.videoUrl = videoUrl;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri == null ? null : imgUri.trim();
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime == null ? null : videoTime.trim();
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe == null ? null : zuozhe.trim();
    }

    public String getBoFangLiang() {
        return boFangLiang;
    }

    public void setBoFangLiang(String boFangLiang) {
        this.boFangLiang = boFangLiang == null ? null : boFangLiang.trim();
    }

    public String getMiaoShu() {
        return miaoShu;
    }

    public void setMiaoShu(String miaoShu) {
        this.miaoShu = miaoShu == null ? null : miaoShu.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }
}