package com.example.demo.matriculacionVehicular.repository;

import java.util.List;

import com.example.demo.matriculacionVehicular.modelo.Matricula;

public interface ImatriculaRepository {

	

	public void crear(String propietario , String placa );

    public Matricula buscar (Matricula matricula);
	
	public void actualizar(Matricula matricula);
	
	public void insertar(Matricula matricula);
	
	public void borrar(Matricula matricula);
}
