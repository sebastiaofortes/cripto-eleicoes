package br.com.eleicao.eleicao.config;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.eleicao.eleicao.model.Cedulas;
import br.com.eleicao.eleicao.model.Votacao;
import br.com.eleicao.eleicao.model.Voto;

// Configuration define qua a classe votacaoconfiguration é uma classe de configuração ou seja uma fonte de definição de beans
@Configuration
public class VotacaoConfiguration {

//Bean define para o spring IOC como a instãncia de Votacao deve ser criada 
@Bean	
public Votacao votacao() {
	Set<Integer> codigos1 = new LinkedHashSet<Integer> ();
	Random Rand = new Random();
	List<Voto> fila = new ArrayList<Voto>();
	List<Cedulas> urna = new ArrayList<Cedulas>();

	
	return new Votacao(codigos1, Rand, fila, urna);
}	
	
}
