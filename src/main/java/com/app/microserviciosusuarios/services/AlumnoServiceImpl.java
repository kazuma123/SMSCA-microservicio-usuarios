package com.app.microserviciosusuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.commonsalumnos.models.Alumno;
import com.app.commonsmicroservicios.services.CommonServiceImpl;
import com.app.microserviciosusuarios.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		// TODO Auto-generated method stub
		return repository.findByNombreOrApellido(term);
	}

}
