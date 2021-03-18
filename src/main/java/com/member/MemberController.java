package com.member;

import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.member.service.MemberService;


@RestController
@RequestMapping("/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@GetMapping("/member")
	public ResponseEntity<List<Map<String, Object>>> getSample() {
		Result resulet = new Result(memberService.getSample(), null);
		return new ResponseEntity(resulet, HttpStatus.OK);
	}
	
	@PostMapping(value = "/member", produces = "application/json")
	public ResponseEntity<List<Map<String, Object>>> PostSample() {
		Result resulet = new Result(memberService.getSample(), null);
		return new ResponseEntity(resulet, HttpStatus.OK);
	}
}
