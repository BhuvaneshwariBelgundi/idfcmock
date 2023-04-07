package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class EmpDto {
	@Id
	private String email;
	private String pwd;
	private String name;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
