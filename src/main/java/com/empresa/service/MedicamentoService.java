package com.empresa.service;

import java.util.List;
import com.empresa.entity.Medicamento;


public interface MedicamentoService {

	public List<Medicamento> listaMedicamentos();
	
	public Medicamento agregarMedicamento(Medicamento medicamento);
	
}
