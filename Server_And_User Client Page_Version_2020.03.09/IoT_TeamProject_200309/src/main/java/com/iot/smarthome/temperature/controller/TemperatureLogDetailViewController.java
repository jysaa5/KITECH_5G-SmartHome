package com.iot.smarthome.temperature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.temperature.service.TemperatureLogDetailViewService;

//TemperatureLogDetailViewController: temperature 로그를 자세히 보여주는 페이지로 이동해주는 컨트롤러
@Controller
public class TemperatureLogDetailViewController {

	//객체 주입
	@Autowired
	TemperatureLogDetailViewService logDetailViewService;
	
	//humidityLogDetailView 메서드: 사용자가 CCTV 로그를 자세히 보기 위해 제목을 클릭할때 실행되는 메서드
	//Model에 저장
	@RequestMapping("/temperature/temperatureLogDetailView")
	public String temperatureLogDetailView(@RequestParam(value = "temperatureLogIdx", defaultValue = "-1") int temperatureLogIdx, Model model) {
		
		model.addAttribute("temperatureLogDetailView", logDetailViewService.getTemperatureLogDetailView(temperatureLogIdx));
		
		return "temperature/temperatureLogDetailView";
		
	}//temperatureLogDetailView 메서드 끝
	
}//TemperatureLogDetailViewController 클래스 끝
