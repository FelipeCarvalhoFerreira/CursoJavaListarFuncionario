package ModuloDezComportamentoMemoriaArraysListaVetoresListarFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();

		Funcionario funcionario[] = new Funcionario[n];
		List<Funcionario> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.printf("Dados do %do Funcionario:\n", i + 1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			while (verificarFuncionario(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Salario: ");
			Double salario = sc.nextDouble();

			funcionario[i] = new Funcionario(id, nome, salario);
			list.add(funcionario[i]);
		}

		System.out.print("Informe o Id do funcionário que terá aumento salarial: ");
		int idfuncionarioAumento = sc.nextInt();

		Funcionario func = list.stream().filter(Funcionario -> Funcionario.getId() == idfuncionarioAumento).findFirst().orElse(null);
		
		if (func == null) {

			System.out.println("This id does not exist!");
		} else {

			System.out.print("Informe o porcentual de aumento: ");
			int porcentagemAumento = sc.nextInt();
			func.Aumento(porcentagemAumento);

		}

		System.out.println("Lista de Funcinario: ");

		for (Funcionario atualizado : list) {
			System.out.println(atualizado);
		}

		sc.close();

	}

	public static boolean verificarFuncionario(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
