package com.naresh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.naresh.entity.Voter;
import com.naresh.service.VoterService;
@Controller
@CrossOrigin(origins = "http://localhost:4200")

public class VoterController {

	@Autowired
	private VoterService service;

	@RequestMapping("/1")
	public String showRegisterPage(Model model) {
		model.addAttribute("voter", new Voter());
		return "register";
	}
	@RequestMapping(value="/savevoter",method = RequestMethod.POST)
	public String saveVoter(@ModelAttribute("voter") Voter voter,Model model) {
		service.savevoter(voter);
		model.addAttribute("voter", new Voter());
		return "data";

	}
	@RequestMapping(value = "/edit" )
	public String edit(@RequestParam Integer id,ModelMap model) {
		Voter voter = service.getvoterbyId(id);
		model.addAttribute("voter", voter);
		return "voterEdit";
	}
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateVoter(@ModelAttribute("voterId") ModelMap model,Voter voter) {
		service.UpdateById(voter);
		List<Voter> list = service.getdata();
		model.addAttribute("list", list);
		return "ok";
	}

	@RequestMapping(value = "/3",method = RequestMethod.GET)
	public String getvoterdata(@ModelAttribute("voter") Voter voter,Model model){
		List<Voter> list=  service.getdata();
		model.addAttribute("list",list);
		return "voterdata";

	}
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam Integer id, Model model) {
		Voter voter = new Voter();
		voter.setVoterId(id);
		service.deleteById(voter);
		List<Voter> list = service.getdata();
		model.addAttribute("list", list);
		return "voterdata";

	}
}
