package com.example.SpringBootFirstDemo.Ass6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	Calci calci = new Calci();
	@GetMapping("/add{a},{b}")
	public long addition(@PathVariable long a,@PathVariable long b) {
		    return a+b;
	}
	
	@GetMapping("/subtract{a},{b}")
	public long subtraction(@PathVariable long a,@PathVariable long b) {
		    return a-b;
	}

	@GetMapping("/multiply{a},{b}")
	public long multiplication(@PathVariable long a,@PathVariable long b) {
		    return a*b;
	}
	@GetMapping("/divide{a},{b}")
	public long division(@PathVariable long a,@PathVariable long b) {
		    return a/b;
	}
    @GetMapping("/sqrt{a}")
	public double Sqrt(@PathVariable double a) {
		    return Math.sqrt(a);
	}
	
}