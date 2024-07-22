package com.spring.lotus.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private long studentId;
	private String studentName;
	private Long rollNo;
	private String qualification;
	private String course;
	private int year;
	private long hallTicketNo;
	
	@OneToMany
	@Autowired
	private College college;
	
	@OneToOne
	@Autowired
	private Certificate certificate;

	public Student() {
		super();
	}

	public Student(long studentId, String studentName, Long rollNo, String qualification, String course, int year,
			long hallTicketNo, College college, Certificate certificate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallTicketNo = hallTicketNo;
		this.college = college;
		this.certificate = certificate;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", rollNo=" + rollNo
				+ ", qualification=" + qualification + ", course=" + course + ", year=" + year + ", hallTicketNo="
				+ hallTicketNo + ", college=" + college + ", certificate=" + certificate + "]";
	}
	
}
