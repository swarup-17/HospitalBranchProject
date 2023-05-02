package hibernateProject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospitals
{
	@Id
	private int id;
	@Column(unique = true)
	private String name;
	private String ceo;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Branches> branch;

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

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public List<Branches> getBranch() {
		return branch;
	}

	public void setBranch(List<Branches> branch) {
		this.branch = branch;
	}
	
	
}
