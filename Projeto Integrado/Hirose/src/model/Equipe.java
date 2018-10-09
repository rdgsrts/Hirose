package model;

//Tipo double será enquanto eu não invocar a class DateTime

public class Equipe 
{
	private String nomeCompletoEquipe, nomeEquipe, cidade, pais;
	
	private int tipoEquipe;
	
	private double dataFundacao;

	public String getNomeCompletoEquipe() {
		return nomeCompletoEquipe;
	}

	public void setNomeCompletoEquipe(String nomeCompletoEquipe) {
		this.nomeCompletoEquipe = nomeCompletoEquipe;
	}

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getTipoEquipe() {
		return tipoEquipe;
	}

	public void setTipoEquipe(int tipoEquipe) {
		this.tipoEquipe = tipoEquipe;
	}

	public double getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(double dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	
}
