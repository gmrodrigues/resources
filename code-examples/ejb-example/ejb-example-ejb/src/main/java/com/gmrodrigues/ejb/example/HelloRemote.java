package com.gmrodrigues.ejb.example;

import javax.ejb.Remote;

@Remote
public interface HelloRemote {
	public String hello(String name);
}
