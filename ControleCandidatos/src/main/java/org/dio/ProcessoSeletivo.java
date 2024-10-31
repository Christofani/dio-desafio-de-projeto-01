package org.dio;

import java.util.concurrent.*;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    selecaoDeCandidatos();
  }

  static void selecaoDeCandidatos() {
    String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("Candidato: " + candidato + " Solicitou esse valor de salário " + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
        candidatosSelecionados++;
      }
      candidatosAtual++;
    }
  }

  public  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2000);
  }

  public static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;

    if(salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if(salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contra proposta.");
    } else {
      System.out.println("Aguardando demais candidatos.");
    }
  }

}
