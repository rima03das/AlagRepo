package cmc.alag.pkg;

import com.opensymphony.xwork2.Action;

public class AlagActionOne implements Action {

	

	String username;

	
	@Override
	public String execute() throws Exception {
		System.out.println("In action one");

		if(username.equalsIgnoreCase("one")){
			return "one";
		}else{
			return "two";
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
