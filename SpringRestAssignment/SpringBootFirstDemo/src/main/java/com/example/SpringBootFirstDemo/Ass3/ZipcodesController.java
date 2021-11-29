package com.example.SpringBootFirstDemo.Ass3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipcodesController {
	
	@Autowired
	private ZipcodesService zipcodesService;
	
	@RequestMapping("/zipcodes")
	public List<Zipcodes> getAllZipcodes()
	{
		return zipcodesService.getAllZipcodes();
	}
	
	@RequestMapping("/zipcodes/{zip}")
	public Zipcodes getZip(@PathVariable String zip)
	{
		return zipcodesService.getZip(zip);
	}

}
