package com.tienda.web.tiendacarpinteriaui.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;

public abstract class BaseController {
	
	private static final Logger LOGGER  = LoggerFactory.getLogger(BaseController.class);
	
	protected void checkUserSession(HttpServletResponse response, Model model, HttpSession session) {
		LOGGER.debug("Checkin for user session");
		model.addAttribute("session", session);
		try {
			if (session.getAttribute("access-token") != null) {
				response.addHeader("access-token", (String)session.getAttribute("access-token"));
				model.addAttribute("user", session.getAttribute("user"));
			}else if (session.getAttribute("loginError") != null) {
					model.addAttribute("loginError", session.getAttribute("loginError"));
			}
		}catch (Exception e) {
			
		}
	}
}