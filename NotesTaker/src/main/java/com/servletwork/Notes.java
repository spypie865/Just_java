package com.servletwork;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Note_id")
private int nid;
private String title;
@Column(name="description" , length=1500)
private String contant ;
private Date adddate;
public Notes() {
	super();
	// TODO Auto-generated constructor stub
}
public Notes( String title, String contant, Date adddate) {
	super();
	
	this.title = title;
	this.contant = contant;
	this.adddate = adddate;
}
public int getNid() {
	return nid;
}
public void setNid(int nid) {
	this.nid = nid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContant() {
	return contant;
}
public void setContant(String contant) {
	this.contant = contant;
}
public Date getAdddate() {
	return adddate;
}
public void setAdddate(Date adddate) {
	this.adddate = adddate;
}

}
