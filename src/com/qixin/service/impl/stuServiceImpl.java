package com.qixin.service.impl;
import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qixin.dao.stuDao;
import com.qixin.entity.ClassListPO;
import com.qixin.entity.ClassPO;
import com.qixin.entity.College;
import com.qixin.entity.MOhu;
import com.qixin.entity.Major;
import com.qixin.entity.insertStudent;
import com.qixin.entity.updaClassNamePO;
import com.qixin.entity.updaStu;
import com.qixin.service.stuService;

@Service
@Transactional
public class stuServiceImpl implements stuService{

	@Autowired
	private stuDao dao;
	
	
	
	@Override
	public List<College> getCollege() {//获取学院列表
		return dao.getCollege();
	}



	@Override
	public List<Major> getMajor(int cid) {//根据学院id 查询 专业列表
	
		return dao.getMajor(cid);
	}



	@Override
	public void inserClass(ClassPO cl) { //新增班级
		dao.inserClass(cl);	
	}



	/*@Override
	public List<ClassListPO> seleClassList() {//查询班级列表
		

		return dao.seleClassList();
	}
*/


	@Override
	public void updaClassName(updaClassNamePO up) {//修改班级名字

		dao.updaClassName(up);
		
	}



	@Override
	public List<ClassPO> getClass(int mid) {//获取班级列表
		return dao.getClass(mid);
	}



	@Override
	public void inserStudent(insertStudent stu) {
		dao.inserStudent(stu);
		
	}



	/*@Override
	public List<insertStudent> seleClassStudent(int class_id) {
		
		return dao.seleClassStudent(class_id);
	}*/



	@Override
	public ClassPO getClasstrue(int class_id) { //
		// TODO Auto-generated method stub
		return dao.getClasstrue(class_id);
	}



	/*@Override
	public List<insertStudent> selestu() {
		
		return dao.selestu();
	}

*/

	@Override
	public insertStudent huixstu(int sid) {

		return dao.huixstu(sid);
	}



	@Override
	public College getCollegeone(int cid) {
		// TODO Auto-generated method stub
		return dao.getCollegeone(cid);
	}



	@Override
	public Major getMajorone(int mid) {
		// TODO Auto-generated method stub
		return dao.getMajorone(mid);
	}



	@Override
	public ClassPO getClassone(int class_id) {
		// TODO Auto-generated method stub
		return dao.getClassone(class_id);
	}



	@Override
	public void updastudent(updaStu us) {
		// TODO Auto-generated method stub
		dao.updastudent(us);
	}



	@Override
	public void updadeleid(int class_id) {
		// TODO Auto-generated method stub
		dao.updadeleid(class_id);
	}



	@Override
	public void deleclass(int class_id) {
		// TODO Auto-generated method stub
		dao.deleclass(class_id);
	}



	@Override
	public Integer seleclasscount() {
		// TODO Auto-generated method stub
		return dao.seleclasscount();
	}



	@Override
	public List<ClassListPO> seleClassmap(Integer cpage, Integer pageSize) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("index", (cpage-1)*pageSize);
		map.put("pageSize",pageSize);

		return dao.seleclassmap(map);
	}



	@Override
	public Integer selestucount() {
		// TODO Auto-generated method stub
		return dao.selestucount();
	}



	@Override
	public List<insertStudent> selestufeny(Integer cpage, Integer pageSize) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("index", (cpage-1)*pageSize);
		map.put("pageSize",pageSize);
		return dao.selestufeny(map);
	}



	@Override
	public Integer seleclasscountclass(int class_id) {
		
		return dao.seleclasscountclass(class_id);
	}



	@Override
	public List<insertStudent> seleClassStudents(Integer cpage, Integer pageSize, int class_id) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("index", (cpage-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("class_id", class_id);
		return dao.selestufenyeClass(map);
	}

	/*@Override
	public List<insertStudent> selestufeny(Integer cpage, Integer pageSize) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("index", (cpage-1)*pageSize);
		map.put("pageSize",pageSize);
		return dao.selestufeny(map);
	}
*/
	@Override
	public List<insertStudent> selestufeny1(Integer cpage, Integer pageSize, String mohu) {
		//mohu m = 
		MOhu m= new MOhu();
	
		m.setIndex((cpage-1)*pageSize);
		m.setPageSize(pageSize);
		m.setMuhu(mohu);

		return dao.selestufeny1(m);
	}



	@Override
	public void insercollege(String name) {
		// TODO Auto-generated method stub
		dao.insercollege(name);
	}



	@Override
	public void inserMagor(Major m) {
		// TODO Auto-generated method stub
		dao.inserMagor(m);
	}



	@Override
	public List<com.qixin.entity.getMajor> getMajorlist() {
		return dao.getMajorlist();
	}



	@Override
	public void delestu(int sid) {
		// TODO Auto-generated method stub
		dao.delestu(sid);
	}



	@Override
	public List<insertStudent> selestuweikong() {
		// TODO Auto-generated method stub
		return dao.selestuweikong();
	}



	@Override
	public void inserfenpeiclass(insertStudent i) {
		// TODO Auto-generated method stub
		dao.inserfenpeiclass(i);
	}



	@Override
	public ClassPO getstuclassname(Integer class_id) {
		// TODO Auto-generated method stub
		return dao.getstuclassname(class_id);
	}






	
	
	
	
	
	
}
