package com.iqiang.entity;

public class Wpvlist {
	private String id;
	private String vid;
	private String type;
	private String hero;
	private String authorid;
	private String author;
	private String authorImg;
	private String title;
	private String url;
	private String appurl;
	private String thumb;
	private String appthumb;
	private String time;
	private String play;
	private String comment;
	private String pubdate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getAuthorid() {
		return authorid;
	}
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthorImg() {
		return authorImg;
	}
	public void setAuthorImg(String authorImg) {
		this.authorImg = authorImg;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAppurl() {
		return appurl;
	}
	public void setAppurl(String appurl) {
		this.appurl = appurl;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getAppthumb() {
		return appthumb;
	}
	public void setAppthumb(String appthumb) {
		this.appthumb = appthumb;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPlay() {
		return play;
	}
	public void setPlay(String play) {
		this.play = play;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	@Override
	public String toString() {
		return "Wpvlist [id=" + id + ", vid=" + vid + ", type=" + type + ", hero=" + hero + ", authorid=" + authorid
				+ ", author=" + author + ", authorImg=" + authorImg + ", title=" + title + ", url=" + url + ", appurl="
				+ appurl + ", thumb=" + thumb + ", appthumb=" + appthumb + ", time=" + time + ", play=" + play
				+ ", comment=" + comment + ", pubdate=" + pubdate + "]";
	}
	
}