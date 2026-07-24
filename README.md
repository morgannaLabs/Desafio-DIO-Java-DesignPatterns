# Desafio DIO - Design Patterns com Java

Projeto desenvolvido durante o bootcamp NTT DATA: Backend Java com Spring AI da DIO.

## Padrão implementado

### Strategy

O padrão Strategy permite definir uma família de comportamentos,
encapsulá-los e torná-los intercambiáveis em tempo de execução.

## Sobre o projeto

Foi criado um sistema simples de RPG onde um herói pode alterar sua classe
de combate dinamicamente.

## Estrutura

Heroi (Context)
    |
    └── ClasseHeroi (Strategy)
            |
            ├── Guerreiro
            ├── Mago
            ├── Arqueiro
            └── Barbaro

Cada classe possui sua própria implementação de:

- Ataque
- Defesa
- Cura

## Tecnologias

- Java
- Eclipse IDE
- Git
- GitHub
