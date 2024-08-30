package entidade;

public class funcionario {
	
	private String nome;
	private String cargo;
	protected Double salario;
	
	public funcionario(String nome, String cargo2, Double salario) {
	super();
	this.nome = nome;
	this.cargo = cargo2;
	this.salario = salario;
	}
	public double receber() {
		return salario * 0.9;
	}
}
