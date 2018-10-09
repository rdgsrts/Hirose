package model;

// Usar double enquanto não importar DateTime

public class Classificacao 
{
	private int codEstruturaTemp, jogos, pontos, empate, vitoria, derrota, 
	vitoriaProrr, empateProrr, derrotaProrr, vitoriaPen, derrotaPen,
	golsPro, golsContra, publico, realizado;
	
	private String local;
	
	private double dataJogo;

	public int getCodEstruturaTemp() {
		return codEstruturaTemp;
	}

	public void setCodEstruturaTemp(int codEstruturaTemp) {
		this.codEstruturaTemp = codEstruturaTemp;
	}

	public int getJogos() {
		return jogos;
	}

	public void setJogos(int jogos) {
		this.jogos = jogos;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}

	public int getVitoriaProrr() {
		return vitoriaProrr;
	}

	public void setVitoriaProrr(int vitoriaProrr) {
		this.vitoriaProrr = vitoriaProrr;
	}

	public int getEmpateProrr() {
		return empateProrr;
	}

	public void setEmpateProrr(int empateProrr) {
		this.empateProrr = empateProrr;
	}

	public int getDerrotaProrr() {
		return derrotaProrr;
	}

	public void setDerrotaProrr(int derrotaProrr) {
		this.derrotaProrr = derrotaProrr;
	}

	public int getVitoriaPen() {
		return vitoriaPen;
	}

	public void setVitoriaPen(int vitoriaPen) {
		this.vitoriaPen = vitoriaPen;
	}

	public int getDerrotaPen() {
		return derrotaPen;
	}

	public void setDerrotaPen(int derrotaPen) {
		this.derrotaPen = derrotaPen;
	}

	public int getGolsPro() {
		return golsPro;
	}

	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}

	public int getGolsContra() {
		return golsContra;
	}

	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}

	public int getPublico() {
		return publico;
	}

	public void setPublico(int publico) {
		this.publico = publico;
	}

	public int getRealizado() {
		return realizado;
	}

	public void setRealizado(int realizado) {
		this.realizado = realizado;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getDataJogo() {
		return dataJogo;
	}

	public void setDataJogo(double dataJogo) {
		this.dataJogo = dataJogo;
	}
	
	
}
