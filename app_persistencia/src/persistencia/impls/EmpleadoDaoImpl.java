package persistencia.impls;

import java.util.List;

import modelo.Empleado;
import persistencia.EmpleadoDao;

public class EmpleadoDaoImpl implements EmpleadoDao {

	@Override
	public List<Empleado> findAll() {
		return Empleado.getEmpleados();
	}

}
