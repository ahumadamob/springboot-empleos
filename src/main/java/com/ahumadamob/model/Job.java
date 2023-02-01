package com.ahumadamob.model;

import java.util.Date;

public class Job {
	private Integer id;
	private String title;
	private String description;
	private Date postDate;
	private double salary;
	private boolean active;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", description=" + description + ", postDate=" + postDate
				+ ", salary=" + salary + ", active=" + active + "]";
	}	

}
