package com.transport.company.train.enums;

import com.transport.company.train.model.Zone;

public enum Cost {
	ZONE_1_2(Zone.ZONE_1,Zone.ZONE_2,3.1d ),
	ZONE_1_3(Zone.ZONE_1,Zone.ZONE_2,3.1d );
	
	
	private final Zone zone_1;
    private final Zone zone_2;
    private final Double price;
    
    Cost(Zone zoneA, Zone zoneB, Double price ) {
        this.zone_1 = zoneA;
        this.zone_2 = zoneB;
        this.price = price; 
    }
    
    
    public double getPrice(Zone depart, Zone Arrive) {
    	return 0d;
    }

}
