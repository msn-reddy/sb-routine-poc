package narayan.sbroutine.jpacrud.app.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "ALPHA")
public class Alpha {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Double salary;

	private Date dob;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
