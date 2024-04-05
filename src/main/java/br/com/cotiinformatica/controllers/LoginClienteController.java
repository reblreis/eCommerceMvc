package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginClienteController {

	@RequestMapping(value = "/login-cliente")
	public ModelAndView loginCliente() {

		// definir a página JSP que será exibida pelo controlador
		// WEB-INF/views/cadastro-cliente.jsp
		ModelAndView modelAndView = new ModelAndView("login-cliente");
		return modelAndView;
	}
}