package com.qixin.entity;

public class Major {

	private int mid;
	private String name;
	private int cid;
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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Major [mid=" + mid + ", name=" + name + ", cid=" + cid + "]";
	}
	
	
}
