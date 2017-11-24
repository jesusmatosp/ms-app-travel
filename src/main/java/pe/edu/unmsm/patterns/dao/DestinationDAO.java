package pe.edu.unmsm.patterns.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unmsm.patterns.model.Destination;

@Repository
public interface DestinationDAO extends JpaRepository<Destination, Integer> {

}
