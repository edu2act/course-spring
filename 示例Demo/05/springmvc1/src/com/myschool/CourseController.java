package com.myschool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
	
	CourseService courseService=null;
	
	@RequestMapping("/course/list")
	public String list(@RequestParam("courseId") int courseId,
			@RequestParam(value="pageNum", required=true, defaultValue="1") int pageNum){
		
		return "";
	}
	
	@RequestMapping("/course/list")
	@ResponseBody
	public String checkCourseExist(@RequestParam("courseName") String courseName){
		//检查该课程是否存在
		boolean isExist = courseService.checkCourse(courseName);
		if(isExist){
			return "{isExist:true}";
		}else{
			return "{isExist:true}";
		}
		
	}

}
