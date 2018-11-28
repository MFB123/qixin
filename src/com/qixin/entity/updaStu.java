package com.qixin.entity;

public class updaStu {
	private Integer sid;
	private String name; //学生姓名
	private String sex; //学生性别
	private Integer age; //学生年龄
	private String birthday;//学生生日
	private String cardid;//学生身份证号码
	private String tel;//学生手机号
	private String education;//学历
	private String parent_tel01;//家长电话
	private String parent_tel02;
	private String parent_name02;
	private String school_system;//学制 （选择6、10、16、36个月）
	private String student_class;//班级
	private String student_status;//学生状态（选择在读、休学、退学、毕业）
	private Integer mid;//专业ID
	private Integer cid;//学院ID
	private Integer class_id;//班级ID
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getParent_tel01() {
		return parent_tel01;
	}
	public void setParent_tel01(String parent_tel01) {
		this.parent_tel01 = parent_tel01;
	}
	public String getParent_tel02() {
		return parent_tel02;
	}
	public void setParent_tel02(String parent_tel02) {
		this.parent_tel02 = parent_tel02;
	}
	public String getParent_name02() {
		return parent_name02;
	}
	public void setParent_name02(String parent_name02) {
		this.parent_name02 = parent_name02;
	}
	public String getSchool_system() {
		return school_system;
	}
	public void setSchool_system(String school_system) {
		this.school_system = school_system;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	public String getStudent_status() {
		return student_status;
	}
	public void setStudent_status(String student_status) {
		this.student_status = student_status;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "updaStu [sid=" + sid + ", name=" + name + ", sex=" + sex + ", age=" + age + ", birthday=" + birthday
				+ ", cardid=" + cardid + ", tel=" + tel + ", education=" + education + ", parent_tel01=" + parent_tel01
				+ ", parent_tel02=" + parent_tel02 + ", parent_name02=" + parent_name02 + ", school_system="
				+ school_system + ", student_class=" + student_class + ", student_status=" + student_status + ", mid="
				+ mid + ", cid=" + cid + ", class_id=" + class_id + "]";
	}


	
	
}
