package org.dio;

import java.util.*;

public class DesafioSalario {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float valorSalario = scanner.nextFloat();
    float valorBeneficio = scanner.nextFloat();

   float valorImpostos = 0;
   if (valorSalario >= 0 && valorSalario <= 1100) {
     // atribui a aliquota de 5% mediante o salário
     valorImpostos = 0.05F * valorSalario;
   } else if (valorSalario >= 1100.1 && valorSalario <= 2500) {
      valorImpostos = 0.10F * valorSalario;
    } else {
      valorImpostos = 0.15F * valorSalario;
    }

   float saida = valorSalario - valorImpostos + valorBeneficio;
   System.out.println(String.format("%.2f", saida));
  }
}
