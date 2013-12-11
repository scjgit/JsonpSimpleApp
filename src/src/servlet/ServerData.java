package src.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.dto.ServerTime;

public class ServerData extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/** Setting Content-type to text/event-stream **/
		response.setContentType("text/event-stream");
		/**Setting encoding to UTF-8*/
		response.setCharacterEncoding("UTF-8");
		
		ServerTime serverTime = new ServerTime();
		Date date = new Date(System.currentTimeMillis());
		
		serverTime.setServerDay(date.getDay()+"");
		serverTime.setServerMon(date.getMonth()+"");
		serverTime.setServerHour(date.getHours()+"");
		serverTime.setServerMin(date.getMinutes()+"");
		serverTime.setServerSec(date.getSeconds()+"");
		response.getWriter().write("event: " +"ServerTime\n");
		response.getWriter().write("data: " +serverTime.toString() + "\n\n");
		System.err.println(serverTime.toString());
		response.getWriter().flush();
		response.getWriter().close();
	}
	
}
