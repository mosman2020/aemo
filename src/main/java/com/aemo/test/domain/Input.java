package com.aemo.test.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Input {
	private String text;
	private String subtext;
}
