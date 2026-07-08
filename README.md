# Strategy Pattern em Java

## Descrição

Este projeto demonstra a implementação do **Padrão de Projeto Strategy** utilizando Java. A aplicação simula um robô capaz de alterar seu comportamento de movimentação 
dinamicamente durante a execução, evidenciando como diferentes algoritmos podem ser encapsulados em classes independentes.

O projeto aplica conceitos de **Programação Orientada a Objetos (POO)** e apresenta uma implementação prática de um dos padrões comportamentais mais utilizados no 
desenvolvimento de software.

---

## Estrutura do Projeto

```text
src
│
├── demo
    ├── StrategyPatternDemo.java
├── strategy
│   ├── MovementStrategy.java
│   ├── AggressiveMovement.java
│   ├── DefensiveMovement.java
│   ├── NormalMovement.java
│   └── Robot.java

```

---

## Classes

### `MovementStrategy`

Interface responsável por definir o contrato para todas as estratégias de movimentação.

```java
void move();
```

---

### `NormalMovement`

Implementa o comportamento padrão de movimentação do robô.

**Saída no console**

```text
Moving normally.
```

---

### `DefensiveMovement`

Implementa uma estratégia de movimentação defensiva.

**Saída no console**

```text
Moving defensively.
```

---

### `AggressiveMovement`

Implementa uma estratégia de movimentação agressiva.

**Saída no console**

```text
Moving aggressively.
```

---

### `Robot`

Representa o robô que executa uma estratégia de movimentação.

#### Principais responsabilidades

* Armazenar a estratégia atual.
* Permitir a alteração da estratégia em tempo de execução.
* Delegar a execução do movimento para a estratégia selecionada.

**Métodos**

```java
setStrategy(MovementStrategy strategy)
move()
```

---

### `StrategyPatternDemo`

Classe principal responsável por demonstrar o funcionamento do padrão Strategy.

Durante a execução, o programa:

* Cria diferentes estratégias de movimentação.
* Associa cada estratégia ao robô.
* Altera o comportamento do robô dinamicamente.
* Simula um pequeno tempo de processamento utilizando `Thread.sleep()`.
* Exibe a mensagem **"Under analysis..."** antes de cada mudança de comportamento.

---

## Fluxo de Execução

1. Instancia as estratégias de movimentação.
2. Cria um objeto da classe `Robot`.
3. Define inicialmente a estratégia **Normal**.
4. Exibe a mensagem:

```text
Under analysis...
```

5. Aguarda três segundos.
6. Executa a estratégia atual.
7. Altera a estratégia do robô.
8. Repete o processo para demonstrar a troca dinâmica de comportamento.

---

## Exemplo de Saída

```text
Under analysis...

Moving normally.
Moving normally.

Under analysis...

Moving defensively.

Under analysis...

Moving aggressively.
Moving aggressively.
Moving aggressively.
```

---

## Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* Programação Orientada a Objetos (POO)

---

## Padrão de Projeto Utilizado

### Strategy

O padrão **Strategy** permite encapsular diferentes algoritmos ou comportamentos em classes independentes, possibilitando que sejam substituídos durante a execução da 
aplicação sem modificar o código da classe que os utiliza.

Essa abordagem elimina o uso excessivo de estruturas condicionais (`if` e `switch`), tornando o código mais organizado, reutilizável e de fácil manutenção.

### Benefícios

* Baixo acoplamento entre as classes.
* Alta coesão.
* Alteração de comportamento em tempo de execução.
* Facilidade para manutenção e evolução do sistema.
* Código mais limpo e legível.
* Conformidade com o princípio **Open/Closed (SOLID)**.

---

## Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Interfaces
* Polimorfismo
* Encapsulamento
* Injeção de Dependência
* Padrão de Projeto Strategy

---

## Objetivo do Projeto

Demonstrar, de forma prática, a implementação do padrão de projeto **Strategy**, evidenciando como diferentes comportamentos podem ser encapsulados em classes 
independentes e utilizados dinamicamente por um mesmo objeto. O projeto destaca os benefícios de flexibilidade, reutilização de código, baixo acoplamento e 
facilidade de manutenção, seguindo boas práticas de desenvolvimento orientado a objetos.
