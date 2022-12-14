package com.example.demo.matriculacionVehicular.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.matriculacionVehicular.modelo.Matricula;


public interface ImatriculaService {

	public List<Matricula> buscarMatricula();

	
	
	public void matricular(String cedula , String placa);
}
