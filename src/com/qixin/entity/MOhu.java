package com.qixin.entity;

public class MOhu {
	private int index;
	private int pageSize;
	private String muhu;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getMuhu() {
		return muhu;
	}
	public void setMuhu(String muhu) {
		this.muhu = muhu;
	}
	
	public MOhu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MOhu(int index, int pageSize, String muhu) {
		super();
		this.index = index;
		this.pageSize = pageSize;
		this.muhu = muhu;
	}
	@Override
	public String toString() {
		return "mohu [index=" + index + ", pageSize=" + pageSize + ", muhu=" + muhu + "]";
	}
	
}
