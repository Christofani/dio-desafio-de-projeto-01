package org.dio.Candidatura;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    analisarCandidato(1900.0);
    analisarCandidato(2200.0);
    analisarCandidato(2000.0);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioPretendido > salarioBase) {
      System.out.println("Ligar para o Candidato!");
    } else if (salarioPretendido == salarioBase) {
      System.out.println("Ligar para o candidato com contra proposta!");
    } else {
      System.out.println("Aguardando resultado dos demais candidatos!");
    }
  }
}
