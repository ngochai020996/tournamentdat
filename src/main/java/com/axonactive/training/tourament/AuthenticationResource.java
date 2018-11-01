/**
 * 
 */
package com.axonactive.training.tourament;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.axonactive.common.ws.rs.auth.AbstractAuthenticationResource;
import com.axonactive.training.tourament.datamodel.User;

/**
 * @author htnguyen
 *
 */
@Stateless
public class AuthenticationResource extends AbstractAuthenticationResource {
	public AuthenticationResource() {
		super();
	}
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void authenticate(String username, String password) throws NoResultException {
		User user = (User) this.em.createNamedQuery(User.GetUserByNameAndPassword).setParameter("password", password).setParameter("username", username).getSingleResult();
	}
	
}
