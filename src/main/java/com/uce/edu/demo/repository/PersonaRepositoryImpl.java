package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaRepositoryImpl implements IPersonaRepository {

	// interactuar con mi base de datos
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Persona buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarId(id));
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Persona> query = this.entityManager.createQuery("Select p from Persona p", Persona.class);
		return query.getResultList();
	}

}
