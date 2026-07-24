package designpatterns.dio.strategy;

/**
 * Representa a classe Arqueiro
 * O Arqueiro possui como arma um arco e flecha, e utiliza a esquiva como defesa
 * Restaura 30 pontos de vida ao curar
 */

public class Arqueiro implements ClasseHeroi{
	
	@Override
	public void atacar() {
		System.out.println("Atirando flechas");
	}
	
	@Override
	public void defender() {
		System.out.println("Defendendo com Esquiva");
	}
	
	@Override
	public int curar() {
		return 30;
	}

}
