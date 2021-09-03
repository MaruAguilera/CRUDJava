package coop.tecso.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import coop.tecso.examen.model.CuentaCorriente;
import coop.tecso.examen.repository.CuentaCorrienteRepository;

@Service
public class CuentaCorrienteService implements CuentaCorrienteRepository{
	
	@Autowired
	CuentaCorrienteRepository cuentaCorrienteRepository;

	@Override
	public List<CuentaCorriente> findAll() {
		
		return cuentaCorrienteRepository.findAll();
	}

	@Override
	public List<CuentaCorriente> findAll(Sort sort) {
		return cuentaCorrienteRepository.findAll(sort);
	}

	@Override
	public List<CuentaCorriente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaCorriente> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CuentaCorriente> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaCorriente> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<CuentaCorriente> entities) {
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
	public CuentaCorriente getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CuentaCorriente getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaCorriente> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaCorriente> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CuentaCorriente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaCorriente> S save(S entity) {
		return cuentaCorrienteRepository.save(entity);
	}

	@Override
	public Optional<CuentaCorriente> findById(Long id) {
		return cuentaCorrienteRepository.findById(id);
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
		cuentaCorrienteRepository.deleteById(id);
		
	}

	@Override
	public void delete(CuentaCorriente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends CuentaCorriente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CuentaCorriente> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaCorriente> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaCorriente> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends CuentaCorriente> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
