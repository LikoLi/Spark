package org.likui.study.spark;

import static spark.Spark.*;

import org.junit.Test;

public class QuickStart {
	@Test
	public void testStop() {
		/*
		 * What about starting the server?
		 * 
		 * The server is automatically started when you do something that requires the server to be started (i.e. declaring a route or setting the port). You can also manually start the server by calling init().
		 */
		init();
		System.out.println("init");
		stop();
		System.out.println("stop");
	}
	
	@Test
	public void testRoutes() {
		/*
		 * A verb (get, post, put, delete, head, trace, connect, options)
		 * A path (/hello, /users/:name)
		 * A callback (request, response) -> { }
		 */
		
//		get("/", (req, res) -> {
//		});
	}
}
