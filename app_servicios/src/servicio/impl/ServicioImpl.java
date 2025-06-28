package servicio.impl;

import java.util.List;

import persistencia.EmpleadoDao;
import persistencia.impls.EmpleadoDaoImpl;
import servicio.Servicio;
import servicio.dto.EmpleadoDto;
import servicio.dto.util.GeneraDto;

public class ServicioImpl implements Servicio {

	EmpleadoDao eDao = new EmpleadoDaoImpl();
	
	@Override
	public List<EmpleadoDto> getEmpleados() {
		return eDao.findAll().stream().map(GeneraDto::empleadoToDto).toList();
	}

}
