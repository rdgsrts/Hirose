package model;

public class Temporada 
{
	private String nomeTemporada, descricao, sqlDesempate;
	
	private int ptsVitoria, ptsEmpate, ptsVitoriaProrr, ptsEmpateProrr,
	ptsDerrotaProrr, ptsVitoriaPen, ptsDerrotaPen;
	
	private int numTimePromovido, numTimeCompet1, numTimeCompet2,
	numTimePORebaixamento, numTimeRebaixado, numFases;

	public String getNomeTemporada() {
		return nomeTemporada;
	}

	public void setNomeTemporada(String nomeTemporada) {
		this.nomeTemporada = nomeTemporada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSqlDesempate() {
		return sqlDesempate;
	}

	public void setSqlDesempate(String sqlDesempate) {
		this.sqlDesempate = sqlDesempate;
	}

	public int getPtsVitoria() {
		return ptsVitoria;
	}

	public void setPtsVitoria(int ptsVitoria) {
		this.ptsVitoria = ptsVitoria;
	}

	public int getPtsEmpate() {
		return ptsEmpate;
	}

	public void setPtsEmpate(int ptsEmpate) {
		this.ptsEmpate = ptsEmpate;
	}

	public int getPtsVitoriaProrr() {
		return ptsVitoriaProrr;
	}

	public void setPtsVitoriaProrr(int ptsVitoriaProrr) {
		this.ptsVitoriaProrr = ptsVitoriaProrr;
	}

	public int getPtsEmpateProrr() {
		return ptsEmpateProrr;
	}

	public void setPtsEmpateProrr(int ptsEmpateProrr) {
		this.ptsEmpateProrr = ptsEmpateProrr;
	}

	public int getPtsDerrotaProrr() {
		return ptsDerrotaProrr;
	}

	public void setPtsDerrotaProrr(int ptsDerrotaProrr) {
		this.ptsDerrotaProrr = ptsDerrotaProrr;
	}

	public int getPtsVitoriaPen() {
		return ptsVitoriaPen;
	}

	public void setPtsVitoriaPen(int ptsVitoriaPen) {
		this.ptsVitoriaPen = ptsVitoriaPen;
	}

	public int getPtsDerrotaPen() {
		return ptsDerrotaPen;
	}

	public void setPtsDerrotaPen(int ptsDerrotaPen) {
		this.ptsDerrotaPen = ptsDerrotaPen;
	}

	public int getNumTimePromovido() {
		return numTimePromovido;
	}

	public void setNumTimePromovido(int numTimePromovido) {
		this.numTimePromovido = numTimePromovido;
	}

	public int getNumTimeCompet1() {
		return numTimeCompet1;
	}

	public void setNumTimeCompet1(int numTimeCompet1) {
		this.numTimeCompet1 = numTimeCompet1;
	}

	public int getNumTimeCompet2() {
		return numTimeCompet2;
	}

	public void setNumTimeCompet2(int numTimeCompet2) {
		this.numTimeCompet2 = numTimeCompet2;
	}

	public int getNumTimePORebaixamento() {
		return numTimePORebaixamento;
	}

	public void setNumTimePORebaixamento(int numTimePORebaixamento) {
		this.numTimePORebaixamento = numTimePORebaixamento;
	}

	public int getNumTimeRebaixado() {
		return numTimeRebaixado;
	}

	public void setNumTimeRebaixado(int numTimeRebaixado) {
		this.numTimeRebaixado = numTimeRebaixado;
	}

	public int getNumFases() {
		return numFases;
	}

	public void setNumFases(int numFases) {
		this.numFases = numFases;
	}
	
	
}
