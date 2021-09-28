package com.example.desweb3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet({"/requisicao"})
public class RequisitosServlet extends HttpServlet {

   // public int numeroDeAcessos = 0;


    @Override
    public void init() throws ServletException {
//        super.init();
        //System.out.println("chamou o método init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String encoding = req.getHeader("accept-encoding");
//        System.out.println("chamou o método service");
//        this.numeroDeAcessos += 1;
//        System.out.println("número de acessos: " + numeroDeAcessos);

        String b1 = req.getMethod();
        String b2 = req.getRequestURI();
        String b3 = req.getProtocol();

        req.setAttribute("metodo", b1);
        req.setAttribute("uri", b2);
        req.setAttribute("protocolo", b3);
        RequestDispatcher dispatcher = req.getRequestDispatcher("index2.jsp");
        dispatcher.forward(req, resp);
    }


    @Override
    public void destroy() {
        super.destroy();
    }
}