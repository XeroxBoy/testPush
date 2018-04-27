package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testPollingServlet extends HttpServlet {

    private static int num=0;
    @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp)
       throws ServletException, IOException {

   req.setCharacterEncoding("utf-8");
   resp.setContentType("text/html;charset=utf-8");


/*   String name = req.getParameter("name");
*/ double age=Math.random()*100;

   	   StringBuffer json =new StringBuffer("{");

       json.append("'age':'"+age+"',");
       json.append("'num':'"+num+"'");
       num++;
       json.append("}");// 构造json数据格式

           PrintWriter out = resp.getWriter();
           out.write(json.toString());
       

/*   req.setAttribute("name", name);                                        // 为request对象添加参数
   req.setAttribute("age",age);*/
/*   RequestDispatcher dispatcher = req.getRequestDispatcher("check.jsp");    // 使用req对象获取RequestDispatcher对象
   dispatcher.forward(req, resp);    */
    }}

