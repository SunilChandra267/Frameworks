package edu.jspiders.firsthibproject.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sweet_table")
public class SweetDTO implements Serializable{
	@Id
	@Column(name="sid")
	private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="price")
	private double price;
	
	@Column(name="bestbefore")
	private int bestBefore;
	
	public SweetDTO() {
		System.out.println("SweetDTO obj is created");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(int bestBefore) {
		this.bestBefore = bestBefore;
	}

	@Override
	public String toString() {
		return "SweetDTO [sid=" + sid + ", sname=" + sname + ", price=" + price + ", bestBefore=" + bestBefore + "]";
	}
	
	

}
