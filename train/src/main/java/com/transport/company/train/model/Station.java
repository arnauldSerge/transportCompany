package com.transport.company.train.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Station implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1432188047518538804L;
	public static Station STATION_A =  new Station("A", new HashSet<Zone>(
		      Arrays.asList(Zone.ZONE_1)) );
	
	public static Station STATION_B =  new Station("A", new HashSet<Zone>(
		      Arrays.asList(Zone.ZONE_1)) );
	
	public static Station STATION_C =  new Station("A", new HashSet<Zone>(
		      Arrays.asList(Zone.ZONE_1)) );
	public static Station STATION_D =  new Station("A", new HashSet<Zone>(
		      Arrays.asList(Zone.ZONE_1)) );
	
	
	private String name;
	private List<Zone> zones = new ArrayList<Zone>();
	
	
	
	
	private Station(String name, Set<Zone> list) {
		this.name = name;
		this.zones = zones!=null ? zones : this.zones;
	}

	

	public String getName() {
		return this.name;
	}
	
	public List<Zone> getZones() {
		return zones;
	}
	
	
	

}
