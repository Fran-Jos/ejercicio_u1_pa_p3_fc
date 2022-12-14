package com.example.demo.matriculacionVehicular.repository;

import com.example.demo.matriculacionVehicular.modelo.Propietario;

public interface IpropietarioRepository {
	public void crear(Propietario propietario);

    public Propietario buscar (String cedula);
	
	public void actualizar(Propietario propitario);
	
	public void insertar(Propietario propietario);
	
	public void borrar(String cedula);
}
