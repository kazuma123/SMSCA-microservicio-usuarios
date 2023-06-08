package com.app.microserviciosusuarios.services;

import java.util.List;

import com.app.commonsalumnos.models.Alumno;
import com.app.commonsmicroservicios.services.CommonService;

public interface AlumnoService extends CommonService<Alumno>{
	public List<Alumno> findByNombreOrApellido(String term);
}
