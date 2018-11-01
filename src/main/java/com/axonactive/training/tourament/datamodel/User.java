/**
 * 
 */
package com.axonactive.training.tourament.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author htnguyen
 *
 */
@NamedQueries({
	@NamedQuery(name= User.GetUserByNameAndPassword, query = "Select u from User u where u.password = :password and u.username = :username")
})

@Entity
@Table(name="tbl_user")
@AllArgsConstructor @NoArgsConstructor
public @Data class User {

	public static final String PREFIX = "com.axonactive.training.tourament.user";
	public static final String GetUserByNameAndPassword = PREFIX + ".GetUser";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "username", length = 20, nullable = false, unique = true)
	private String username;
	
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
}
