package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import com.example.demo.matriculacionVehicular.modelo.Matricula;
import com.example.demo.matriculacionVehicular.modelo.Propietario;
import com.example.demo.matriculacionVehicular.modelo.Vehiculo;

import com.example.demo.matriculacionVehicular.service.ImatriculaService;
import com.example.demo.matriculacionVehicular.service.IpropietarioService;
import com.example.demo.matriculacionVehicular.service.IvehiculoService;



@SpringBootApplication
public class ProyectoExamenAnteriorApplication implements CommandLineRunner{
	
	@Autowired
	private IvehiculoService ivehiculoService;

	@Autowired
	private IpropietarioService ipropietarioService;
	@Autowired
	private ImatriculaService imatriculaService;
	

	
	public static void main(String[] args) {
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
    SpringApplication.run(ProyectoExamenAnteriorApplication.class, args);
    System.out.println("SPRING");
		
		Vehiculo v1 = new Vehiculo();
		
		v1.setMarca("toyota");
		v1.setPlaca("aaa-11");
		v1.setPrecio(new BigDecimal(15000));
		v1.setTipo("liviano");
		
		this.ivehiculoService.crear(v1);
		
		Propietario p = new Propietario();
		p.setApellido("Taco");
		p.setCedula("17433443434");
		p.setFechaDeNacimiento(LocalDateTime.now());
		p.setNombre("gabriela");
		
		this.ipropietarioService.crear(p);
		
		Matricula m1 = new Matricula();
		
		m1.setFechaMatricula(LocalDateTime.now());
		m1.setPropietario(p);
		m1.setValorMatricula(new BigDecimal(159));
		m1.setVehiculo(v1);
		
		this.imatriculaService.matricular(p.getCedula(), v1.getPlaca());
		
		System.out.println(m1);
		
		
		
	}

}
