package com.transport.company.train.model;

import java.beans.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Zone implements Serializable {
	

	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -5201619994190856627L;
	
	
	
	public final static Zone ZONE_1 = new Zone(); 
	public final static Zone ZONE_2 = new Zone(); 
	public final static Zone ZONE_3 = new Zone(); 
	public final static Zone ZONE_4 = new Zone(); 
	
	private String name;
	
	//@Transient
	private List<Station> stations = new ArrayList<Station>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Station> getStations() {
		return stations;
	}
	
	
	

}
