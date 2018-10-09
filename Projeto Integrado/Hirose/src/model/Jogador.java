package model;

// importar a classe DateTime

public class Jogador
{
	private int codTemporada, codEquipe, numeroCamisa, posicao;
	private String apelidoJogador, nomeJogador, nacionalidade, status,email;
	private double dataNascimento; // colocar como DateTime

	//SETTERS//

	/*tipo Int*/

	public void setCodTemporada(int codTemporada)
	{
		this.codTemporada = codTemporada;
	}

	public void setCodEquipe(int codEquipe)
	{
		this.codEquipe = codEquipe;
	}

	public void setNumeroCamisa(int numeroCamisa)
	{
		this.numeroCamisa = numeroCamisa;
	}

	public void setPosicao(int posicao)
	{
		this.posicao = posicao;
	}

	/*tipo String*/

	public void setApelidoJogador(String apelidoJogador)
	{
		this.apelidoJogador = apelidoJogador;
	}

	public void setNomeJogador(String nomeJogador)
	{
		this.nomeJogador = nomeJogador;
	}

	public void setNacionalidade(String nacionalidade)
	{
		this.nacionalidade = nacionalidade;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	/*tipo Double*/

	public void setDataNascimento(double dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	//SETTERS// 

	//GETTERS//

	/*tipo Int*/
	
	public int getCodTemporada()
	{
		return codTemporada;
	}

	public int getCodEquipe()
	{
		return codEquipe;
	}

	public int getNumeroCamisa()
	{
		return numeroCamisa;
	}
	

	public int getPosicao()
	{
		return posicao;
	}

	/*tipo String*/

	public String getApelidoJogador()
	{
		return apelidoJogador;
	}

	public String getNomeJogador()
	{
		return nomeJogador;
	}

	public String getNacionalidade()
	{
		return nacionalidade;
	}

	public String getStatus()
	{
		return status;
	}

	public String getEmail()
	{
		return email;
	}

	/*tipo Double*/

	public double getDataNascimento()
	{
		return dataNascimento;
	}

	//GETTERS//
}