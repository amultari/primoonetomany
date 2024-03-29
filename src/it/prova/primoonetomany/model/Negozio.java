package it.prova.primoonetomany.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Negozio {

	private Long id;
	private String nome;
	private String indirizzo;
	private LocalDate dataApertura;
	private List<Articolo> articoli = new ArrayList<>();

	public Negozio() {
	}

	public Negozio(String nome, String indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public Negozio(Long id, String nome, String indirizzo, LocalDate dataApertura) {
		super();
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.dataApertura = dataApertura;
	}

	public Negozio(String nome, String indirizzo, LocalDate dataApertura) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.dataApertura = dataApertura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<Articolo> getArticoli() {
		return articoli;
	}

	public void setArticoli(List<Articolo> articoli) {
		this.articoli = articoli;
	}

	public LocalDate getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(LocalDate dataApertura) {
		this.dataApertura = dataApertura;
	}

	@Override
	public String toString() {
		return "Negozio [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}

}
