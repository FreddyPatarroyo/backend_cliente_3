package com.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.backend.apirest.models.dao.IClienteDao_3;
import com.spring.boot.backend.apirest.models.entity.Cliente_3;

public class ClienteServiceImplement_3 implements IClienteService_3{
	
	@Autowired
	private IClienteDao_3 clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente_3> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente_3>) clienteDao.findAll();
	}

	@Override
	public Cliente_3 save(Cliente_3 cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente_3 findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

}
