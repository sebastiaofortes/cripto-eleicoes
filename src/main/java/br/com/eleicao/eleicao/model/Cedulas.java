package br.com.eleicao.eleicao.model;

public class Cedulas {

private int codigo;

private int codigo_anterior;

private int candidato_anterior;

public Cedulas(int codigo, int codigo_anterior, int candidato_anterior) {
	this.codigo = codigo;
	this.codigo_anterior = codigo_anterior;
	this.candidato_anterior = candidato_anterior;
}

public Cedulas(int codigo, Voto votoanterior) {
	this.codigo = codigo;
	this.codigo_anterior = votoanterior.codigo;
	this.candidato_anterior = votoanterior.candidato;
}

public void getdados() {
	
	System.out.println(this.codigo + " Código anterior: " + this.codigo_anterior + " Candidato anterior: " + this.candidato_anterior);
}

	
}
