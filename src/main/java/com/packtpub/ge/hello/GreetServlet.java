package com.packtpub.ge.hello;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by liqingmin on 2017/7/21.
 */
@WebServlet("/greet")
public class GreetServlet extends HttpServlet {

    GreetingService service = new GreetingService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse respone)
     throws ServletException, IOException{
        String name = request.getParameter("name");
        String message = service.greet(name);
        request.setAttribute("message", message);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/greet.jsp");
        dispatcher.forward(request,respone);
    }
}
