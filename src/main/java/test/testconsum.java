package test;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.Project;
import services.ProjetRemote;


public class testconsum {

	public static void main(String[] args) throws NamingException {
		List<Project> ls = new ArrayList<Project>();
		String jndiName = "MapLevio-ear/MapLevio-ejb/ProjetService!services.ProjetRemote";
		Context context = new InitialContext();
		ProjetRemote service = (ProjetRemote) context.lookup(jndiName);
		ls=service.testConsume();
		
	}

}
