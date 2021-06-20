package com.demo.employeeexpense.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "EXPENSES")
public class Expenses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "CREATE_TIME")
	private Date submitDate;

	private int employeeId;
	private String itemType;
	private String type;
	@Embedded
	private Amount amount;

	@Column(columnDefinition = "TEXT")
	private String description;
	private String status;

	@PrePersist
	protected void onCreate() {
		submitDate = new Date();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(final int employeeId) {
		this.employeeId = employeeId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(final String itemType) {
		this.itemType = itemType;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(final Amount amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

}
