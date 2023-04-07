package com.tienda.web.tiendacarpinteria.service;

import java.util.Map;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserAuthenticationServiceImpl implements UserAuthenticationService {

	/*Se cambio el userDetailsService por UserDetailService, 
	 * ya que necesito buscar usuarios por email no por username.
	 */

	
	private JWTService jwtService;
	private PasswordEncoder passwordEncoder;
	private UserDetailService userDetailService;
	
		
	public UserAuthenticationServiceImpl(PasswordEncoder thePasswordEncoder, JWTService theJwtService,
		UserDetailService theUserDetailService) {
		passwordEncoder = thePasswordEncoder;
		jwtService = theJwtService;
		userDetailService = theUserDetailService;
	}

	//Chequea que el usuario y contraseña coincida con lo registrado en la BBDD.
	@Override
	public Map<String, String> login(String username, String password) {
		UserDetails optUser = userDetailService.loadUserByEmail(username);
		if (!(password.equals(optUser.getPassword()))) {
			throw new RuntimeException("The passwords doesn't match");
		}
		User user = (User) optUser;
		Map<String, String> tokens = jwtService.generateTokenSet(user);
		return tokens;
	}

}


