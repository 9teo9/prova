package com.teo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;


public class DatiFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = -2717384769793177287L;

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		if(nome!= null && cognome != null) {
			nome = nome.trim().toUpperCase();
			cognome = cognome.trim().toUpperCase();
			
			request.setAttribute("nome", nome);
			request.setAttribute("cognome", cognome);  					//Inserisco nella richiesta nome e cognome modificati
		}	
		chain.doFilter(request, response);							//Riga obbligatoria se si usa doFilter, questa linea è il dispatcher
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
