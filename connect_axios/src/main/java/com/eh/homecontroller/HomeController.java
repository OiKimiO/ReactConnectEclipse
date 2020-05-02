package com.eh.homecontroller;


import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.homeVo.homeVo;
import com.eh.homeservice.homeService;


@RestController
public class HomeController {
		
		@Inject homeService service;

		@RequestMapping(value = "/")
		public List<homeVo> test() {		
			List<homeVo> vo = service.readDB();		
			System.out.println(vo.get(0));

			return vo;
		}
		
		@RequestMapping(value = "/init")
		public List<homeVo> home() {		
			List<homeVo> vo = service.readDB();		

			return vo;
		}
		
		
}
