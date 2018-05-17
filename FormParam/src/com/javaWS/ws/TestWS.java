package com.javaWS.ws;
 
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


@Path("/student")
public class TestWS {	
 @GET
 @Path("/add")   
 public Response addStudent(@QueryParam("name") String n, @QueryParam("rollNo") String r) {		 
	String output = "Name " +n.toString()+" Hello your id is : " + r.toString(); 
	
	System.out.println("output - "+output);
	return Response.status(200).entity(output).build(); 
 }
}