package com.aemo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aemo.test.domain.Input;
import com.aemo.test.service.MatchService;

@RestController
@RequestMapping("/api/v1/match")
public class MatchController {

	@Autowired
    MatchService matchService;
	
	@GetMapping("/strings")
	public ResponseEntity<List<Integer>> getMatchPosition(@RequestBody Input input) {
		return ResponseEntity.ok(matchService.match(input));
	}
}
