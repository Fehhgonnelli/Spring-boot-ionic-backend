package com.luizbarbosa.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luizbarbosa.cursomc.domain.Categoria;
import com.luizbarbosa.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
