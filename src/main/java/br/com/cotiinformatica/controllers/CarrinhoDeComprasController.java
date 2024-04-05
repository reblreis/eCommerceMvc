package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarrinhoDeComprasController {
	
	@RequestMapping(value = "/carrinho-de-compras")
	public ModelAndView carrinhoDeCompras() {
		
		//definir a página JSP que será exibida pelo controlador
		//WEB-INF/views/cadastro-cliente.jsp
		ModelAndView modelAndView = new ModelAndView("carrinho-de-compras");
		return modelAndView;
	}
}