```markdown
# 📦 Sistema de Pedidos em Java

Este projeto é uma aplicação Java simples baseada em orientação a objetos, que simula um sistema de pedidos com clientes, produtos e status do pedido.

## 🚀 Funcionalidades

- Cadastro de cliente com nome, email e data de nascimento
- Registro de pedido com status (enum)
- Adição de produtos e itens ao pedido
- Cálculo automático do subtotal e total do pedido
- Geração de um resumo completo do pedido

## 🧰 Tecnologias utilizadas

- Java SE
- Programação Orientada a Objetos (POO)
- Enumerações (`enum`)
- Manipulação de datas com `SimpleDateFormat`
- Entrada de dados via console (`Scanner`)

## 📂 Estrutura do Projeto


src/
├── application/
│   └── Program.java
├── entities/
│   ├── Cliente.java
│   ├── ItemPedido.java
│   ├── Pedido.java
│   └── Produto.java
└── enums/
└── StatusPedido.java


## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/nome-do-repositorio.git
cd nome-do-repositorio

2. Compile os arquivos:

```bash
javac application/Program.java

3. Execute o programa:

```bash
java application.Program

4. Siga as instruções no terminal para cadastrar um cliente, definir os itens do pedido e visualizar o resumo final.

## 📝 Exemplo de Saída


Adicione o cliente:
Nome: João Silva
Email: joao@gmail.com
Data de Nascimento: 15/08/1990
Adicione os Dados do Pedido:
Status: PROCESSANDO
Digite a quantidade de Pedidos: 2

Digite o pedido #1:
Digite o nome do Produto: Celular
Digite o preco do produto: 1200.00
Digite a quantidade desse protudo: 1

Digite o pedido #2:
Digite o nome do Produto: Fone
Digite o preco do produto: 150.00
Digite a quantidade desse protudo: 2

Resumo do Pedido:
Momento do pedido: 27/06/2025
Status Pedido: PROCESSANDO
Cliente:
Nome: João Silva
Email: joao@gmail.com
Data Nascimento: 15/08/1990
Itens Pedido:
Celular, R$1200.00, Quantidade: 1, Subtotal: R$1200.00
Fone, R$150.00, Quantidade: 2, Subtotal: R$300.00
Total preço: R$1500.00

## 📌 Conceitos aplicados

* Encapsulamento
* Composição de objetos
* Reutilização de código
* Boas práticas de modelagem com POO
```


## 👨‍💻 Autor

**Heitor Santana**

📧 \[[heitor0907@email.com](mailto:heitor0907@gmail.com)]





