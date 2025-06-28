module app.vista {
	requires app.servicios;
	
	requires java.net.http;
	requires java.security.sasl;
	requires jdk.crypto.ec;
	
	uses servicio.provides.OtroServicio;
}