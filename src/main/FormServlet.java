package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */

public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set the response message's MIME type
		response.setContentType("text/html;charset=UTF-8");
		// Allocate a output writer to write the response message into the
		// network socket
		PrintWriter out = response.getWriter();

		try {
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
			out.println("<title>Hello, World</title></head>");
			out.println("<body>");
			out.println("<h1>Usando Forms!</h1>");
			// Recupera o parâmetro nome
			String nome = request.getParameter("nome");
			if (nome != null) {
				out.println("Nome escolhido:" + nome);
			}
			out.println("<form method=\"GET\" action=\"form\">");
			out.println("Outro nome:" + "<input type=\"text\" name=\"nome\" >");
			out.println("<input type=\"submit\" value=\"Submeter\" >");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}
}
