package com.tienda.web.tiendacarpinteria.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailService {


	UserDetails loadUserByEmail(String email) throws UsernameNotFoundException;

}
