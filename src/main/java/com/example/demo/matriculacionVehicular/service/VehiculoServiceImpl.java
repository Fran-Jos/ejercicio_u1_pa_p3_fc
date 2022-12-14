package com.example.demo.matriculacionVehicular.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.demo.matriculacionVehicular.modelo.Vehiculo;
import com.example.demo.matriculacionVehicular.repository.IvehiculoRepository;
@Service
public class VehiculoServiceImpl implements IvehiculoService {

	@Autowired
	IvehiculoRepository ivehiculoRepository;
	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("crear");
		this.ivehiculoRepository.crear(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null ;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String Placa) {
		// TODO Auto-generated method stub
		
	}

}
