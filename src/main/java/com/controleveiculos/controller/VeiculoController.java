package com.controleveiculos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controleveiculos.model.Veiculo;
import com.controleveiculos.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	private List<Veiculo> veiculos = new ArrayList<>();
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@PostMapping("/cadastro")
	public Veiculo veiculos(@RequestBody Veiculo veiculos) {
		return this.veiculoRepository.save(veiculos);
	} 
}
