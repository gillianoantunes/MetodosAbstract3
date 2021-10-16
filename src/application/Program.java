package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();

		System.out.println("Entre com o número de contribuintes:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário:" + i);
			System.out.println("Pessoa física ou jurídica(f/j)?");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Renda anual: ");
			Double renda = sc.nextDouble();
			if (tipo == 'f') {
				System.out.println("Valor do gasto com saúde");
				Double gastoSaude = sc.nextDouble();
				PessoaFisica f = new PessoaFisica(nome, renda, gastoSaude);
				lista.add(f);
			} else {
				if (tipo == 'j') {
					System.out.println("Número de funcionários:");
					Integer numfuncionario = sc.nextInt();
					PessoaJuridica j = new PessoaJuridica(nome, renda, numfuncionario);
					lista.add(j);
				} else {
					System.out.println("Opção Inválida");
				}
			}
		}
		System.out.println("Dados: \n");
		Double valorTotalArrecadado= 0.0;
		for(Contribuinte c : lista) {
			System.out.println(c.getNome() + ": $" + String.format("%.2f",c.totalImposto())+"\n");
	        valorTotalArrecadado += c.totalImposto();
		}
		System.out.println("\n Total Arrecadado: $" + String.format("%.2f", valorTotalArrecadado));
	    sc.close();
	}

}
