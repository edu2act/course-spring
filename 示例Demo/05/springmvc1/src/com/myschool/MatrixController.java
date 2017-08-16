package com.myschool;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MatrixController {

	@RequestMapping(value="/pets/{petId}")
	public void findPet(@PathVariable String petId, @MatrixVariable int q){
		System.out.println(petId);
		System.out.println(q);
	}
	
//	@RequestMapping(value = "/owners/{ownerId}/pets/{petId}", method = RequestMethod.GET)
//	public void findPet(@MatrixVariable(value="q", pathVar="ownerId", defaultValue="2") int q1,
//	        @MatrixVariable(value="q", pathVar="petId") int q2) {
//		System.out.println(q1);
//		System.out.println(q2);
//		
//	}
	
	@RequestMapping(value = "/owners/{ownerId}/pets/{petId}", method = RequestMethod.GET)
	public void findPet(
	        @MatrixVariable Map<String, String> matrixVars,
	        @MatrixVariable(pathVar="ownerId") Map<String, String> petMatrixVars) {

	    System.out.println(matrixVars);
	    System.out.println(petMatrixVars);

	}
}
