package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Atm")
public class Atm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long AtmId;
	@Column(name="AtmName")
	private String AtmName;
	
	public Atm() {
		
	}
	
	
	
	
	public Atm(String atmName) {
		super();
		AtmName = atmName;
	}
	
	public Long getAtmId() {
		return AtmId;
	}
	public void setAtmId(Long atmId) {
		AtmId = atmId;
	}
	public String getAtmName() {
		return AtmName;
	}
	public void setAtmName(String atmName) {
		AtmName = atmName;
	}
	
	

}
