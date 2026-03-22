# Sistema de Clínica Médica

## 📌 Descrição

Este projeto foi desenvolvido como exercício para praticar conceitos de orientação a objetos em Java. O sistema simula o cadastro de uma clínica médica simples, permitindo representar médicos, pacientes e o agendamento de consultas.

## 🎯 Objetivo

O objetivo principal é modelar um sistema básico utilizando classes, atributos e relacionamento entre objetos, incluindo uma classe de associação.

## 🧱 Estrutura do Projeto

O sistema é composto pelas seguintes classes:

### 👨‍⚕️ Medico

* id
* nome
* especialidade

### 🧑‍🤝‍🧑 Paciente

* id
* nome
* cpf

### 📅 Consulta

* data (LocalDateTime)
* valorDaConsulta
* médico
* paciente

A classe **Consulta** funciona como uma ligação entre Médico e Paciente, representando o agendamento.

## ▶️ Funcionamento

No método `main`, é feito:

* Criação de um objeto Médico
* Criação de um objeto Paciente
* Registro de uma consulta marcada para o dia **20/05/2026**

## 💻 Tecnologias utilizadas

* Java
* IntelliJ IDEA

## 📚 Conceitos aplicados

* Classes e objetos
* Encapsulamento
* Associação entre classes
* Uso de `LocalDateTime`

## 📝 Observações

Este projeto tem fins acadêmicos e foi desenvolvido para prática dos conceitos básicos de programação orientada a objetos.

---
