/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Controle;
import Modelo.Cliente;
import Modelo.Veiculo;
import java.util.Scanner;

/**
 *
 * @author igorf
 */
public class principal {
    public static void main(String args[]) {
        //scaner pra exibir dados no terminal , ponto de entrada do programa java
        Scanner pega = new Scanner(System.in);
        
        System.out.println("--- CADASTRO DE CLIENTE ---");
        
        //Solicita e lê o cpf do cliente
        System.out.println("CPF: ");
        String cpf = pega.nextLine();
        
        System.out.println("Nome: ");
        String nome = pega.nextLine();
        
        System.out.print("Endereço: ");
        String endereco = pega.nextLine();
        
        System.out.print("Telefone: ");
        String telefone = pega.nextLine();

        System.out.print("E-mail: ");
        String email = pega.nextLine();
        
        // Cria (instancia) um objeto da classe Cliente com os dados digitados
        Cliente cliente = new Cliente(cpf,nome,endereco,telefone,email);
        

     

        System.out.println("\n=== CADASTRO DE VEÍCULO ===");
        System.out.print("Placa: ");
        String placa = pega.nextLine();
        System.out.print("Modelo: ");
        String modelo = pega.nextLine();
        System.out.print("Ano: ");
        int ano = pega.nextInt();
        //Depois de usar nextInt(), fica um “\n” pendente, então essa linha serve para evitar que o próximo nextLine() pule uma leitura.
        pega.nextLine(); // limpa o buffer
        System.out.print("Fabricante: ");
        String fabricante = pega.nextLine();
        System.out.print("Cor: ");
        String cor = pega.nextLine();
        
        Veiculo veiculo1 = new Veiculo(placa, modelo, ano, fabricante, cor);
        cliente.exibeDado();
        veiculo1.exibeDado();
        
        pega.close();
        System.out.println("\nCadastro concluído com sucesso!");
        
    }
}
