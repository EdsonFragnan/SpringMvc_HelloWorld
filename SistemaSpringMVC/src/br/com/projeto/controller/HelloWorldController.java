package br.com.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/sistema")
public class HelloWorldController {
 @RequestMapping(value = "/boasvindas", method = RequestMethod.GET)
 public ModelAndView boasVindas(@RequestParam(value = "nome", required = false, defaultValue = "C�cero Ednilson") String nome) {

 ModelAndView modelAndView = new ModelAndView("boasVindas");
 modelAndView.addObject("mensagem", "Ol� " + nome);

 return modelAndView;
 }

}