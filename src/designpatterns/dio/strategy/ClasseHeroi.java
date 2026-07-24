package designpatterns.dio.strategy;

/**
 * Define os comportamentos que todas as classes de herói devem implementar
 * Esta interface representa a estratégia do padrão de projeto <b>Strategy</b>
 * Cada implementação define sua própria forma de atacar, defender e curar
 */

public interface ClasseHeroi {
	
	void atacar();
	
	void defender();
	
	int curar();

}
