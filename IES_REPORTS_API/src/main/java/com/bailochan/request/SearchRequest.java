package com.bailochan.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {

	private String planName;
	private String planStatus;
//	private LocalDate eligStartDate;
//	private LocalDate eligEndDate;

}
