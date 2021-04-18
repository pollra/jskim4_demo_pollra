package com.example.pollra.infra.exceptions;
/**
 * @since       2021.04.18
 * @author      pollra
 * @description NotFoundException
 **********************************************************************************************************************/
@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException{
	public NotFoundException() {
		super("없음잼");
	}
}
