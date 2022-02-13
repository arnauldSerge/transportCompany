package com.transport.company.train.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Station implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1432188047518538804L;
	public static Station STATION_A =  new Station()
	
	private String name;
	private List<Zone> zones = new ArrayList<Zone>();
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Zone> getZones() {
		return zones;
	}
	
	
	

}
