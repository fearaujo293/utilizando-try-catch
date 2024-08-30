package entidade;

public class CLT extends funcionario {
	private double convenio;
	public CLT(String nome, String cargo, double salario, double convenio) {
			super(nome,cargo,salario);
			this.convenio = convenio;
		}
		
		
		public double receber() {
			return super.receber() - convenio;
			
		}
	}

