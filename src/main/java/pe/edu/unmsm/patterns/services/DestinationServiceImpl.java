package pe.edu.unmsm.patterns.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unmsm.patterns.dao.DestinationDAO;
import pe.edu.unmsm.patterns.dto.out.DestinationDTO;
import pe.edu.unmsm.patterns.exceptions.DestinationEmptyException;
import pe.edu.unmsm.patterns.model.Destination;

@Service
public class DestinationServiceImpl implements DestinationService{

	private Map<String, List<DestinationDTO>>  parameters = new HashMap<String, List<DestinationDTO>>();
	private static final String KEY_DESTINATION = "1";
	@Autowired
	private DestinationDAO destinationDao;
	
	// Factory Flyweight
	@Override
	public List<DestinationDTO> findAllDestination() throws DestinationEmptyException, Exception {
		// TODO Auto-generated method stub
		List<DestinationDTO> lstDestinationResponse = null;
		if(!parameters.containsKey(KEY_DESTINATION )){
			List<Destination> lstDestination = destinationDao.findAll();
			if(lstDestination.isEmpty())
				throw new DestinationEmptyException();
			lstDestinationResponse = new ArrayList<>();
			for(Destination destination : lstDestination){
				DestinationDTO destinationDTO = new DestinationDTO();
			    BeanUtils.copyProperties(destinationDTO, destination);
			    lstDestinationResponse.add(destinationDTO);
			}
			System.out.println("Golpeamos la Base de Datos... ");
			parameters.put(KEY_DESTINATION, lstDestinationResponse);
		}else{
			System.out.println("Vamos a buscar a la memoria... ");
			lstDestinationResponse = parameters.get(KEY_DESTINATION);
		}
		return lstDestinationResponse;
	}

}
