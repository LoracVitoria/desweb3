package com.example.desweb3;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/cabecalho")
public class CabecalhoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String clienteHttp = req.getHeader("user-agent");
        String a1 = req.getHeader("host");
        String a2 = req.getHeader("accept-encoding");
        String a3 = req.getHeader("accept-language");
        //resp.getWriter().print("<h1>hm, testando</h1>");
        //resp.getWriter().print("<p>seu navegador é: "+ clienteHttp +"</p>");


        req.setAttribute("chaveCliente", clienteHttp);
        req.setAttribute("host", a1);
        req.setAttribute("accept-encoding", a2);
        req.setAttribute("accept-language", a3);
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);
    }


}
