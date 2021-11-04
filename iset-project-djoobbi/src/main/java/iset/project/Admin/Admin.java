package iset.project.Admin;

import javax.persistence.Entity; 
import javax.persistence.Id; 


@Entity
public class Admin {
		
	@Id
	private Long idadmin;
	private String login; 
	private String password;
		
		
	public Admin() {
		super();
	}
		
	public Admin(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}


	public Long getIdadmin() {
		return idadmin;
		}
	public void setIdadmin(Long idadmin) {
		this.idadmin = idadmin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [idadmin=" + idadmin + ", login=" + login + ", password=" + password + "]";
	}
		
		
		

	}

}
}

