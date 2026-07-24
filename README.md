# Design Patterns Java - Strategy RPG

Projeto desenvolvido no bootcamp NTT DATA: Backend Java com Spring AI da DIO.

<img width="951" height="581" alt="2" src="https://github.com/user-attachments/assets/04da0559-8483-4c3f-a5d3-ba89f48c7bb1" />


## Objetivo

Aplicar o padrão Strategy através de um cenário de RPG,
permitindo alterar dinamicamente o comportamento de um herói.

## Padrão implementado

### Strategy

O padrão Strategy permite definir uma família de comportamentos,
encapsulá-los e torná-los intercambiáveis em tempo de execução.

## Sobre o projeto

Foi criado um sistema simples de RPG onde um herói pode alterar sua classe
de combate dinamicamente.

## Estrutura

```text
                 Heroi
              (Contexto)
                   |
                   |
        ClasseHeroi (Strategy)
                   |
    --------------------------------
    |              |        |       |
Guerreiro       Mago   Arqueiro  Barbaro
(Strategy)   (Strategy) (Strategy) (Strategy)
```

Cada classe possui sua própria implementação de:

- Ataque
- Defesa
- Cura

## Tecnologias Utilizadas

- Java
- Eclipse IDE
- Git
- GitHub
