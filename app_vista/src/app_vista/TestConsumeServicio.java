package app_vista;

import java.util.ServiceLoader;

import servicio.provides.OtroServicio;

public class TestConsumeServicio {

	public static void main(String[] args) {
		ServiceLoader<OtroServicio> loader = ServiceLoader.load(OtroServicio.class);
		
		
		for (OtroServicio scio : loader) {
			System.out.println(scio.saluda());
		}
		
		loader.forEach(s -> System.out.println(s.saluda()));
		
		OtroServicio os = loader.findFirst().get();
		System.out.println(os.saluda());
	}
}
