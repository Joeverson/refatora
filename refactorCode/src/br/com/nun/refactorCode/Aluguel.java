package br.com.nun.refactorCode;

public class Aluguel {	
	private Fita fitas;
	private int diasAlugados;
	
		
	public Aluguel(Fita fita, int diasAlugada) {
		this.fitas = fita;		
		this.diasAlugados = diasAlugada;
	}

	public int getDiasAlugada() {
		return this.diasAlugados;
	}
	
	public Fita getfitas() {
		return this.fitas;
	}	
}
