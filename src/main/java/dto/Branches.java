package dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branches
{
	@Id
	private int id;
	private String name;
	private String manager;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address addres;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Patients> patient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}

	public List<Patients> getPatient() {
		return patient;
	}

	public void setPatient(List<Patients> patient) {
		this.patient = patient;
	}
	
	
}
