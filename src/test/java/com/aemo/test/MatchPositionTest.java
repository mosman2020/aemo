package com.aemo.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.aemo.test.domain.Input;
import com.aemo.test.service.MatchService;



@SpringBootTest
class MatchPositionTest {

	@Autowired
	MatchService matchService;
	
	@Test
	void test() {
		Input input = Input.builder().text("texttexttext").subtext("text").build();
		List<Integer> response = matchService.match(input);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(4);  
		expected.add(8);
		assertNotNull(response);
		Assertions.assertArrayEquals(expected.toArray(), response.toArray());
	}

}
