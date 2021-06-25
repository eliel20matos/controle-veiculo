package com.controleveiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controleveiculos.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
	
}
