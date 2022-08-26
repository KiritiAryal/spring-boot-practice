package com.spboot.SpringbootWithJdbc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.SpringbootWithJdbc.dto.UserData;

@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public void hello() {
		System.out.println("hello");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/welcome")
	public void welcome() {
		System.out.println("welcome");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hellowithname")
	public String helloWithName() {
		return "Hello , Ram";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hellowithdynamicname")
	public String helloWithDynamicName(@RequestParam String username) {
		return "Hello , " + username;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/userage")
	public int userAge(@RequestParam String age) {
		return Integer.parseInt(age);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/userdata")
	public UserData userData(@RequestParam String username, @RequestParam String age) {
		UserData data = new UserData();
		data.setUsername(username);
		data.setAge(Integer.parseInt(age));

		return data;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/userdatalist")
	public List<UserData> userDataList() {
		UserData data = new UserData();
		data.setUsername("abc");
		data.setAge(12);

		UserData data2 = new UserData();
		data2.setUsername("abdfsc");
		data2.setAge(12);

		UserData data3 = new UserData();
		data3.setUsername("a");
		data3.setAge(12);

		List<UserData> list = new ArrayList<UserData>();
		list.add(data);
		list.add(data2);
		list.add(data3);

		return list;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/{age}")
	public int usersAge(@PathVariable String age) {
		return Integer.parseInt(age);
	}

}
