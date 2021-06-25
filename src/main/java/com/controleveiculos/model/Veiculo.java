package com.controleveiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String marca;
	@NotBlank
	private String modelo;
	@NotBlank
	private Integer ano;
	@NotBlank
	private Float valor;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private User usuario;
	
	
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
