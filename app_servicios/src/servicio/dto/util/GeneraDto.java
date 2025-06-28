package servicio.dto.util;

import modelo.Empleado;
import servicio.dto.EmpleadoDto;

public class GeneraDto {
	public static EmpleadoDto empleadoToDto(Empleado emp) {
		return new EmpleadoDto(emp.getIdEmpleado(), emp.getNombre(), 
			emp.getApellido1() + " " + emp.getApellido2(), emp.getDepartamento().getDepartamento());
	}

}
