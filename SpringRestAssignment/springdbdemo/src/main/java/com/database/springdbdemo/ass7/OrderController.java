package com.database.springdbdemo.ass7;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.database.springdbdemo.ass7.Orders;
import com.database.springdbdemo.ass7.OrderRepository;

@RestController
public class OrderController {

	@Autowired
	private OrderRepository orderrepo;
	
	@PostMapping("/order")
	public String addorder(@RequestBody Orders ord) {
		orderrepo.save(ord);
		return "Your Order with Id: "+ord.getOrderid()+" has been placed";
	}
	
	@RequestMapping(value="/orders/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody Orders ord) {
		orderrepo.save(ord);
	}
	
	@GetMapping("/allorders")
	public List<Orders>getords(){
		return orderrepo.findAll();
	}
	
	@DeleteMapping("/orddelete/{id}")
	public String deletebook(@PathVariable int id) {
		orderrepo.deleteById(id);
		return "Order Deleted with id :"+id;	
	}
	
	@GetMapping("/findord/{id}")
	public Optional<Orders>getord(@PathVariable int id){
		return orderrepo.findById(id);
	}
}