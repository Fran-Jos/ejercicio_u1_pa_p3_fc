package com.example.demo.matriculacionVehicular.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacionVehicular.modelo.Matricula;
import com.example.demo.matriculacionVehicular.modelo.Propietario;
import com.example.demo.matriculacionVehicular.modelo.Vehiculo;
import com.example.demo.matriculacionVehicular.repository.ImatriculaRepository;
@Service
public class MatriculaServiceImpl implements ImatriculaService {

	@Autowired
	private ImatriculaRepository imatriculaRepository;
	@Autowired
	private ImatriculaService imatriculaService;
	@Autowired
	private IpropietarioService ipropietarioService;
	@Autowired
	private IvehiculoService ivehiculoService;
	
	
	
	@Override
	public List<Matricula> buscarMatricula() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		
		Propietario propietarioo = this.ipropietarioService.buscar(cedula);
		Vehiculo vehiculo = this.ivehiculoService.buscar(placa);
		Matricula matricula = new Matricula();
		BigDecimal valor = null;
		
		if (propietarioo != null && vehiculo != null) {
			switch (vehiculo.getTipo()) {
			case "PESADO":
				valor = vehiculo.getPrecio().multiply(new BigDecimal(0.15));
				break;
	        case "LIVIANO":
	            valor = vehiculo.getPrecio().multiply(new BigDecimal(0.10));
				break;	
			
			default:
				System.out.println("TIPO DE VEHICULO MAL INGRESADO");
				break;
			}
			if (valor.compareTo(new BigDecimal(2000)) == 1 ) { // 1 --> > // 0 --> = // -1 --> <
				BigDecimal descuento =  valor.multiply(new BigDecimal(0.7));
				valor = valor.subtract(descuento);
			}
		
	}else System.out.println("\" ERROR: DATOS MAS INGRESADOS. \"");
		
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setVehiculo(vehiculo);
		matricula.setPropietario(propietarioo);
		matricula.setValorMatricula(valor);
		
		imatriculaRepository.insertar(matricula);
		System.out.println("se genero la matricula");
		
	}



}
