package com.user;

import java.util.Date;
import java.util.List;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

public class Test {

	public static void main(String[] args) {
		User u=new User();
		u.setBirthday(new Date(new Date().getTime()+1000));
		
		Errors e=new BindException(u, "User");
		Validator v=new UserValidator();
		v.validate(u, e);
		List<ObjectError> list=e.getAllErrors();
		for(ObjectError temp:list){
			System.out.println(temp.getCode());
			System.out.println(temp.getDefaultMessage());
		}

	}

}
