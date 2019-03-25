package com.zpx.itl.pojo;

import java.util.List;

/**
 * 
 * @author ZPX
 *
 */

public class Information {

	private String snumber; //学号
	private String name; //姓名
	private String sex; //性别
	private String specialty; //专业
	private String department; //部门
	private String tel; //手机号
	private String skill; //专业技能描述
	private String describes; //自我能力描述
	private String uid;
	
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
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
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getDescribes() {
		return describes;
	}
	public void setDescribes(String describes) {
		this.describes = describes;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "InfoList [snumber=" + snumber + ", name=" + name + ", sex=" + sex + ", specialty=" + specialty
				+ ", department=" + department + ", tel=" + tel + ", skill=" + skill + ", describes=" + describes
				+ ", uid=" + uid + "]";
	}
	
}