package com.openuniquesolutions.beans;

import java.util.List;

import com.openuniquesolutions.model.UserModel;

public class UsersResultBean {

	int size;
	List<UserModel> data;
	
	public UsersResultBean(int size, List<UserModel> data) {
		this.size = size;
		this.data = data;
	}
	
	public int getSize() {
		return size;
	}
	public List<UserModel> getData() {
		return data;
	}

}
