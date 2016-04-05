package com.gmrodrigues.ejb.example;

import javax.ejb.Stateless;

@Stateless
public class HelloBean implements HelloRemote
{
	public String hello(String name)
	{
		return String.format("Hello %s!", name);
	}
}
