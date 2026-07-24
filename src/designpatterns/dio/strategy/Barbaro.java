package designpatterns.dio.strategy;

/**
 * Representa a classe Bárbaro.
 * O Bárbaro possui como arma um machado, que o mesmo utiliza em seu ataque e defesa
 * Restaura 50 pontos de vida ao curar
 */

public class Barbaro implements ClasseHeroi{

	@Override
	public void atacar() {
		System.out.println("Golpeando com Machado");
	}
	
	@Override
	public void defender() {
		System.out.println("Aparou golpe com Machado");
	}
	
	@Override
	public int curar() {
		return 50;
	}
	
}
