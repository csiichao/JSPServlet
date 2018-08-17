package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pet")
public class Pet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 完成范例1到3的内容
		 */
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>感谢填写</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("联络人：<a href='mailto:" +
		/* 步骤4 */ +"'>" +
		/* 步骤4 */ +"</a>");
		out.println("<br>喜爱的宠物类型");
		out.println("<ul>");
		/* 步骤 5 */
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
