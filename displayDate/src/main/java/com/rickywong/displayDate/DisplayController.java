package com.rickywong.displayDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/")
class DisplayController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
		String date = sdf.format(new Date());
		
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss" );
		String time = sdf.format(date);
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
