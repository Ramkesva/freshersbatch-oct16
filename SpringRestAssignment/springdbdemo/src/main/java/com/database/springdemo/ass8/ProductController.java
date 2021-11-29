package com.database.springdemo.ass8;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository prodrepo;
	@PostMapping("/addProduct")
	public int saveBook(@RequestBody Products product ) {
	prodrepo.save(product);
	return product.getId();
}
	@GetMapping("/findProd/{id}")
	public Optional<Products> getProduct(@PathVariable int id)
	{
        return prodrepo.findById(id);
	}
	
	@DeleteMapping("/deleteprod/{id}")
	public String deleteProduct(@PathVariable int id) {
		prodrepo.deleteById(id);
		return "Product deleted with id: " +id;
	}
	
	@GetMapping("/findAll")
	public List<Products> getBooks()
	{
		return prodrepo.findAll();
	}

	@PutMapping("/updateProd")
 public void updateProduct(@RequestBody Products product) {
	if (product != null)
	    prodrepo.save(product);
}

}
