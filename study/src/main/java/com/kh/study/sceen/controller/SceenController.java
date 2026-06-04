package com.kh.study.sceen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.study.sceen.model.dto.FindKeywordDto;
import com.kh.study.sceen.model.service.SceenService;

@RestController
@RequestMapping("/api/sceens")
@CrossOrigin("*")
public class SceenController {
	
/*	@Autowired
	private SceenService service;
	
	@GetMapping
	public String getResult(@RequestParam(value="page") int page) {
		return service.getResult(page);
	}
	
	@GetMapping("/search/{keyword}")
	public String findByKeyword(@PathVariable(value="keyword") String keyword, @RequestParam(value="page") int page){
		System.out.println(keyword);
		System.out.println(page);*/
		
		//String sceens = service.findByKeyword(new FindKeywordDto(keyword, page));
		
		/*return null;*/
		//return service.findByKeyword(keyword, page);
		/* } */
}
