package com.gerenciador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Cadastrando empresa");
        String nomeEmpresa = req.getParameter("nome");
        PrintWriter out = resp.getWriter();
        out.println("<html><body><h3>Empresa " + nomeEmpresa + " cadastrada com sucesso!</h3></body></html>");
    }
}
