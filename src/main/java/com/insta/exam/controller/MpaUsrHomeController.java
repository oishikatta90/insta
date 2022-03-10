package com.insta.exam.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MpaUsrHomeController {
	
	@RequestMapping("/mpaUsr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕!";
	}
	
	@RequestMapping("/mpaUsr/home/main2")
	@ResponseBody
	public String showMain2() {
		return "잘가!";
	}

	@RequestMapping("/mpaUsr/home/main3")
	@ResponseBody
	public int showMain3(int a, int b) {
		return a+b;
	}

	@RequestMapping("/mpaUsr/home/main4")
	@ResponseBody
	public int[] showMain4() {
		int arr[] = new int[] {1,2,3};
		return arr;
	}

	@RequestMapping("/mpaUsr/home/main5")
	@ResponseBody
	public List<Integer> showMain5() {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		
		return l;
	}

	@RequestMapping("/mpaUsr/home/main6")
	@ResponseBody
	public Map<String, Object> showMain6() {
		Map<String, Object> m = new HashMap<>();
		m.put("철수나이", 20);
		m.put("영희나이", 22);
		
		return m;
	}
	
}
