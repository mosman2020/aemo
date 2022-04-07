package com.aemo.test.service.impl;

import org.springframework.stereotype.Service;

import com.aemo.test.domain.Input;
import com.aemo.test.service.MatchService;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class MatchServiceImpl implements MatchService{

	static final Logger log = LoggerFactory.getLogger(MatchServiceImpl.class);
	
	
	@Override
	public List<Integer> match(Input input) {
		// TODO Auto-generated method stub
		log.info("Service match executes with params:"+input);
		List<Integer> positions = new ArrayList<Integer>();
		String text = input.getText();
		String subtext = input.getSubtext();
		int i = 0;
		while (i < text.length() && text.indexOf(subtext, i) != -1) {
			int index = text.indexOf(subtext, i);
			positions.add(index);
//			i= index+subtext.length();
			i = index + 1;
		}
		log.info("Response is : "+positions);
		return positions;
	}

}
