package com.hjp.springbootRedis.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class RedisTest {

	@RequestMapping(value = "/set", method = RequestMethod.GET)
	public Map<String, Object> firstResp(HttpServletRequest request) {
		request.getSession().setAttribute("testKey", "testValue");

		Map<String, Object> map = new HashMap<>();
		map.put("testKey", "testValue");
		return map;
	}

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public Object sessions(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		map.put("sessionId", request.getSession().getId());
		map.put("testKey", request.getSession().getAttribute("testKey"));
		return map;
	}

}
