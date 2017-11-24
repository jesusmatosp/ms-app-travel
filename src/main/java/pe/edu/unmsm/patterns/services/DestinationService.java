package pe.edu.unmsm.patterns.services;

import java.util.List;

import pe.edu.unmsm.patterns.dto.out.DestinationDTO;
import pe.edu.unmsm.patterns.exceptions.DestinationEmptyException;

public interface DestinationService {

	public List<DestinationDTO> findAllDestination() throws DestinationEmptyException, Exception;
}
