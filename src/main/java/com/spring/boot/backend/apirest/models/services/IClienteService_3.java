package com.spring.boot.backend.apirest.models.services;

import java.util.List;

import com.spring.boot.backend.apirest.models.entity.Cliente_3;

public interface IClienteService_3 {
	
	public List<Cliente_3> findAll();
	
	public Cliente_3 save(Cliente_3 cliente);
	
	public Cliente_3 findById(Long id);
	
	public void delete(Long id);
}
