package br.com.eleicao.eleicao.controller;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.eleicao.eleicao.model.Cedulas;
import br.com.eleicao.eleicao.model.Votacao;
import br.com.eleicao.eleicao.model.Voto;

@Controller
public class MainController {
	
	

private Votacao zona1;

@RequestMapping("/")
public String IniciarVotacao () {
	
	Set<Integer> codigos1 = new LinkedHashSet<Integer> ();
	Random Rand = new Random();
	List<Voto> fila = new ArrayList<Voto>();
	List<Cedulas> urna = new ArrayList<Cedulas>();

	
	this.zona1 = new Votacao(codigos1, Rand, fila, urna);
	
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
