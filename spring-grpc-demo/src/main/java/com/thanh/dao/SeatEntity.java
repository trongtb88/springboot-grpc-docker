package com.thanh.dao;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Builder
@Getter
@Setter
public class SeatEntity  {

	@EmbeddedId
	private SeatIdentity seatIdentity;
	
	private String status;

	public SeatEntity() {}

	public SeatEntity(int row, int column, String status) {
		super();
		this.seatIdentity.setIndexColumn(row);
		this.seatIdentity.setIndexRow(column);
		this.setStatus(status);
	}

	public SeatEntity(SeatIdentity seatIdentity, String status) {
		super();
		this.setSeatIdentity(seatIdentity);
		this.setStatus(status);
	}

	@Override
	public String toString() {
		return "SeatEntity [row=" + seatIdentity.getIndexRow() + ", column=" + seatIdentity.getIndexColumn() + ", status=" + status + "]";
	}

}