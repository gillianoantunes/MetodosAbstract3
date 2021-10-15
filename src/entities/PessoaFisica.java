package entities;

public class PessoaFisica extends Contribuinte {
	
	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double totalImposto() {
		Double valor =0.0;
		if(super.getRendaAnual()< 20000.00) {
			 valor = (super.getRendaAnual()* 0.15) - (gastoSaude * 0.50);
		}
		else {
			 valor = (super.getRendaAnual()* 0.25) - (gastoSaude * 0.50);
		}
		return valor;
	}

}
