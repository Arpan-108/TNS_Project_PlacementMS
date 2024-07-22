package com.spring.lotus.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Certificate {

	@Id
	private long certificateId;
	private int yearOfGraduation;
	
	@OneToMany
	@Autowired
	private College college;

	public Certificate() {
		super();
	}

	public Certificate(long certificateId, int yearOfGraduation, College college) {
		super();
		this.certificateId = certificateId;
		this.yearOfGraduation = yearOfGraduation;
		this.college = college;
	}

	public long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(long certificateId) {
		this.certificateId = certificateId;
	}

	public int getYearOfGraduation() {
		return yearOfGraduation;
	}

	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", yearOfGraduation=" + yearOfGraduation + ", college="
				+ college + "]";
	}
		
}
