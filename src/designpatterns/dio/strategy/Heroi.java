
package designpatterns.dio.strategy;

/**
 * Representa o personagem principal do jogo.
 * 
 * A classe utiliza o padrão de projeto <b>Strategy</b>, permitindo que o comportamento
 * do herói seja alterado em tempo de execução através da escolha de diferentes
 * implementações da interface {@link ClasseHeroi}.
 * 
 * Projeto desenvolvido para o bootcamp NTT DATA: Backend Java com Spring AI da DIO
 * Desafio de Projeto com Design Patterns
 * Data: 24/07/2026
 * 
 * @author @MorgannaLabs
 */
 

public class Heroi {
	
	private ClasseHeroi classeHeroi;
	
	// Define a classe de personagem (estratégia) a ser utilizada pelo herói
	public void escolherClasse(ClasseHeroi classeHeroi) {
		this.classeHeroi = classeHeroi;
		System.out.println("Classe escolhida: " + classeHeroi.getClass().getSimpleName());
	}
	
	// Executa o ataque utilizando a estratégia atualmente selecionada.
	public void atacar() {
        classeHeroi.atacar();
    }
	
	// Executa a defesa utilizando a estratégia atualmente selecionada.
	public void defender() {
        classeHeroi.defender();
    }
	
	//Executa a cura utilizando a estratégia atualmente selecionada.
    //Cada classe de herói possui uma quantidade própria de recuperação de vida.
	public void curar() {
		int cura = classeHeroi.curar();
	    System.out.println("Curou " + cura + " pontos de vida");
	}

}
