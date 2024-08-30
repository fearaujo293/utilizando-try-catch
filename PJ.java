package entidade;

public class PJ extends funcionario{
	private double adicional;
	public PJ(String nome, String cargo, Double salario, double adicional2) {
		super(nome,cargo,salario);
		this.adicional = adicional;
	}
		public double receber() {
			return super.receber() + adicional;
		
}
}
