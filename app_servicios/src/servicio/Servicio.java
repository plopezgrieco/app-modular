package servicio;

import java.util.List;

import servicio.dto.EmpleadoDto;

public interface Servicio {
	
	List<EmpleadoDto> getEmpleados();	
	
}
