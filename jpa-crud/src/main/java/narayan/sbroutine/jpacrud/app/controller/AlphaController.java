package narayan.sbroutine.jpacrud.app.controller;

import org.springframework.web.bind.annotation.RestController;

import narayan.sbroutine.jpacrud.app.service.AlphaService;

@RestController
public class AlphaController {

	private AlphaService alphaService;

	public AlphaController(AlphaService alphaService) {
		this.alphaService = alphaService;
	}
	
	

}
