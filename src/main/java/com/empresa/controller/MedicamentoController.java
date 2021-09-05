package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService service;
	
	@GetMapping
	public ResponseEntity<List<Medicamento>> listarTodosMedicamentos(){
		List<Medicamento> lista = service.listaMedicamentos();
		return ResponseEntity.ok(lista);	
	}
	
	@PostMapping
    public ResponseEntity<Object> registrar(@RequestBody Medicamento medicamento) {
        Medicamento medicamentoGuardado = service.agregarMedicamento(medicamento);
        return ResponseEntity.ok(medicamentoGuardado);   
    }
}
