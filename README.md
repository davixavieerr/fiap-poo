# FiapRide - Sistema de Mobilidade Urbana

Este projeto foi desenvolvido como parte da disciplina de **Object-Oriented Programming** na **FIAP**. O objetivo principal é aplicar os fundamentos da Programação Orientada a Objetos (POO), como a abstração, a criação de classes, a instanciação de objetos e a implementação de métodos com regras de negócio.

## 🚀 Tecnologias Utilizadas

* **Java**: Linguagem base para o desenvolvimento.
* **Eclipse IDE**: Ambiente de desenvolvimento utilizado.
* **Git/GitHub**: Ferramentas para versionamento de código e construção de portfólio profissional.
* **Astah UML**: Software utilizado para a modelagem visual das classes antes da codificação.

## 🏗️ Estrutura do Projeto

O sistema segue princípios de **Clean Code** e está organizado em pacotes para garantir a manutenibilidade:

* `br.com.fiapride.model`: Contém as classes que representam os dados e o domínio do negócio (os "moldes").
* `br.com.fiapride.main`: Contém a classe de execução com o método `main`, onde o sistema é inicializado.

## 📋 Classes Principais

### 1. Passageiro (Domínio do Negócio)
Representa o usuário real dentro do sistema de mobilidade.
* **Atributos**: `nome`, `cpf` e `saldo`.
* **Métodos**:
    * `adicionarSaldo(double valor)`: Realiza a recarga da conta, validando se o valor é positivo para proteger a integridade dos dados.
    * `pagarViagem(double custo)`: Debita o valor de uma corrida, garantindo que o passageiro tenha saldo suficiente antes de processar o pagamento.

### 2. Oculos (Desafio Prático)
Objeto do mundo real modelado para demonstrar a abstração de estados e comportamentos específicos.
* **Atributos**: `estaLimpo` (boolean) e `hastesAbertas` (boolean).
* **Métodos**:
    * `limparOculos()`: Altera o estado do objeto para limpo, com uma regra de negócio que evita a execução da ação se o óculos já estiver limpo.
    * `abrirFecharOculos()`: Atua como um alternador de estado (toggle), controlando o comportamento físico das hastes do objeto.

## 🛠️ Como Executar

1.  Importe o projeto no **Eclipse IDE**.
2.  Certifique-se de que as classes estão localizadas nos pacotes corretos (`model` e `main`).
3.  Execute a classe `SistemaPrincipal.java` para visualizar as interações e a mudança de estado dos objetos no console.