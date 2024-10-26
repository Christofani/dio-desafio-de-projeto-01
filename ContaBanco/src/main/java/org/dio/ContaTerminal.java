package org.dio;

import java.util.*;

/**
 * The type Conta terminal.
 */
public class ContaTerminal {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    System.out.println("Digite o número da conta: ");
    int numero = scanner.nextInt();

    System.out.println("Digite sua agência: ");
    String agencia = scanner.next();

    System.out.println("Digite seu nome completo: ");
    String nome = scanner.next();

    System.out.println("Saldo: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá "
            + nome + " obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta "
            + numero + ", e seu saldo " + saldo + " já está disponível para saque!");

    scanner.close();
  }

}