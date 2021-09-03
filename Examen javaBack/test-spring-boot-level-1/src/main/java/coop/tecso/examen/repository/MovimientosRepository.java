package coop.tecso.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coop.tecso.examen.model.Movimientos;

public interface MovimientosRepository extends JpaRepository<Movimientos, Long> {

}
