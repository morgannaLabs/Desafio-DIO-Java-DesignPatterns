package designpatterns.dio.strategy;

/**
 * Classe responsável por demonstrar o funcionamento do padrão Strategy.
 *
 * <p>
 * O exemplo mostra a troca dinâmica de comportamento do objeto {@link Heroi}
 * através da alteração das implementações de {@link ClasseHeroi}, simulando um jogo de RPG
 * </p>
 * 
 * Projeto desenvolvido para o bootcamp NTT DATA: Backend Java com Spring AI da DIO
 * Desafio de Projeto com Design Patterns
 * Data: 24/07/2026
 * 
 * @author @MorgannaLabs
 */



public class Main {

    public static void main(String[] args) {

    	// Criando o objeto herói, que representa o contexto que utiliza a estratégia
        Heroi heroi = new Heroi();

        // Alterando a estratégia para Guerreiro
        System.out.println("=== Guerreiro ===\n");
        heroi.escolherClasse(new Guerreiro());
        heroi.atacar();
        heroi.defender();
        heroi.curar();

        System.out.println("\n----------------------");

        // Alterando a estratégia para Mago
        System.out.println("=== Mago ===\n");
        heroi.escolherClasse(new Mago());
        heroi.atacar();
        heroi.defender();
        heroi.curar();

        System.out.println("\n----------------------");

        // Alterando a estratégia para Arqueiro
        System.out.println("=== Arqueiro ===\n");
        heroi.escolherClasse(new Arqueiro());
        heroi.atacar();
        heroi.defender();
        heroi.curar();

        System.out.println("\n----------------------");

        // Alterando a estratégia para Bárbaro
        System.out.println("=== Barbaro ===\n");
        heroi.escolherClasse(new Barbaro());
        heroi.atacar();
        heroi.defender();
        heroi.curar();

    }

}
