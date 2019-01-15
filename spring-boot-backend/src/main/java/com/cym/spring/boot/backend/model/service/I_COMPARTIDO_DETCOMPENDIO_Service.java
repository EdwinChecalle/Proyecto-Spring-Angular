package com.cym.spring.boot.backend.model.service;

import java.math.BigDecimal;
import java.util.List;

import com.cym.spring.boot.backend.model.I_COMPARTIDO_DETCOMPENDIO;

public interface I_COMPARTIDO_DETCOMPENDIO_Service {

	public List<I_COMPARTIDO_DETCOMPENDIO> lista(BigDecimal Id);
}
