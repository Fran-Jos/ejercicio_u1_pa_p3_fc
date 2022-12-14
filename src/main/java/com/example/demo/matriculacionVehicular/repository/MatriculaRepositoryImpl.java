package com.example.demo.matriculacionVehicular.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionVehicular.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements ImatriculaRepository {

	@Autowired
	Matricula matricula;
	
	private static List<Matricula > baseDeDatos = new ArrayList<>();
	

	@Override
	public void crear(String propietario, String placa) {
		// TODO Auto-generated method stub
		
		System.out.println("se creo matricula");
	this.baseDeDatos.add(matricula);
	}

	@Override
	public Matricula buscar(Matricula matricula) {
		// TODO Auto-generated method stub
		return matricula;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}

}
