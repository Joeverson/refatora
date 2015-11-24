package br.com.nun.refactorCode;

public class Fita {
	private String titulo;
	private int codigoDePreco;
	
	public Fita(String titulo,int codigoDePreco){
		this.titulo = titulo;
		this.codigoDePreco = codigoDePreco;
	}

	public int getCodigoDePreco() {
		return codigoDePreco;
	}

	public void setCodigoDePreco(int codigoDePreco) {
		this.codigoDePreco = codigoDePreco;
	}

	public String getTitulo() {
		return titulo;
	}
	
	
}
