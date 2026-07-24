package designpatterns.dio.strategy;

/**
 * Representa a classe Mago.
 * O mago possui ataques baseados em magia e utiliza um escudo mágico como forma de defesa.
 * Restaura 20 pontos de vida ao curar
 */

public class Mago implements ClasseHeroi{
	
	@Override
	public void atacar() {
		System.out.println("Atacando com Bola de Fogo");
	}
	
	@Override
	public void defender() {
		System.out.println("Defendendo com Escudo Mágico");
	}
	
	@Override
	public int curar() {
		return 20;
	}

}
