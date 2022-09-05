package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaService {

	public Persona buscarId(Integer id);

	public void insertar(Persona persona);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);

	public List<Persona> buscarTodos();
}
