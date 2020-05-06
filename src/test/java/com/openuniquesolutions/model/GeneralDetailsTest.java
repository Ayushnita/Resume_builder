package com.openuniquesolutions.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class GeneralDetailsTest {

	@Test
	public void create() {
		GeneralDetailsModel g = new GeneralDetailsModel();
	}
	
	@Test
	public void createWithPerameters() {
		GeneralDetailsModel g = new GeneralDetailsModel("Ayush", "ayushnita.ece@gmail.com", "9012984443", "Banglore");
		assertEquals("Ayush", g.getName());
		assertEquals("ayushnita.ece@gmail.com", g.getEmail());
		assertEquals("9012984443", g.getMobileNumber());
		assertEquals("Banglore", g.getLocation());
	}
	
}
