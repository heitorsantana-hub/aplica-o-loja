package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.ItemPedido;
import entities.Produto;
import enums.StatusPedido;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Adicione o cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento: ");
        Date dataNascimento = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome,email,dataNascimento);

        System.out.println("Adicione os Dados do Pedido: ");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.println("Digite a quantidade de Pedidos: ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Digite o pedido #" + i +": ");
            System.out.print("Digite o nome do Produto: ");
            String nomePedido = sc.next();
            System.out.print("Digite o preco do produto: ");
            double preco = sc.nextDouble();

            Produto produto = new Produto(preco, nomePedido);

            System.out.print("Digite a quantidade desse protudo: ");
            int quantidadeProduto = sc.nextInt();

            ItemPedido itemPedido = new ItemPedido(quantidadeProduto, preco, produto);
            pedido.addItemPedido(itemPedido);

        }

        System.out.println();
        System.out.println(pedido);


    }

}
