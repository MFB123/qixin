package com.qixin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qixin.entity.ClassListPO;
import com.qixin.entity.ClassPO;
import com.qixin.entity.College;
import com.qixin.entity.Major;
import com.qixin.entity.getMajor;
import com.qixin.entity.insertStudent;
import com.qixin.entity.updaClassNamePO;
import com.qixin.entity.updaStu;
import com.qixin.service.stuService;
import com.qixin.utils.Utils;
import com.qixin.utils.Utils2;

@Controller
public class stuController {

	@Autowired
	private stuService stuser;
	
	
	@RequestMapping("zhong") // 跳转教务
	public String zhong() {
		
		return "view/zhong";
	}
	
	@RequestMapping("ind") // 跳转教务
	public String ind() {
		
		return "view/ind";
	}

	@RequestMapping("banj") // 跳转教务
	public String banj() {
		return "view/banj";
	}

	// 跳转学院 选择所属院校
	@RequestMapping("classmanage")
	public String classmanage() {
		System.out.println("正在跳转！！！");
		return "view/College";
	}

	@RequestMapping("getCollege")
	@ResponseBody
	public List<College> getCollege() {// 获取学院列表 传到前台

		return stuser.getCollege();
	}

	// 获取 到学院的id 在跳转专业页面 选择专业 和新增班级
	/*@RequestMapping("tomajor")
	public String tomajor(int cid) {
		System.out.println("正在跳转专业！！！");
		// System.out.println("cid:"+cid);
		return "view/major";
	}
*/
	@RequestMapping("getMajor") // 根据 页面传的cid 查询专业列表 传到前台
	@ResponseBody
	public List<Major> getCollege(int cid) {
		System.out.println("-------------cid:" + cid);
		return stuser.getMajor(cid);
	}

	@RequestMapping("inserClass")
	public String inserClass(ClassPO cl) {// 班级新增

		System.out.println(cl.toString());
		// System.out.println("cid:"+cid);
		stuser.inserClass(cl);
		System.out.println("新增成功！！！");
		return "view/ind";
	}

/*	@RequestMapping("classlist")
	public String classlist(HttpServletRequest ht) {// 班级列表查询
		List<ClassListPO> list = stuser.seleClassList();
		System.out.println(list.toString());
		ht.setAttribute("list", list);
		return "view/classlist";
	}*/
	
	@RequestMapping("classlist")
	public String classlist(@RequestParam(defaultValue="1") Integer cpage, HttpServletRequest request) {// 班级列表查询 分页
		Integer pageSize=5;
		
		List<ClassListPO> list = stuser.seleClassmap(cpage,pageSize);
		
		Integer count = stuser.seleclasscount();
		
		String url="classlist.do";
		Utils.getPage(request, cpage, pageSize, count, list, url);
		return "view/classlist";
	}
	
	

	@RequestMapping("classDetails")
	public String classDetails(@RequestParam(defaultValue="1")Integer cpage,int class_id, String classname, HttpServletRequest request) {// 班级详情信息
		Integer pageSize=5;
		List<insertStudent> list = stuser.seleClassStudents(cpage,pageSize,class_id);
		
		Integer count = stuser.seleclasscountclass(class_id);
		String url="classDetails.do?class_id="+class_id+"&classname="+classname;
Utils.getPage(request, cpage, pageSize, count, list, url);
		return "view/classDetails";
	}

	@RequestMapping("toupdaclass")
	public String toupdaclass(int class_id, String classname) {// 修改班级名字
		// System.out.println("classid:"+class_id+","+classname);
		return "view/updaclassname";
	}

	@RequestMapping("updaclassname")
	public String updaclassname(updaClassNamePO up) {// 修改班级名字int class_id,String classname
		System.out.println(up.toString());
		stuser.updaClassName(up);
		return "redirect:classlist.do";
	}


