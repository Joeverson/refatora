package br.com.nun.refactorCode;

public class Locadora {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente("Juliana");
		
		CheckIn c = new CheckIn(cl, new Aluguel(new Fita("O Exorcista", Classificacao.NORMAL), 3));
		
		c.setAluguel(new Aluguel(new Fita("Men in Black", Classificacao.NORMAL), 2));
		c.setAluguel(new Aluguel(new Fita("Jurassic Park III             ", Classificacao.LANCAMENTO), 3));
		
		System.out.println(new Financeiro(c).extrato());
		
		/*c1.adicionaAluguel();
		c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III             ", Aluguel.LANÇAMENTO), 3));
		c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos           ", Aluguel.LANÇAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ", Aluguel.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leao                    ", Aluguel.INFANTIL), 30));
		System.out.println(c1.extrato());*/

	}

}
