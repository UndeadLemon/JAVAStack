package com.codingdojo.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min= 1, max = 20, message="Expense name must be longer than 1 character")
	private String name;
	
	@NotNull
	@Size(min=1, max=20, message="Vendor name must be longer than 1 character")
	private String vendor;
	
	@Min(value=0, message="Cost cannot be 0")
	@NotNull
	private double cost;
	
	@NotNull
	@Size(min=1, message="Description cannot be blank")
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Expense() {}
	
	public Expense(@NotNull
			@Size(min= 1, max = 20, message="Expense name must be longer than 1 character") String name, 	@NotNull
			@Size(min=1, max=20, message="Vendor name must be longer than 1 character") String vendor, 	@Min(value=0, message="Cost cannot be 0")
	@NotNull double cost ) {
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
	}
	
	public Expense(Long id, @NotNull
			@Size(min= 1, max = 20, message="Expense name must be longer than 1 character") String name, 	@NotNull
			@Size(min=1, max=20, message="Vendor name must be longer than 1 character") String vendor, 	@Min(value=0, message="Cost cannot be 0")
	@NotNull double cost ) {
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
	}
	
}
