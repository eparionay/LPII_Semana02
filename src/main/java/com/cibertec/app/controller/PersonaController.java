package com.cibertec.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.app.entity.Estudiante;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	
	
	@GetMapping("/inicio")
	public String inicio() {
		return "inicio";
	}

	@GetMapping("/contacto")
	public String contacto(Model model) {
		model.addAttribute("p_nombre", "Juan");
		model.addAttribute("p_apellido", "Ramirez");
		model.addAttribute("p_codigo", "i202078945");
		model.addAttribute("p_carrera", "Computacion");
		model.addAttribute("p_ciclo", "IV");
		model.addAttribute("p_ciclo", "Lenguaje de Programacion");
		return "contacto";
	}

	@GetMapping("/reporte")
	public String reporte(Model model) {
		model.addAttribute("listaEstudiante", lista());
		return "reporte";
	}

	public List<Estudiante> lista() {
		List<Estudiante> lista = new ArrayList<Estudiante>();
		lista.add(new Estudiante("i2020", "Juan", "Reyes", "Computacion e Informatica", "IV", "LPII"));
		lista.add(new Estudiante("i2021", "Juana", "Mendoza", "Diseño Grafico", "IV", "Dibujo I"));
		return lista;
	}
	
	
	
	@GetMapping("/formularioCrearPersona")
	public String formularioCrearPersona() {
		return "/persona/crear";
	}
	
	@PostMapping("/guardarPersona")
	public String formularioCrearPersona(String codigo) {
		
		System.out.println("Codigo : " + codigo);
		return "";
	}
	
	
	
	

}
