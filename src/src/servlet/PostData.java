package src.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PostData extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.err.println(request.getMethod());
		//response.addHeader("Access-Control-Allow-Methods", "POST, OPTIONS");
		response.addHeader("Access-Control-Allow-Origin", "*");
		//response.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER");
		//response.addHeader("Access-Control-Allow-Headers", "origin, x-requested-with, content-type, accept");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        System.err.println(getBody(request));
        /*response.getWriter().write(getBody(request).toString());
        response.getWriter().flush();
		response.getWriter().close();*/
		response.getOutputStream().write(getBody(request).getBytes());
		response.getOutputStream().flush();
		response.getOutputStream().close();
	}
	
	public void doOptions(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.err.println(request.getMethod());
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
		response.setContentType("application/json; charset=utf-8");
	}
	
	public static String getBody(HttpServletRequest request) throws IOException {
	    String body = null;
	    StringBuffer stringBuffer = new StringBuffer();
	    String line = null;
	    try {
	      BufferedReader reader = request.getReader();
	      while ((line = reader.readLine()) != null)
	    	  stringBuffer.append(line);
	    } catch (Exception e) { 
	    	e.printStackTrace();
	    }
	    body = stringBuffer.toString();
	    return body;
	}
}
