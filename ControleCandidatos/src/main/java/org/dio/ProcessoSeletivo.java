package org.dio;

import java.util.*;
import java.util.concurrent.*;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuaTentando = true;
    boolean atendeu = false;
    do {
      atendeu = atender();
      continuaTentando = !atendeu;
      if (continuaTentando) {
        tentativasRealizadas++;
      } else {
        System.out.println("Contato realizado com sucesso!");
      }
    } while (continuaTentando && tentativasRealizadas< 3);
    if (atendeu) {
      System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizadas + " tentativas!");
    } else  {
      System.out.println("Não foi possível contato com " + candidato + " Numero máximo de tentativas! " + tentativasRealizadas + " tentativas!");
    }
  }

  // Se o valor entre 3 for igual a 1 quer dizer que atendeu !
  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void imprimirSelecionados() {
    String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    System.out.println("Informando a lista de candidatos informando o índice do elemento");
    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice]);
    }

    System.out.println("Forma abreviada de interação for each");
    for (String candidato : candidatos) {
      System.out.println("O candidato selecionado foi " + candidato);
    }
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
