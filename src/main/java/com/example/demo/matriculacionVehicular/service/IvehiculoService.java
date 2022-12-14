package com.example.demo.matriculacionVehicular.service;

import com.example.demo.matriculacionVehicular.modelo.Vehiculo;

public interface IvehiculoService {
	
	public void crear(Vehiculo vehiculo);

    public Vehiculo buscar (String placa);
	
	public void actualizar(Vehiculo vehiculo);
	
	public void insertar(Vehiculo vehiculo);
	
	public void borrar(String Placa);
}
