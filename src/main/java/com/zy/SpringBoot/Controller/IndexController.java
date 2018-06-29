package com.zy.SpringBoot.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.SpringBoot.entity.TestVo;

@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String index(ModelMap map){
		map.addAttribute("host","http://aaaa.com");
		return "index";
	}
	
	
	@RequestMapping(value="/test")
	public String thymeleaf(ModelMap map){
		List<TestVo> testVos=new ArrayList<TestVo>();
        testVos.add(new TestVo("数学",10,1,new Date()));
        testVos.add(new TestVo("数学0001",70,2,new Date()));
        testVos.add(new TestVo("数学01",100,3,new Date()));
        map.put("test",testVos);
		return "index";
	}
}
