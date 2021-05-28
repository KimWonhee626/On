package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Player;
import com.example.demo.mapper.TestMapper;

@Controller
@RequestMapping("/")

public class TestController {

	@Autowired TestMapper testMapper;

//	@RequestMapping("test")
//    public String test(Model model) {
//        return "test";
//    }

	@RequestMapping("test")
    public String player(Model model) {
		List<Player> player = testMapper.selectAll();
		model.addAttribute("player", player);
        return "test";
    }

}
