package com.iqiang.entity;

import java.util.List;

public class Msg {
	private List<Newlist> newlist;
	private List<Tpvlist> tpvlist;
	private List<Wpvlist> wpvlist;
	private List<Mpvlist> mpvlist;
	public List<Newlist> getNewlist() {
		return newlist;
	}
	public void setNewlist(List<Newlist> newlist) {
		this.newlist = newlist;
	}
	public List<Tpvlist> getTpvlist() {
		return tpvlist;
	}
	public void setTpvlist(List<Tpvlist> tpvlist) {
		this.tpvlist = tpvlist;
	}
	public List<Wpvlist> getWpvlist() {
		return wpvlist;
	}
	public void setWpvlist(List<Wpvlist> wpvlist) {
		this.wpvlist = wpvlist;
	}
	public List<Mpvlist> getMpvlist() {
		return mpvlist;
	}
	public void setMpvlist(List<Mpvlist> mpvlist) {
		this.mpvlist = mpvlist;
	}
	@Override
	public String toString() {
		return "Msg [newlist=" + newlist + ", tpvlist=" + tpvlist + ", wpvlist=" + wpvlist + ", mpvlist=" + mpvlist
				+ "]";
	}
	
}
