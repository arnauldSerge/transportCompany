package com.transport.company.train.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Zone implements Serializable {
	

	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -5201619994190856627L;
	
	public final static Zone ZONE_1 = new Zone(); 
	public final static Zone ZONE_2 = new Zone(); 
	public final static Zone ZONE_3 = new Zone(); 
	public final static Zone ZONE_4 = new Zone(); 
	
	private int order;
	
	//@Transient
	private Set<Station> stations = new HashSet<Station>();

	public int getOrder() {
		return this.order;
	}

	public Set<Station> getStations() {
		return stations;
	}
}
