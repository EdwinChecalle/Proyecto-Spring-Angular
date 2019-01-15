package com.cym.spring.boot.backend.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cym.spring.boot.backend.model.I_COMPARTIDO_DETCOMPENDIO;
import com.cym.spring.boot.backend.model.service.I_COMPARTIDO_DETCOMPENDIO_Service;

@RestController
@RequestMapping("/api")
public class DetalleCompendioController {

	 @Autowired
	 I_COMPARTIDO_DETCOMPENDIO_Service compendioService;
	
	@GetMapping("/compendio")
	public List<I_COMPARTIDO_DETCOMPENDIO> listacompendio(BigDecimal Id){
		return compendioService.lista(Id);
	}
}
