package com.tka;

import org.springframework.stereotype.Component;

@Component
public class Bank {

	public void deposite() {
		System.out.println("Amount Deposite Logic");
	}

	public void withdraw() {
		System.out.println("Amount withdraw Logic");
	}

}
