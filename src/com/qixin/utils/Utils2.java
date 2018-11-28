package com.qixin.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Utils2 {
	public static void getPage(HttpServletRequest request,int cpage,int pageSize,int count,List<?> list,String url){
		//计算总页数
		int tpage=(count/pageSize)+(count%pageSize==0?0:1);
		String first="";
		String prev="";
		String next="";
		String last="";
		//url传参标记
		String flag = url.indexOf("?") > -1 ? "&" : "?";
		
		if(cpage==1){
			first="首页";
			prev="上一页";
		}else{
			first="<a href='"+request.getContextPath()+"/"+url+flag+"cpage=1'>首页</a>";
			prev="<a href='"+request.getContextPath()+"/"+url+flag+"cpage="+(cpage-1)+"'>上一页</a>";
		}
		
		
		if(cpage==tpage){
			next="下一页";
			last="尾页";
		}else{
			next="<a href='"+request.getContextPath()+"/"+url+flag+"cpage="+(cpage+1)+"'>下一页</a>";
			last="<a href='"+request.getContextPath()+"/"+url+flag+"cpage="+tpage+"'>末页</a>";

		}
		
		//把总页数放到作用域
		request.setAttribute("tpage1", tpage);
		//把cpage放到作用域
		request.setAttribute("cpage1", cpage);
	
		//把list放在作用域
		request.setAttribute("list1", list);
		
	/*	request.setAttribute("first", first);
		request.setAttribute("prev", prev);
		request.setAttribute("next", next);
		request.setAttribute("last", last);*/
		
		
		request.setAttribute("page1", first+" "+prev+" "+next+" "+last);
	}
}
