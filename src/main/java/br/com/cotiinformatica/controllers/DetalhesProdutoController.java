package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetalhesProdutoController {

	@RequestMapping(value = "/detalhes-produto")
	public ModelAndView detalhesProduto() {

		// definir a página JSP que será exibida pelo controlador
		// WEB-INF/views/cadastro-cliente.jsp
		ModelAndView modelAndView = new ModelAndView("detalhes-produto");
		return modelAndView;
	}
}