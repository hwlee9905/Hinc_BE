package com.simple.book.global.advice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ResponseMessage {
	
	private String message;
	
	@Builder.Default
	private boolean result = true;
	
	private Object value;
}
