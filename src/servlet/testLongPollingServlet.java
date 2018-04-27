package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testLongPollingServlet extends HttpServlet {

    private static Integer num=0;
    @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp)
       throws ServletException, IOException {

   req.setCharacterEncoding("utf-8");
   resp.setContentType("text/html;charset=utf-8");

/*   String name = req.getParameter("name");
*/ 

	try {
		Thread.sleep(1500);//不然太快了
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	double age=Math.random()*100;
DateFormat format=new SimpleDateFormat("HH:mm:ss");
String time=format.format(new Date());
   	   StringBuffer json =new StringBuffer("{");
      json.append("'time':'"+time+"',");
       json.append("'age':'"+age+"',");
       synchronized(num){ //防止多线程同时修改变量 导致变量不能正确增加
           num++;
           }
       json.append("'num':'"+num+"'");
     
       json.append("}");// 构造json数据格式

           PrintWriter out = resp.getWriter();
           out.write(json.toString());
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


/*   req.setAttribute("name", name);                                        // 为request对象添加参数
   req.setAttribute("age",age);*/
/*   RequestDispatcher dispatcher = req.getRequestDispatcher("check.jsp");    // 使用req对象获取RequestDispatcher对象
   dispatcher.forward(req, resp);    */
    }}

