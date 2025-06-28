module app.persistencia{
	requires transitive app.modelo;
	
	exports persistencia;
	exports persistencia.impls;
}