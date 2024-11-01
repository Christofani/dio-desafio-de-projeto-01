package org.dio;

import java.util.*;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Digite o primeiro parâmetro: ");
    int parametro1 = scanner.nextInt();
    System.out.printf("Digite o segundo parâmetro: ");
    int parametro2 = scanner.nextInt();

    try {
      contar(parametro1, parametro2);
    } catch (Exception e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro !");
    }
  }

  public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
    if (parametro1 > parametro2) {
      throw new ParametrosInvalidosException();
    } else {
      int contagem = parametro2 - parametro1;
      for (int i = 0; i < contagem; i++) {
        System.out.println("Imprimindo o número " + (i+1));
      }
    }
  }
}
