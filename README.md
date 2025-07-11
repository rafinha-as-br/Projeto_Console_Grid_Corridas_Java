# Visão Geral do Sistema

**Java Grid F1** é uma aplicação que simula um campeonato de Fórmula 1, permitindo:

* Gerenciamento de equipes, pilotos e corridas
* Cálculo automático de pontuações conforme o regulamento da FIA
* Geração de relatórios e classificações
* Interface de menu interativa para navegação

O sistema segue os princípios da **Programação Orientada a Objetos (POO)**, utilizando:

* Encapsulamento
* Composição de objetos
* Polimorfismo via interface
* Coleções do Java

---

# Funcionamento Detalhado

## 1. Estrutura Principal

### `Main.java`

* Ponto de entrada do sistema
* Cria todas as equipes, pilotos e corridas
* Instancia o campeonato com esses dados
* Inicia o menu principal

### `Campeonato.java`

* Implementa a lógica central
* Gerencia listas de corridas, pilotos e equipes
* Implementa a interface FIA com cálculos de pontuação
* Ordena classificações de pilotos e equipes

---

## 2. Modelagem de Dados

### `Piloto.java`

* Representa um piloto com nome, número e equipe
* Mantém pontuação acumulada

### `Equipe.java`

* Representa uma equipe/construtor
* Contém lista de pilotos e pontuação
* Relacionamento de composição com `Piloto`

### `Corrida.java`

* Representa uma corrida com nome e resultado (lista ordenada de pilotos)

---

## 3. Interface e Regras FIA

### `InterfaceFIA.java`

* Define contratos para cálculo de pontuações
* Métodos para gerar classificações

### Pontuação

* Segue o sistema oficial da F1: **25-18-15-12-10-8-6-4-2-1**
* Pontos são somados para **pilotos** e **equipes**

---

## 4. Interface do Usuário

### `GerenciadorMenu.java`

* Menu interativo com 5 opções principais
* Navegação hierárquica (ex: listar corridas → detalhes da corrida)
* Utiliza `FormatadorRelatorios` para saída padronizada

### `FormatadorRelatorios.java`

* Centraliza a formatação de todos os relatórios
* Suporta tabelas com 2, 3 ou 5 colunas
* Realiza alinhamento e truncagem de texto

---

## 5. Fluxo de Dados

* Dados são inicializados em `Main.java`
* `Campeonato` coordena todas as operações
* `GerenciadorMenu` apresenta opções ao usuário
* Para cada ação, os dados são processados e formatados
* Resultados são exibidos utilizando `FormatadorRelatorios`
