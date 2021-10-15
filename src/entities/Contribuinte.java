package entities;

public abstract class Contribuinte {
	private String nome;
	private Double rendaAnual;
	
	
	public Contribuinte() {
		
	}


	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	//método abstract que não pode ser implmentando
	//a classe se trona abstract pois tem um método abstract
	public abstract Double totalImposto();
}
