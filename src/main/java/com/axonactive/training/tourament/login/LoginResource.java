package com.axonactive.training.tourament.login;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.axonactive.common.ws.rs.auth.Credentials;
import com.axonactive.training.tourament.AuthenticationResource;

@Stateless
@Path("getToken")
public class LoginResource {
	
	@EJB
	AuthenticationResource authen; 
	
	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getToken(Credentials credential) {
//		com.axonactive.common.ws.rs.auth.Credentials credentialAuth = new com.axonactive.common.ws.rs.auth.Credentials(credential.getUsername(), credential.getPassword());
		return authen.authenticate(credential);
	}
}
