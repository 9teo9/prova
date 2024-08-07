package com.teo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatiServlet extends HttpServlet {
	private static final long serialVersionUID = 6347064638366801176L;

	protected void processaRichiesta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  			
		PrintWriter out = response.getWriter();		
		//commento
		String nome = (String) request.getAttribute("nome");
		String cognome = (String) request.getAttribute("cognome");
		
		if(nome == null || cognome == null || nome.equals("") || cognome.equals("")) {
			
			response.sendRedirect("index.jsp");
		}else {
			out.println("<!doctype>");
			out.println("<head>");
			out.println("<meta charset=\"ISO-8859-1\">");
			out.println("<title>Risposta della servlet</title>");
			out.println("</head>");
			out.println("</body>");
			out.println("<h3>I dati inseriti sono i seguenti:</h3>");
			out.println("<p>" + nome + " " + cognome + "</p>");
			out.println("<p>Richiesta invia il: " + new SimpleDateFormat("dd-MM-YYYY - hh:mm:ss").format(new Date())+ "</p>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processaRichiesta(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processaRichiesta(request, response);
		
	}

}
