package org.pro;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta! ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, informe o nome do cliente! ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe a sua agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o valor que deseja depositar! ");
        float saldo = scanner.nextFloat();


        System.out.println("O número da sua conta é : " + numero);
        System.out.println("A sua agencia é : " + agencia);
        System.out.println("O seu nome é: " + nomeCliente);
        System.out.println("O valor do depósito é: " + saldo);
        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agencia é" + " " + agencia + " ,conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque. ");

        scanner.close();
    }
}
