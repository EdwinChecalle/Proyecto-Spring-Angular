package com.cym.spring.boot.backend.model.service.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cym.spring.boot.backend.model.I_COMPARTIDO_DETCOMPENDIO;
import com.cym.spring.boot.backend.model.dao.I_COMPARTIDO_DETCOMPENDIO_Dao;
import com.cym.spring.boot.backend.model.service.I_COMPARTIDO_DETCOMPENDIO_Service;

@Service
public class I_COMPARTIDO_DETCOMPENDIO_ServiceImpl implements I_COMPARTIDO_DETCOMPENDIO_Service{

	@Autowired
	I_COMPARTIDO_DETCOMPENDIO_Dao dao;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<I_COMPARTIDO_DETCOMPENDIO> lista(BigDecimal Id) {
		return (List<I_COMPARTIDO_DETCOMPENDIO>) dao.findAllById((Iterable<BigDecimal>) Id);
	}

}
