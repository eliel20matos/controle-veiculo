package com.controleveiculos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String marca;
	@Column(nullable = false)
	private String modelo;
	@Column(nullable = false)
	private Integer ano;
	@Column(nullable = false)
	private Float valor;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private User usuario;
	
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(Long id, String marca, String modelo, Integer ano, Float valor, User usuario) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.usuario = usuario;
	}


	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public Long getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public Float getValor() {
		return valor;
	}
	
}
