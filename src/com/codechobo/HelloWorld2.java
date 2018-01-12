package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld2")
public class HelloWorld2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String path2 = "file:///C:/eclipse/eclipse-workspace/WebProject/WebContent/imgs/dice";
		String path = "./imgs/dice";
		String jpg = "jpg";
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		
		out.println("<style>");
		out.println("#field tr{height: 100px;\r\n" + 
				"    border: 2px solid #000;\r\n" + 
				"    padding: 0px;\r\n" + 
				"    margin: 0;}");
		out.println("#field td{ width: 100px;\r\n" + 
				"    border: 2px solid #000;\r\n" + 
				"    padding: 0px;\r\n" + 
				"    font-size: 30px;\r\n" + 
				"    text-align: center;}");
		out.println(".dice{width:100px; height:100px;}");
		out.println("</style>");
		//body Ω√¿€
		out.println("<body>");
		out.println("<img class='dice' src = \""+ path + a + "." + jpg + "\">");
		out.println("<img class='dice' src = \""+ path + b + "." + jpg + "\">");
		out.println("<h1>");
		out.println(a+b);
		out.println("</h1>");
		
		out.println("</body>");
		
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
