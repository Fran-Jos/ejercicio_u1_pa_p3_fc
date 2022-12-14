package com.example.demo.matriculacionVehicular.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionVehicular.modelo.Vehiculo;
@ Repository
public class VehiculoRepositoryImpl implements IvehiculoRepository{

	
	private static List<Vehiculo> baseDeDatos = new ArrayList<>();
	
	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
		baseDeDatos.add(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placaa) {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculoo = null;
		
		//if (vehiculo.getPlaca().equals(placaa)) {
			//return vehiculo ;
		//}else 
		for (Vehiculo vehiculo : baseDeDatos) {
		if (vehiculo.getPlaca().equals(placaa)) {
		return vehiculo ;
		}else return null;
		}
		return null;
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo ) {
		// TODO Auto-generated method stub
		
		if (buscar(vehiculo.getPlaca()).equals(vehiculo)) {
			baseDeDatos.remove(vehiculo);
		}
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
