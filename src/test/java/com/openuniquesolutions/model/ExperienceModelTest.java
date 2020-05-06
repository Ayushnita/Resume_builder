package com.openuniquesolutions.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ExperienceModelTest {

	@Test
	void testExperienceModel() {
		ExperienceModel e = new ExperienceModel();
	}

	@Test
	void testExperienceModelWithPermeters() {
		ExperienceModel e = new ExperienceModel("Associate Software Engineer",
											"Synechron",
											"Worked as a Associate Software Eng",
											new Date(2020,8, 12), new Date(2020,8, 05), new String[] {"Java", "String",
													"Git"});
		
		assertEquals("Associate Software Engineer", e.getDestination());
	}

}
