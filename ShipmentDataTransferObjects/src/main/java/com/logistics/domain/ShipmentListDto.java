package com.logistics.domain;

import java.util.List;

public class ShipmentListDto {
	
	private List<ShipmentDto> shipments;
	private Integer maxPosts;
	public List<ShipmentDto> getShipments() {
		return shipments;
	}
	public void setShipments(List<ShipmentDto> shipments) {
		this.shipments = shipments;
	}
	public Integer getMaxPosts() {
		return maxPosts;
	}
	public void setMaxPosts(Integer maxPosts) {
		this.maxPosts = maxPosts;
	}
	
	

}
