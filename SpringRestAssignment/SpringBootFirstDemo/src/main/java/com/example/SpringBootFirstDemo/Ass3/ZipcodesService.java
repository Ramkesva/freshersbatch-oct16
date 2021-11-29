package com.example.SpringBootFirstDemo.Ass3;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ZipcodesService {
	
	private List<Zipcodes> zipcodes = Arrays.asList(
			new Zipcodes("1001","Andhrapradesh","Vizag","India"),
			new Zipcodes("1002","Palace","Sydney","USA"),
			new Zipcodes("1003","Bangalore","Karnataka","UK")
			);
	
	public List<Zipcodes> getAllZipcodes(){
		return zipcodes;
	}
	
	public Zipcodes getZip(String zip)
	{
		return zipcodes.stream().filter(t -> t.getZip().equals(zip)).findFirst().get();
	}

}
