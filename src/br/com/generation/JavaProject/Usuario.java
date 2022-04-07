package br.com.generation.JavaProject;

public class Usuario extends Cadastro{
	
	//Atributos --> variaveis
	private String identiGenero;
	private String OrientSexo;
	private String etnia;
	private double renda;
	
	////Método --> Getters e Setters
	public String getIdentiGenero() {
		return identiGenero;
	}
	public void setIdentiGenero(String identiGenero) {
		this.identiGenero = identiGenero;
	}
	public String getOrientSexo() {
		return OrientSexo;
	}
	public void setOrientSexo(String orientSexo) {
		OrientSexo = orientSexo;
	}
	public String getEtnia() {
		return etnia;
	}
	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	private String profissao;
	private int idade;
}
