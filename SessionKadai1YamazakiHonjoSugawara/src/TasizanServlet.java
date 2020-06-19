

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.TasizanBean;

public class TasizanServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));

		int answer = a + b;

		TasizanBean tasiBean = new TasizanBean();
		tasiBean.setA(a);
		tasiBean.setB(b);
		tasiBean.setAnswer(answer);

		request.setAttribute("tasiBean", tasiBean);

		RequestDispatcher rd =request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}
}