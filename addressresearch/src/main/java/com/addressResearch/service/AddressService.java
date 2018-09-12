package com.addressResearch.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.addressResearch.models.Address;


@Service
public class AddressService {

	public Address researchaddressby(String cep) {
		RestTemplate template = new RestTemplate();
		return template.getForObject("http://viacep.com.br/ws/{cep}/json",Address.class, cep);
	}
}
