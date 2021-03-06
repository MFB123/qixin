package com.qixin.service;

import java.util.HashMap;
import java.util.List;


import com.qixin.entity.ClassListPO;
import com.qixin.entity.ClassPO;
import com.qixin.entity.College;
import com.qixin.entity.Major;
import com.qixin.entity.insertStudent;
import com.qixin.entity.updaClassNamePO;
import com.qixin.entity.updaStu;

public interface stuService {
	//获取学院列表
	public List<College> getCollege();
	public College getCollegeone(int cid);
	//根据学院id 查询 专业列表
	public List<Major> getMajor(int cid);
	public Major getMajorone(int mid);
	//新增班级
	public void inserClass(ClassPO cl);
	//查询班级列表
	//public List<ClassListPO> seleClassList();
	//修改班级名字
	public void updaClassName(updaClassNamePO up);
	//获取班级列表
	public List<ClassPO> getClass(int mid);
	public ClassPO getClassone(int class_id);
	//新增学生信息
	public void inserStudent(insertStudent stu);
	//查询所在班级的学生
	//public List<insertStudent> seleClassStudent(int class_id);
	
	public ClassPO getClasstrue(int class_id);
	//查询所有学生
	//public List<insertStudent> selestu();
	//回显学生
	public insertStudent huixstu(int sid);
	//修改学生表
	public void updastudent(updaStu us);
	
	
	public void updadeleid(int class_id);
	
	//删除班级
	public void deleclass(int class_id);
	
	//查询class总条数
	public Integer seleclasscount();
	
	public List<ClassListPO> seleClassmap(Integer cpage, Integer pageSize);
	
	//查询学生总条数
	public Integer selestucount();
	public List<insertStudent> selestufeny(Integer cpage, Integer pageSize);
	public List<insertStudent> selestufeny1(Integer cpage, Integer pageSize, String mohu);
	//班级列表里的详细学生信息
	public Integer seleclasscountclass(int class_id);
	public List<insertStudent> seleClassStudents(Integer cpage, Integer pageSize, int class_id);
	//新增地区
	public void insercollege(String name);
	//新增学院
	public void inserMagor(Major m);
	//获取所有学院
	public List<com.qixin.entity.getMajor> getMajorlist();
	//删除学生
	public void delestu(int sid);
	public List<insertStudent> selestuweikong();
	//分配班级
	public void inserfenpeiclass(insertStudent i);
	//根据class_id 获取班级名字
	public ClassPO getstuclassname(Integer class_id);

}
