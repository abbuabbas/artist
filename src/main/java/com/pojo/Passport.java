 package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {
	@GeneratedValue
	@Id
	@Column(name="passportid")
	private String id;
	@Column
	private String name;
	@Column
	private String passportnumber;
	@Column
	private String issuedate;
	//@Column
//	//private String validupto;
//@Column
	//private String placeofissue;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassportnumbear() {
		return passportnumber;
	}
	public void setPassportnumbear(String passportnumbear) {
		this.passportnumber = passportnumbear;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	/*public String getValidupto() {
		return validupto;
	}
	public void setValidupto(String validupto) {
		this.validupto = validupto;
	}
	*/public String getPlaceofissue() {
		return placeofissue;
	}
	public void setPlaceofissue(String placeofissue) {
		this.placeofissue = placeofissue;
	}
	private String placeofissue;
	

}
