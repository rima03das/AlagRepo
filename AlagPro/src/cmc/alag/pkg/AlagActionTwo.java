package cmc.alag.pkg;

import com.opensymphony.xwork2.Action;

public class AlagActionTwo implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("Inaction two");
		return "Ok";
	}

}
