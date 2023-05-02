package hibernateProject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patients 
{
	@Id
	private int id;
	private String name;
	private int age;
	private String gender;
	private String bloodgroup;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Diseases> disease;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Encounter> encounter;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public List<Diseases> getDisease() {
		return disease;
	}
	public void setDisease(List<Diseases> disease) {
		this.disease = disease;
	}
	public List<Encounter> getEncounter() {
		return encounter;
	}
	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}
	
}
