package com.example.demo.matriculacionVehicular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacionVehicular.modelo.Propietario;
import com.example.demo.matriculacionVehicular.repository.IpropietarioRepository;

@Service
public class PropietarioServiceImpl implements IpropietarioService {

	@Autowired
	IpropietarioRepository ipropietarioRepository;
	
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		
		this.ipropietarioRepository.crear(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.ipropietarioRepository.borrar(cedula);
	}
}
