package com.controleveiculos.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.controleveiculos.model.Veiculo;

@FeignClient(name = "api-fipe", url = "https://parallelum.com.br/fipe/api/v1")
public interface FipeProxy {
		
	@GetMapping("/api-fipe/carros/marcas/{marca}/modelos/{modelo}/anos/{idModelo}")
    Veiculo buscaVeiculo(
    		@PathVariable("marca") Long marca,
    		@PathVariable("modelo") Long modelo,
    		@PathVariable("idModelo") String idModelo
    		);
}
