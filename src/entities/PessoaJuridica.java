package entities;

public class PessoaJuridica extends Contribuinte {
	private Integer numFuncionario;
	
	
	public PessoaJuridica() {
		super();
	}


	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}


	public Integer getNumFuncionario() {
		return numFuncionario;
	}


	public void setNumFuncionario(Integer numFuncionario) {
		this.numFuncionario = numFuncionario;
	}


	@Override
	public Double totalImposto() {
		Double valor = 0.0;
		if(numFuncionario > 10) {
			valor = getRendaAnual() * 0.14;
		}
		else {
			valor = getRendaAnual() * 0.16;
		}
		return valor; 
	}

}
