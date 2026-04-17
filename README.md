# PetCare - Sistema de Agenda de Banho e Tosa 🐾

Este projeto é parte integrante do **Projeto Integrador (PI)** do curso **Técnico em Desenvolvimento de Sistemas do SENAC**. O objetivo principal é demonstrar a evolução de um sistema de gestão de Pet Shop, focando em arquitetura robusta, refatoração e qualidade de software.

## 📌 Contexto do Projeto
O sistema foi desenvolvido para facilitar a gestão de agendamentos em estabelecimentos de estética animal. A versão atual foca na transição da lógica de negócio para uma estrutura preparada para ambientes Web, aplicando princípios de design orientado a objetos.

## 🚀 Funcionalidades (Requisitos)
- **RF01 - Cadastro de Agendamentos:** Registro de pets com nome, serviço solicitado (Banho/Tosa) e horário.
- **RF02 - Listagem de Agenda:** Visualização clara de todos os atendimentos programados.
- **RF03 - Validação de Regras de Negócio:** Sistema que impede agendamentos fora do horário de funcionamento (08h às 18h).

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 17+
- **IDE:** NetBeans
- **Gestão de Dependências:** Maven (opcional)
- **Testes Unitários:** JUnit 4/5
- **Versionamento:** Git e GitHub

## 🏛️ Arquitetura e Boas Práticas (SOLID)
O projeto foi estruturado seguindo o **Princípio da Responsabilidade Única (SRP)** do SOLID, dividindo as responsabilidades em pacotes distintos:
- `model`: Representação das entidades de dados.
- `service`: Isolamento de toda a lógica de negócio e validações.
- `main`: Ponto de entrada para execução e simulação.

> **Refatoração:** O código foi desacoplado de interfaces gráficas (Swing) para permitir a reutilização da lógica em futuras implementações Web/API.

## 🧪 Testes de Software
A conformidade do sistema é garantida através de:
- **Testes Unitários (JUnit):** Validação automatizada das regras de agendamento.
- **Plano de Testes:** Documentação de cenários de sucesso e erro para garantir a integridade do fluxo de dados.

## 🔧 Como Executar
1. Clone o repositório:
   ```bash
   git clone [[https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)](https://github.com/guiDevAmaral/pi-senac-banhotosa)
