package com.example.hibernate;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable{

	 private int id;
	 private String title;
	 private String body;
	 
	 public int getId() {
	 	return id;
	 }
	 public void setId(int Id) {
	 	this.id =Id;
	 }
	 public String getTitle() {
	 	return title;
	 }
	 public void setTitle(String Title) {
	 	this.title = Title;
	 }
         public String getBody() {
	 	return body;
	 }
	 public void setBody(String Body) {
	 	this.body = Body;
	 }
// public String getBody() {
// return createdBy;
// }
// public void setBody(String body) {
// this.createdBy = createdBy;
// }
 
}
