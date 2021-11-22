package br.com.eleicao.eleicao.model;

public class Cedula {

private int codigo;

private int codigo_anterior;

private int candidato_anterior;

public Cedula(int codigo, int codigo_anterior, int candidato_anterior) {
	this.codigo = codigo;
	this.codigo_anterior = codigo_anterior;
	this.candidato_anterior = candidato_anterior;
}

public Cedula(int codigo, Voto votoanterior) {
	this.codigo = codigo;
	this.codigo_anterior = votoanterior.codigo;
	this.candidato_anterior = votoanterior.candidato;
}

public Cedula(int codigo) {
	this.codigo = codigo;
	this.codigo_anterior = 0;
	this.candidato_anterior = 0;
}

public void getdados() {
	
	System.out.println(this.codigo + " Código anterior: " + this.codigo_anterior + " Candidato anterior: " + this.candidato_anterior);
}

	
}
