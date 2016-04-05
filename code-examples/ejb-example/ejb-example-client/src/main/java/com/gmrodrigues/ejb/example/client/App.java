package com.gmrodrigues.ejb.example.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.gmrodrigues.ejb.example.HelloRemote;

public class App
{
    public static void main( String[] args ) throws NamingException
    {
    	InitialContext context = new InitialContext();
    	HelloRemote remote = (HelloRemote) context.lookup("ejb:/ejb-example-ejb//HelloBean!com.gmrodrigues.ejb.example.HelloRemote");
    	
        System.out.println( remote.hello("glauber"));
    }
}
