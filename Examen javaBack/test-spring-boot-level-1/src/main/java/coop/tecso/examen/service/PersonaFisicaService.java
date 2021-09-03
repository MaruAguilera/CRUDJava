package coop.tecso.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import coop.tecso.examen.model.PersonaFisica;
import coop.tecso.examen.repository.PersonaFisicaRepository;

@Service
public class PersonaFisicaService implements PersonaFisicaRepository {
	
	@Autowired
	private PersonaFisicaRepository  personaFisicaRepository; //esto me instancia el repo

	@Override
	public List<PersonaFisica> findAll() {
		return personaFisicaRepository.findAll();
	}

	@Override
	public List<PersonaFisica> findAll(Sort sort) {
		return personaFisicaRepository.findAll(sort);
	}

	@Override
	public List<PersonaFisica> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PersonaFisica> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends PersonaFisica> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PersonaFisica> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<PersonaFisica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonaFisica getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaFisica getById(Long id) {
		
	 return personaFisicaRepository.getById(id);
	}

	@Override
	public <S extends PersonaFisica> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PersonaFisica> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PersonaFisica> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PersonaFisica> S save(S entity) {
		return personaFisicaRepository.save(entity);
	}

	@Override
	public Optional<PersonaFisica> findById(Long id) {
		
		return personaFisicaRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		personaFisicaRepository.deleteById(id);
		
	}

	@Override
	public void delete(PersonaFisica entity) {
		personaFisicaRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends PersonaFisica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends PersonaFisica> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PersonaFisica> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PersonaFisica> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends PersonaFisica> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
