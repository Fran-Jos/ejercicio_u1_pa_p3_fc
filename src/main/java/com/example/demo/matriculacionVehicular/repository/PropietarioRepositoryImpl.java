package com.example.demo.matriculacionVehicular.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionVehicular.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IpropietarioRepository{

	private static List<Propietario> baseDeDatos = new ArrayList<>();
	
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		
		baseDeDatos.add(propietario);
		
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Propietario propitario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	
	
}
