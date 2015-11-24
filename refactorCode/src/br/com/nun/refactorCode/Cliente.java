package br.com.nun.refactorCode;

import java.util.Collection;
import java.util.Iterator;

import javax.swing.text.AbstractDocument.BranchElement;

public class Cliente {
	private String nome;	
	private int pontosDeAlugadorFrequente = 0;	
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setFidelidadePlus(){
		this.pontosDeAlugadorFrequente++;
	}
	
	public int getFidelidade() {
		return this.pontosDeAlugadorFrequente;
	}	
}
