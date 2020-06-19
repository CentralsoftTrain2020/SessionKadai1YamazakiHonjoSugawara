

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginBean;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name =
				request.getParameter("id");
				request.setAttribute("id", name );

		LoginBean bean = new LoginBean();

		bean.setId(name);

		request.setAttribute("bean", bean);

		RequestDispatcher rd =request.getRequestDispatcher("tasizan.jsp");

				rd.forward(request, response);
				}

}