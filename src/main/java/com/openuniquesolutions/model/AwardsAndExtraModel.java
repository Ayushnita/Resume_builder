package com.openuniquesolutions.model;

import java.util.List;

public class AwardsAndExtraModel {

	private List<String> extrasAndAwards;

	public AwardsAndExtraModel() {
	}

	public AwardsAndExtraModel(List<String> extrasAndAwards) {
		this.extrasAndAwards = extrasAndAwards;
	}

	public List<String> getExtrasAndAwards() {
		return extrasAndAwards;
	}

	public void setExtrasAndAwards(List<String> extrasAndAwards) {
		this.extrasAndAwards = extrasAndAwards;
	}
	
	public void setExtrasAndAwards(String extraAndAward) {
		this.extrasAndAwards.add(extraAndAward);
	}
}
