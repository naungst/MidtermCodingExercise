package com.cisc181.core;

public class PersonException extends Exception {

	private Person p;

	public PersonException(Person p1) {
		super();
		this.p = p1;
	}
	
	protected Person getP() {
		return this.p;
	}

}
