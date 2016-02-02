package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MainServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set the response message's MIME type
	      response.setContentType("text/html;charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket
	      PrintWriter out = response.getWriter();
	 
	      try {
	         out.println("<!DOCTYPE html>");
	         out.println("<html><head>");
	         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	         out.println("<title>Exemplos de Servlet!</title></head>");
	         out.println("<body>");
	         out.println("<h1>Servlet Exemplos!</h1>");  
	         out.println("<ul>");
	         out.println("<li><a href=\"hello\"> Exemplo Hello </a></li>");
	         out.println("<li><a href=\"form\"> Exemplo de Submissão de Formulário</a></li>");
	         out.println("</ul>");
	         out.println("</body>");
	         out.println("</html>");
	      } finally {
	         out.close();  
	      }
	   }
	}



