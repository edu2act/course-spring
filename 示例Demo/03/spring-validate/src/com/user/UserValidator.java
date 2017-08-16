package com.user;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return User.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmpty(arg1, "id", "id can't be null", "id不能为空");
		User u=(User)arg0;
		ValidationUtils.rejectIfEmpty(arg1, "name", "name.empty", "用户名不能为空");
		if(u.getBirthday().getTime()>new Date().getTime()){
			arg1.rejectValue("birthday", "birthday.wrong", "出生日期不能晚于当前时间");
		}
	}

}
