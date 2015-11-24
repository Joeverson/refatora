package br.com.nun.refactorCode;

import java.util.ArrayList;
import java.util.Collection;

public class CheckIn {
	private Collection<Aluguel> alugueis = new ArrayList<Aluguel>();
	private Cliente cliente;
	
	public CheckIn(Cliente cliente, Aluguel aluguel){
		this.cliente=cliente;
		this.alugueis.add(aluguel);
	}
	
	public void setAluguel(Aluguel aluguel){
		this.alugueis.add(aluguel);
	}

	public Collection<Aluguel> getAlugueis() {
		return alugueis;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