	@RequestMapping("xues")
	public String xues(@RequestParam(defaultValue="1") Integer cpage,HttpServletRequest request) {// 跳转学生页面 进行添加和修改学生信息  分页
	

		System.out.println("12312312------------3123123123");
		
		Integer pageSize = 5;
		
		List<insertStudent> list = stuser.selestufeny(cpage,pageSize);
		System.out.println("list:"+list.toString());
		Integer count = stuser.selestucount();
		String url="xues.do";
		List<insertStudent> weuk = stuser.selestuweikong();
		Utils.getPage(request, cpage, pageSize, count, list, url);

	request.setAttribute("weuk", weuk);
	System.out.println("weuk:"+weuk.toString());
	
		return "view/xues";
	}
	@RequestMapping("xues1")
	public String xues1(@RequestParam(defaultValue="1") Integer cpage,String mohu, HttpServletRequest request) {// 跳转学生页面 进行添加和修改学生信息  分页
	System.out.println("12312312312312 ");
		System.out.println("mohu："+mohu);
		
		Integer pageSize = 5;
		
		List<insertStudent> list = stuser.selestufeny1(cpage,pageSize,mohu);
	
		Integer count = stuser.selestucount();
		String url="xues.do";
		Utils.getPage(request, cpage, pageSize, count, list, url);
		
		return "view/xues";
	}
	
	

	@RequestMapping("toinserStudent")
	public String toinserStudent() {// 跳转学生添加页面

		return "view/inserStudent";
	}

	@RequestMapping("inserStudent")
	public String inserStudent(insertStudent stu) {// 新增学生信息

	System.out.println(stu);
	Integer Class_id= stu.getClass_id();
	 if(Class_id !=0) { 
		 ClassPO cp =stuser.getClasstrue(Class_id);
		 String name = cp.getName(); 
		 stu.setStudent_class(name);

		 stuser.updadeleid(Class_id); 
		 System.out.println("新增完成！！！！"+stu);
	 }
	 System.out.println("cid:"+stu.getCid()+", mid"+stu.getMid()+", classid"+stu.getClass_id());
	 stuser.inserStudent(stu);
//System.out.println("xhid:"+xhid+"name:"+name);
		/*
, String birthday, String cardid, String tel,
			String education, String parent_tel01, String parent_name01, String parent_tel02, String parent_name02,
			String school_system, String enrolment_time, String student_class, int mid, int cid, int class_id



		 * System.out.println(stu.toString()); Integer Class_id= stu.getClass_id();
		 * System.out.println("classid:"+Class_id); if(Class_id !=null) { ClassPO cp =
		 * stuser.getClasstrue(Class_id);
		 * 
		 * String name = cp.getName(); stu.setStudent_class(name); //
		 * stuser.inserStudent(stu);
		 * 
		 * // stuser.updadeleid(Class_id); System.out.println("新增完成！！！！"+stu);
		 */

		return "redirect:xues.do";
	}

	@RequestMapping("stuGetCollege")
	@ResponseBody
	public List<College> stuGetCollege() { // 获取学院

		return stuser.getCollege();
	}

	@RequestMapping("stuGetMajor")
	@ResponseBody
	public List<Major> stuGetMajor(int cid) { // 根据学院id获取专业

		return stuser.getMajor(cid);
	}

	@RequestMapping("stuGetClass")
	@ResponseBody
	public List<ClassPO> stuGetClass(int mid) { // 根据学院id获取专业

		return stuser.getClass(mid);
	}

	@RequestMapping("deleclass")
	public String deleclass(int class_id) { // 删除班级

		ClassPO po = stuser.getClasstrue(class_id);

		String deleid = po.getDeleid();
		if ("0".equals(deleid)) {
			stuser.deleclass(class_id);
		} else {
			return "view/eree";

		}
		System.out.println("deleid" + deleid);

		return "redirect:classlist.do";
	}

	@RequestMapping("ridlist")
	public String ridlist() {
		return "redirect:classlist.do";
	}

