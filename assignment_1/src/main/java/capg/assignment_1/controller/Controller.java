package capg.assignment_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import capg.assignment_1.model.Model;
import capg.assignment_1.service.AssService;

@RestController
public class Controller {
	  
	  @Autowired private AssService service;
	 
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public ResponseEntity<List<Model>> getModelData() {
		return new ResponseEntity<List<Model>>(service.getData(),HttpStatus.ACCEPTED);
	}
}
