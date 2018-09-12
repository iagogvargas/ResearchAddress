package com.addressResearch.addressresearch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.addressResearch.models.Address;
import com.addressResearch.service.AddressService;


@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@RequestMapping(value="/Research", method = RequestMethod.POST)
	public Address form1(@RequestBody Address address ) {
		return addressService.researchaddressby(address.getCep()); 
	}
	
	@RequestMapping("/Research2")
	public String form2() {
		return "Hello Containers"; 
	}
	
}
