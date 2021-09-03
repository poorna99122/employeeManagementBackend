package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;









@Entity
@Table(name = "Users")
public class Users {
	
	
	public Users() {
		
	}
	
	
	
	public Users(long userId, String entitycode, String branchCode, String firstName, String middleName,
			String lastName, String dob, long mobileNumber, String emialId, String status, String regMode) {
		super();
		this.userId = userId;
		this.entitycode = entitycode;
		this.branchCode = branchCode;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobileNumber = mobileNumber;
		this.emialId = emialId;
		this.status = status;
		this.regMode = regMode;
	}
	
	
	
	
	
	@Id
	@Column(name="userid")
	private long userId;
	@Column(name="entityCode")
	private String entitycode;
	@Column(name="branchcode")
	private String branchCode;
	@Column(name="firstname")
	private String firstName;
	@Column(name="middlename")
	private String middleName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="dob")
	private String dob;
	@Column(name="mobilenumber")
	private long mobileNumber;
	@Column(name="emialid")
	private String emialId;
	@Column(name="status")
	private String status;
	@Column(name="regmode")
	private String regMode;
	
	
	
	
	
	
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getEntitycode() {
		return entitycode;
	}
	public void setEntitycode(String entitycode) {
		this.entitycode = entitycode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmialId() {
		return emialId;
	}
	public void setEmialId(String emialId) {
		this.emialId = emialId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRegMode() {
		return regMode;
	}
	public void setRegMode(String regMode) {
		this.regMode = regMode;
	}
	
	
	

}
