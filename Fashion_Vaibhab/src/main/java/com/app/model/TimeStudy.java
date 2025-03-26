package com.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeStudy {

	@Id
	private String id;
	private String OperatorName;
	private String OperatorId;
	private String OperationName;
	private String section;
	private String machineType;
	private String folder; //ask him
	private List<String> laps; // mm:ss:SSS format
	private List<Long> lapsMS; // Received in request (milliseconds)
	private String avgTime; // Average time in mm:ss:SSS
	private Integer capacityPH; // Production Per Hour
	private Integer capacityPD;
	private Double allowanceTime;
	private String remarks;
}
