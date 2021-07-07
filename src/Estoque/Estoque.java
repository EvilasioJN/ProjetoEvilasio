package Estoque;


import java.util.Scanner;

import Estoque.Produtos;

public class Estoque {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        
        Produtos product = new Produtos();
        System.out.println("Me informe detalhes do produto: ");
        System.out.println("Nome: ");
        product.name = sc.nextLine();
        System.out.println("Preço: ");
        product.price = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Informações do produto: " + product);
        
        System.out.println();
        System.out.println("Quantos produtos você deseja adicionar no estoque? ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Dados atualizados: " + product);
        
        System.out.println();
        System.out.println("Quantos produtos você deseja remover do estoque? ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Dados atualizados: " + product);
        
        sc.close();

	}

}
