package br.com.eleicao.eleicao.model;



import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;




public class Votacao {
	
private Set<Integer> codigos;	
private Random Rand;
private List<Voto> fila;
private List<Cedula> urna;

public Votacao(Set<Integer> codigos,Random Rand,List<Voto> fila, List<Cedula> urna) {
		this.codigos = codigos;
		this.Rand = Rand;
		this.fila = fila;
		this.urna = urna;
		System.out.println("Classe votação criada");
	
	}

public Voto geraVoto(int candidato) {

Voto voto = new Voto(1,1);
	
	if(codigos.size() < 20) {
		codigos.add(Rand.nextInt(101));
		
		Iterator<Integer> iterator = codigos.iterator();
		while(iterator.hasNext()) {
		int cod = iterator.next();
		if(!iterator.hasNext()) {
		
		voto = new Voto(cod,candidato);  // armazena linha na memória junto com o candidato
		System.out.println("código: " + cod + " criado e indexado ao novo voto");
		return voto;

		
		}
		
		else System.out.println("código: " + cod + " percorrido pelo laço while ");
		
		}
		
	}
	else {
	System.out.println("limite de votos esgotado!");	
	}
	
	return null;
	
} // funcao



private void EnfileiraVoto(Voto v) {
	
	
		fila.add(v);  // armazena linha na memória junto com o candidato
		System.out.println("voto: " + v.codigo + " adicionado a fila");
}

public Cedula Geracedula(Voto v) {
	
	EnfileiraVoto(v);
	
		if(fila.size() == 1) { // verifica se o registro inserido é o primeiro registro
			System.out.println("primeiro voto - aguarde o fim da votação para ver sua cédula - ciclo encerrado");
		return new Cedula(v.codigo);
		}
		else {
		
			Voto votoanterior = fila.get(fila.size()-2); 		//coleta os dados do voto anterior
			Cedula novaCedula = new Cedula(v.codigo, votoanterior);
			return novaCedula;
		}
	

}



public void AdicionaUrna(Cedula cedula) {
	urna.add(cedula);		// armazena codigo + codigo voto anterior + candidadito voto anterior
	cedula.getdados();
}


public void EncerraVotacao() {
	System.out.println("encerrando eleição.....");
	Voto ultimovoto = fila.get(fila.size()-1); 
	Voto primeirovoto = fila.get(0);
	Cedula novaCedula = new Cedula(primeirovoto.codigo, ultimovoto);
	urna.add(novaCedula);
	novaCedula.getdados();
	System.out.println("Eleições encerradas");
}

}// classe
