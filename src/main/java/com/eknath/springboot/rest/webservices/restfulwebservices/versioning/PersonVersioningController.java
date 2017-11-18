package com.eknath.springboot.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	//URI version
	@GetMapping("/v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Bob Reddy");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Bob","Reddy"));
	}
	
	//Request param version
	@GetMapping(value ="/person/param", params="version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Bob Reddy");
	}
	
	@GetMapping(value ="/person/param", params="version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Bob","Reddy"));
	}
	
	//Header Version
	@GetMapping(value ="/person/header", headers="X_API_VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Bob Reddy");
	}
	
	@GetMapping(value ="/person/header", headers="X_API_VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Bob","Reddy"));
	}
	
	//Media type or mining version (content negotiation or accept header)
	@GetMapping(value ="/person/produces", produces="application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		return new PersonV1("Bob Reddy");
	}
	
	@GetMapping(value ="/person/produces", produces="application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2(new Name("Bob","Reddy"));
	}
}
