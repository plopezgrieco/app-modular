package app_vista;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import servicio.Servicio;
import servicio.impl.ServicioImpl;

public class Main {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		Servicio scio = new ServicioImpl();
		scio.getEmpleados().forEach(System.out::println);
		
		System.out.println("-----------");
		
		HttpRequest req = HttpRequest.newBuilder() // Representa la solicitud
				
				.uri(new URI("https://jsonplaceholder.typicode.com/posts/"))
				.build();
			
			HttpResponse<String> resp = HttpClient.newHttpClient()
				.send(req, BodyHandlers.ofString());
			
			System.out.println(resp.body());

	}

}
