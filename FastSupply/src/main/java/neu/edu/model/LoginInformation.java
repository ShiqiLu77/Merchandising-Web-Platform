package neu.edu.model;

import javax.persistence.Entity;


@Entity
public class LoginInformation {
	
//	private Integer id;
//	private String firstname;
	private String username;
	private String password;

	
	public LoginInformation() {
		super();
	}

//	public LoginInformation(Integer id, String username, String password, String firstname) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.firstname = firstname;
//	}

	public LoginInformation(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getFirstname() {
//		return firstname;
//	}
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	


}
