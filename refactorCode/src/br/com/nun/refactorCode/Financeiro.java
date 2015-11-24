package br.com.nun.refactorCode;

import java.util.Iterator;

public class Financeiro {
	private CheckIn checkin;
	private double valorTotal = 0.0;
	
	public Financeiro(CheckIn checkin){
		this.checkin = checkin;
	}
	
	public String extrato(){
		String breakLine = System.getProperty("line.separator");			
		Iterator<Aluguel> aluguel = this.checkin.getAlugueis().iterator();
		
		String extrato = "Registro de Alugueis de " + this.checkin.getCliente().getNome() + breakLine;
		
		while(aluguel.hasNext()){			
			int valorCorrente = 0;
			
			Aluguel alugar = aluguel.next();
			
			switch(alugar.getfitas().getCodigoDePreco()){
				case Classificacao.NORMAL:					
					if(alugar.getDiasAlugada() > 2){
						valorCorrente += alugar.getDiasAlugada() * 1.5;
					}
					break;
				case Classificacao.LANCAMENTO:
					valorCorrente += alugar.getDiasAlugada() * 3;
					break;
				case Classificacao.INFANTIL:
					valorCorrente += 1.5;
					if(alugar.getDiasAlugada() > 3){
						valorCorrente += (alugar.getDiasAlugada() - 3) * 1.5;
					}
					break;			
			}
			
			this.checkin.getCliente().setFidelidadePlus();
			
			//adicionando bonus para o fidelidade
			if(alugar.getDiasAlugada() > 2 && alugar.getDiasAlugada() == Classificacao.LANCAMENTO){
				this.checkin.getCliente().setFidelidadePlus();
			}
			
			// mostra valores para este aluguel
			extrato += "\t" + alugar.getfitas().getTitulo() + "\t" + valorCorrente + breakLine;
			
			this.valorTotal += valorCorrente;
		}
		
		extrato += "Valor total devido: " + this.valorTotal + breakLine;
		extrato += "Voce acumulou " + this.checkin.getCliente().getFidelidade() +" pontos de alugador frequente";		
		
		return extrato;
	}
}
