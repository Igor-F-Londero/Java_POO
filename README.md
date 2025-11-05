# Java_POO

# Sistema de Controle de Oficina Mecânica

Este projeto foi desenvolvido como parte de um exercício prático de **Programação Orientada a Objetos (POO)** em **Java**, com o objetivo de aplicar conceitos como **pacotes, classes, atributos, métodos, instância de objetos e encapsulamento**.

---

##  Objetivo do Sistema

Criar uma aplicação simples para controle básico de uma **oficina mecânica**, permitindo:

-  Cadastrar **clientes** (nome, CPF, endereço, telefone, e-mail);
-  Cadastrar **veículos** (placa, modelo, ano, fabricante, cor);
-  Exibir os dados cadastrados no console.

---

##  Estrutura do Projeto

src/
├── modelo/
│ ├── Cliente.java → Classe que representa os dados do cliente.
│ └── Veiculo.java → Classe que representa os dados do veículo.
└── controle/
└── Principal.java → Classe principal que executa o programa.

- **Pacote `modelo`**: contém as classes que modelam os objetos do sistema.  
- **Pacote `controle`**: contém a classe `Principal`, responsável por iniciar o programa e controlar a execução.

---

##  Tecnologias Utilizadas

- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos (POO)  
- **IDE sugerida:** NetBeans (pode ser executado em qualquer IDE Java)

  ## Conceitos Aplicados

- **Encapsulamento:** uso de `private` nos atributos e `getters/setters` para acesso controlado.  
- **Construtores:** inicialização de objetos com parâmetros.  
- **Instanciação:** criação de objetos com o operador `new`.  
- **Pacotes:** organização lógica do código (`modelo` e `controle`).  
- **Entrada de dados:** leitura com `Scanner`.  
- **Métodos:** separação de responsabilidades (`exibirDados()` em cada classe).
