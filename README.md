# 💳 Banco Digital com Java e Orientação a Objetos

Este projeto foi desenvolvido como parte do desafio **"Criando um Banco Digital com Java e Orientação a Objetos"**, proposto pela [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo é aplicar os pilares da programação orientada a objetos (POO) em um cenário bancário realista.

---

## 📅 Mentoria #1 
**Tema:** Tire Suas Dúvidas Sobre Orientação a Objetos

---

## 🧠 Desafio

> “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

A proposta é abstrair esse cenário em Java, utilizando os conceitos fundamentais da POO para criar um sistema simples, funcional e extensível.

---

## 🧱 Conceitos aplicados

### 🔹 Abstração
Foco nos elementos essenciais do domínio bancário, como contas, clientes e operações. Cada classe representa uma entidade significativa do sistema.

### 🔹 Encapsulamento
Os atributos das classes são privados e acessados por meio de métodos públicos, garantindo segurança e controle sobre os dados.

### 🔹 Herança
As classes `ContaCorrente` e `ContaPoupanca` herdam da classe abstrata `Conta`, reutilizando e especializando seu comportamento.

### 🔹 Polimorfismo
As contas são tratadas de forma genérica através da classe `Conta`, permitindo flexibilidade na manipulação de diferentes tipos de conta.

---

## 📂 Estrutura do projeto

- `Cliente.java`: representa o cliente do banco
- `Conta.java`: classe abstrata com operações comuns
- `ContaCorrente.java` e `ContaPoupanca.java`: especializações da conta
- `Banco.java`: gerencia clientes e contas
- `Main.java`: ponto de entrada da aplicação

---

## 🚀 Funcionalidades

- Criar clientes e contas
- Realizar depósitos, saques e transferências
- Gerar extrato de operações
- Listar todas as contas do banco

---

## 🛠️ Tecnologias

- Java 21
- Maven
- Lombok
- IntelliJ IDEA

---

## 📌 Como executar
```bash
mvn clean compile
mvn exec:java
```

👩🏻‍💻 Autora
Maria Aline Mees



