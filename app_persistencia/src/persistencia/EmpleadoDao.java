package persistencia;

import java.util.List;

import modelo.Empleado;

public interface EmpleadoDao {
	
	List<Empleado> findAll();
	
}
