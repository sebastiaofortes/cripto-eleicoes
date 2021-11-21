package br.com.eleicao.eleicao.controller;


import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.eleicao.eleicao.model.Cedulas;
import br.com.eleicao.eleicao.model.Votacao;
import br.com.eleicao.eleicao.model.Voto;

@Controller
public class MainController {
	
//Autowired faz com que uma instância da classe Votacao seja criada automaticamente pelo IOC do Spring 	
// após criada essa instância vai ser atribuída a variavel zona1
// na classe VotacaoConfiguration existe um bean definindo para o IOC como instanciar o objeto Votacao
@Autowired
private Votacao zona1;

@RequestMapping("/")
public String IniciarVotacao () {
	

	
	return "index";
}	
	
@RequestMapping("/votar")
public String Votar () {
	
	
	Voto voto1 = zona1.geraVoto(1);
	Voto voto2 = zona1.geraVoto(1);
	Voto voto3 = zona1.geraVoto(1);
	
	zona1.processaoVoto(voto1);
	zona1.processaoVoto(voto2);
	zona1.processaoVoto(voto3);
	
	zona1.EncerraVotacao();
	
	return "votar";
}	

}
