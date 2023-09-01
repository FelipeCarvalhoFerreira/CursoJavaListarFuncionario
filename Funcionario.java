package ModuloDezComportamentoMemoriaArraysListaVetoresListarFuncionario;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
	}
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	public String toString() {
		return id + ", " + ", " + nome + ", " + salario;
	}
	
	public void Aumento (int porcentagemAumento) {
		salario = salario + salario * porcentagemAumento / 100;
	}
	
	
	

}
