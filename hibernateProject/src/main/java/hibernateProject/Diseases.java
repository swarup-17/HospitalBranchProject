package hibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diseases 
{
	@Id
	private int id;
	private String dname;
	private String symptoms;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	
}
