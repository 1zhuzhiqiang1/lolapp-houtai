package com.iqiang.entity;

public class VideoItem {
	private String status;
	private Msg msg;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Msg getMsg() {
		return msg;
	}
	public void setMsg(Msg msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "VideoItem [status=" + status + ", msg=" + msg + "]";
	}
	
}
