package com.project.sms.entity;

import java.util.Date;

import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;

@Entity
@Table(name="sms")
public class StudentEntity {
	
	@Id
//	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="fname")
	private String fname;
	@Column(name="mname")
	private String mname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	
	public StudentEntity() {}
	
	public StudentEntity(String name, String fname, String mname) {
		super();
		this.name = name;
		this.fname = fname;
		this.mname = mname;
	}
	
	
	
}





























//	@Id
//	
//	@GeneratedValue(generator = "auto")
//	
//	@Column(name = "id")
//	
//	private Long id;
//	@Column(name = "name")
//	private String name;
//	@Column(name = "fname")
//	private String fname;
//	@Column(name = "mname")
//	private String mname;
//	
	
//	@Column(name = "dob")
//	private Date dob;
//	@Column(name = "aadharNo")
//	private Long aadharNo;
//	@Column(name = "studentuniqueid")
//	private Long studentuniqueid;
//	@Column(name = "mobileNo")
//	private Long mobileNo;
//	@Column(name = "email")
//	private String email;
//	@Column(name = "standrad")
//	private String standrad;
//	@Column(name = "section")
//	private String section;
//	@Column(name = "rollNo")
//	private int rollNo;
//	@Column(name = "gender")
//	private String gender;
//	@Column(name = "nationality")
//	private String nationality;
//	@Column(name = "caste")
//	private String caste;
//	@Column(name = "address")
//	private String address;
//	@Column(name = "city")
//	private String city;
//	@Column(name = "state")
//	private String state;
//	@Column(name = "country")
//	private String country;
//	@Column(name = "pincode")
//	private Long pincode;
//	@Column(name = "bloodGroup")
//	private String bloodGroup;
//	@Column(name = "dateOfAdmission")
//	private Date dateOfAdmission;
//	@Column(name = "previousClass")
//	private String previousClass;
//	@Column(name = "mark")
//	private String mark;
	
//	public StudentEntity(String name, String fname, String mname) {
		
	
	
//	public StudentEntity(String name, String fname, String mname, Date dob, Long aadharNo, Long studentuniqueid,
//			Long mobileNo, String email, String standrad, String section, int rollNo, String gender, String nationality,
//			String caste, String address, String city, String state, String country, Long pincode, String bloodGroup,
//			Date dateOfAdmission, String previousClass, String mark) {
//		super();
//		this.name = name;
//		this.fname = fname;
//		this.mname = mname;
//		this.dob = dob;
//		this.aadharNo = aadharNo;
//		this.studentuniqueid = studentuniqueid;
//		this.mobileNo = mobileNo;
//		this.email = email;
//		this.standrad = standrad;
//		this.section = section;
//		this.rollNo = rollNo;
//		this.gender = gender;
//		this.nationality = nationality;
//		this.caste = caste;
//		this.address = address;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//		this.pincode = pincode;
//		this.bloodGroup = bloodGroup;
//		this.dateOfAdmission = dateOfAdmission;
//		this.previousClass = previousClass;
//		this.mark = mark;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getFname() {
//		return fname;
//	}
//
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//
//	public String getMname() {
//		return mname;
//	}
//
//	public void setMname(String mname) {
//		this.mname = mname;
//	}
//
//	public Date getDob() {
//		return dob;
//	}
//
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//
//	public Long getAadharNo() {
//		return aadharNo;
//	}
//
//	public void setAadharNo(Long aadharNo) {
//		this.aadharNo = aadharNo;
//	}
//
//	public Long getStudentuniqueid() {
//		return studentuniqueid;
//	}
//
//	public void setStudentuniqueid(Long studentuniqueid) {
//		this.studentuniqueid = studentuniqueid;
//	}
//
//	public Long getMobileNo() {
//		return mobileNo;
//	}
//
//	public void setMobileNo(Long mobileNo) {
//		this.mobileNo = mobileNo;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getStandrad() {
//		return standrad;
//	}
//
//	public void setStandrad(String standrad) {
//		this.standrad = standrad;
//	}
//
//	public String getSection() {
//		return section;
//	}
//
//	public void setSection(String section) {
//		this.section = section;
//	}
//
//	public int getRollNo() {
//		return rollNo;
//	}
//
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
//
//	public String getCaste() {
//		return caste;
//	}
//
//	public void setCaste(String caste) {
//		this.caste = caste;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public Long getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(Long pincode) {
//		this.pincode = pincode;
//	}
//
//	public String getBloodGroup() {
//		return bloodGroup;
//	}
//
//	public void setBloodGroup(String bloodGroup) {
//		this.bloodGroup = bloodGroup;
//	}
//
//	public Date getDateOfAdmission() {
//		return dateOfAdmission;
//	}
//
//	public void setDateOfAdmission(Date dateOfAdmission) {
//		this.dateOfAdmission = dateOfAdmission;
//	}
//
//	public String getPreviousClass() {
//		return previousClass;
//	}
//
//	public void setPreviousClass(String previousClass) {
//		this.previousClass = previousClass;
//	}
//
//	public String getMark() {
//		return mark;
//	}
//
//	public void setMark(String mark) {
//		this.mark = mark;
//	}
//	
	


