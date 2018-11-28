package com.qixin.entity;

public class getMajor {
	private int mid;
	private String name;
	private String tname;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "getMajor [mid=" + mid + ", name=" + name + ", tname=" + tname + "]";
	}
	
}
