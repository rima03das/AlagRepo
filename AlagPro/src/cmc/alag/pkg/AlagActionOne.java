package cmc.alag.pkg;

import com.opensymphony.xwork2.Action;

public class AlagActionOne implements Action {

	
	
	@Override
	public String execute() throws Exception {
		System.out.println("In action one");

		return "one";
	}
}
