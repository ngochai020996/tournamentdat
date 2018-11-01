/**
 * 
 */
package com.axonactive.training.tourament.datamodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author htnguyen
 *
 */

@NoArgsConstructor @AllArgsConstructor
public @Data class Credential {
	
	private String username;
	
	private String password;
}
