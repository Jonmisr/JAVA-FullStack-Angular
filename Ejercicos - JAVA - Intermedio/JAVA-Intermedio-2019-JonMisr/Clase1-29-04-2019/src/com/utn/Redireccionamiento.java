package com.utn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redireccionamiento
 */
@WebServlet("/Redireccionamiento")
public class Redireccionamiento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redireccionamiento() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Apache Tomcat 7.0 Configurado Correctamente, Servlet Iniciado");
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE> Hola Mundo! </TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h2 style=\"text-align:center;\">");
		out.println("Este Es Mi Primer Servidor");
		out.println("</h2>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