	@RequestMapping("updastu")
	public String toupdastu(int sid, HttpServletRequest ht) { // 回显学生

		System.out.println("sid:" + sid);

		insertStudent in = stuser.huixstu(sid);
		ht.setAttribute("stu", in);
		if(in.getClass_id()!=null) {
			int cid = in.getCid();
			int mid = in.getMid();
			System.out.println("cid:"+in.getCid());
			College college = stuser.getCollegeone(cid);
			System.out.println(college.getName());
			ht.setAttribute("college", college);
			
			Major majorone = stuser.getMajorone(mid);
			ht.setAttribute("majorone", majorone);

			int class_id = in.getClass_id();

			ClassPO classs = stuser.getClassone(class_id);
			ht.setAttribute("classs", classs);
			
			return "view/updaStudent";
			
		}else if(in.getClass_id()==null) {

				College college =new College();
				college.setCid(0); college.setName("-请选择-");
			ht.setAttribute("college", college);
			
			
			
			Major majorone = new Major();
			majorone.setMid(0);majorone.setName("-请选择-");
			ht.setAttribute("majorone", majorone);

			ClassPO classs =new ClassPO();
			classs.setClass_id(0);classs.setName("-请选择-");
			
			ht.setAttribute("classs", classs);
			
			return "view/updaStudent";
		}
		
		return "view/updaStudent";
	}

	@RequestMapping("updastudent")
	public String updastu(updaStu us) { // 修改学生

		int Class_id = us.getClass_id();
		if(Class_id!=0) {
			ClassPO cp = stuser.getClasstrue(Class_id);
			String name = cp.getName();
			us.setStudent_class(name);
			// System.out.println(us);
			//System.out.println(us.toString());
			stuser.updadeleid(Class_id);
		}	
	System.out.println(us);
System.out.println(Class_id);
		stuser.updastudent(us);
		
		return "redirect:xues.do";
	}

	@RequestMapping("fanhui")
	public String fanhui() {

		return "redirect:banj.do";
	}

	@RequestMapping("fanhuilist")
	public String fanhuilist() {

		return "redirect:classlist.do";
	}

	@RequestMapping("fanhuiind")
	public String fanhuiind() {

		return "redirect:ind.do";
	}
	
	@RequestMapping("diqu")
	public String diqu() {

		return "view/diqu";
	}
	
	@RequestMapping("toinsercollege.do")
	public String toinserdiqu() {

		return "view/toinsercollege";
	}
	
	@RequestMapping("collegelist.do")
	public String collegelist(HttpServletRequest ht) {
		List<College> college = stuser.getCollege();
		ht.setAttribute("list", college);
		return "view/toselecollege";
	}
	@RequestMapping("insercollege")
	public String inserdiqu(String name) {
		System.out.println(name);
		stuser.insercollege(name);
		return "redirect:ind.do";
	}
	
	
	@RequestMapping("xuey")
	public String xuey() {

		return "view/xuey";
	}
	

		@RequestMapping("toinsermagor")
		public String toinsermagor() {

			return "view/insermagor";
		}
		
		@RequestMapping("insermagor")
		public String insermagor(Major m) {
				System.out.println(m.toString());
				stuser.inserMagor(m);
			return "view/xuey";
		}
		
			@RequestMapping("magorlist")
		public String magorlist(HttpServletRequest ht) {
		List<getMajor> mag=stuser.getMajorlist();

			ht.setAttribute("list", mag);
			return "view/magorlist";
		}
			
			
				
				@RequestMapping("delestu")
			public String delestu(int sid) {
			System.out.println("sid"+sid);
			stuser.delestu(sid);
			
				return "redirect:xues.do";
			}	
				
				
				@RequestMapping("tofenpeiclass")
				public String tofenpeiclass(int sid) {
			System.out.println("--前往分配班级页面--");
			System.out.println("sid"+sid);
					return "view/fenpeiclass";
				}	
				
				
				
				@RequestMapping("fenpeiclass")
				public String fenpeiclass(insertStudent i) {
					
					Integer class_id = i.getClass_id();
					ClassPO classname=stuser.getstuclassname(class_id);
			System.out.println("--正在分配班级页面--");
			i.setStudent_class(classname.getName());
			stuser.inserfenpeiclass(i);
			System.out.println("fenpeiclass"+i.toString());
					return "redirect:xues.do";
				}	
				
				
				
				
}
