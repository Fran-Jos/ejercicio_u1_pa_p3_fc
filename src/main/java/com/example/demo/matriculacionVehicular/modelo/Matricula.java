package com.example.demo.matriculacionVehicular.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
 
public class Matricula {

	private LocalDateTime  fechaMatricula;
	private BigDecimal valorMatricula;
	private Propietario Propietario;
	private Vehiculo vehiculo;
	
	// metodos get and set 
	
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Propietario getPropietario() {
		return Propietario;
	}
	public void setPropietario(Propietario propietario) {
		Propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", Propietario="
				+ Propietario + ", vehiculo=" + vehiculo + ", getFechaMatricula()=" + getFechaMatricula()
				+ ", getValorMatricula()=" + getValorMatricula() + ", getPropietario()=" + getPropietario()
				+ ", getVehiculo()=" + getVehiculo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	
}
