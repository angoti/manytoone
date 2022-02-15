package br.edu.iftm.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String nome;

	@ManyToOne
	Categoria categoria;

	public Item() {
	}

	public Item(Integer id, String nome, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "{" +
				" id='" + getId() + "'" +
				", nome='" + getNome() + "'" +
				", categoria='" + getCategoria() + "'" +
				"}";
	}

}
