package com.example.demo.matriculacionVehicular.service;

import com.example.demo.matriculacionVehicular.modelo.Propietario;


public interface IpropietarioService {

	public void crear(Propietario propietario);

    public Propietario buscar (String cedula);
	
	public void borrar(String cedula);
}
