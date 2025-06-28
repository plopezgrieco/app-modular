module app.servicios {
	requires app.persistencia;
	
	exports servicio;
	exports servicio.impl;
	exports servicio.dto;
	exports servicio.provides;
	
	//en un descriptro puede aparecer sólo una implementación pero podría tener
	// otra en otro módulo, por eso ServiceLoader tiene una colección
	provides servicio.provides.OtroServicio with servicio.provides.impl.OtroServicioImpl1;
}