# Calculadora Simples em Java

## Descrição
Este projeto é uma **calculadora de console** desenvolvida em Java.  
Ela permite ao usuário realizar operações matemáticas básicas entre dois números:

- Adição
- Subtração
- Multiplicação
- Divisão

A calculadora também trata **divisão por zero** e entradas inválidas.

---

## Funcionalidades

1. Recebe dois números do usuário.
2. Permite escolher a operação matemática:
   - `+` Adição
   - `-` Subtração
   - `*` Multiplicação
   - `/` Divisão
3. Mostra o resultado da operação.
4. Caso o usuário tente dividir por zero, exibe uma mensagem de erro.
5. Valida a operação digitada e exibe mensagem se for inválida.

---

## Tecnologias

- Linguagem: **Java**
- IDE recomendada: **IntelliJ IDEA**
- Estrutura de arquivos:
  - `Main.java` → contém a lógica principal da calculadora

---

## Estrutura do Código

```text
Main.java
└── Recebe os números e operação do usuário
└── Realiza cálculo usando switch-case
└── Valida entrada e trata divisão por zero