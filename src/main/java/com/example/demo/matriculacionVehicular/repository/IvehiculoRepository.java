package com.example.demo.matriculacionVehicular.repository;

import com.example.demo.matriculacionVehicular.modelo.Vehiculo;

public interface IvehiculoRepository {

	public void crear(Vehiculo vehiculo);

    public Vehiculo buscar (String placa);
	
	public void actualizar(Vehiculo vehiculo);
	
	public void insertar(Vehiculo vehiculo);
	
	public void borrar(String Placa);
}
