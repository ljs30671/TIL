package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String command=request.getParameter("command");
		String won=request.getParameter("won");
		String operator=request.getParameter("operator");
		
		if(command !=null && command.equals("calculate")) {
			String result=calculate(Float.parseFloat(won),operator);
			out.print("<html><font size=10>��ȯ���</font><br>");
			out.print("<html><font size=10>"+result+"</font><br>");
			out.print("<a href='/Web13/calc'>ȯ�� ����</a>");
			return ;
		}
		
		out.print("<html><title>ȯ�� ����</title>");
		out.print("<font size=5> ȯ�� ����</font><br>");
		out.print("<form name='frmCalc' method='get' action='/Web13/calc'	/>");
		out.print("��ȭ : <input type='text' name='won' size = 10 />");
		out.print("<select name='operator'>�޷�</option>");
		out.print("<select name='en'>��ȭ</option>");
		out.print("<select name='wian'>����</option>");
		out.print("<select name='pound'>�Ŀ��</option>");
		out.print("<select name='euro'>����</option>");
		out.print("</select>");
		out.print("<input type='hidden' name='command' value='calcuate'	/>");
		out.println("</form>");
		out.print("</html");
		out.close();

	}

	
	private static String calculate(float won, String operator) {
		
		String result=null;
		if(operator.equals("dolloar")) {
			result = String.format("%.6f", won / 1124);
		} else if(operator.equals("en")) {
			result = String.format("%.6f", won / 10);
		} else if(operator.equals("wian")) {
			result = String.format("%.6f", won / 173);
		} else if(operator.equals("pound")) {
			result = String.format("%.6f", won / 1559);
		} else if(operator.equals("euro")) {
			result = String.format("%.6f", won / 1349);
		}
		
		return result;
	}


}
