package designpatterns.dio.strategy;

/**
 * Representa a classe Guerreiro.
 * O guerreiro utiliza uma espada para ataque e um escudo para defesa
 * Restaura 40 pontos de vida ao curar
 */

public class Guerreiro implements ClasseHeroi{

	@Override
	public void atacar() {
		System.out.println("Atacando com Espada");
	}
	
	@Override
	public void defender() {
		System.out.println("Defendendo com Escudo");
	}
	
	@Override
	public int curar() {
		return 40;
	}
	
}
