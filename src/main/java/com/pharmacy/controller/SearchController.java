package com.pharmacy.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Collectors;
import com.pharmacy.model.DB;
import com.pharmacy.model.Medicine;
@WebServlet("/Search")
public class SearchController extends HttpServlet {

    DB db = new DB();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        request.setAttribute("Medicines", db.getMedicineList());
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String medicine = (String) req.getParameter("medicine");


        req.setAttribute("Medicines", db.getMedicineList().stream().filter(a->a.getName().contains(medicine)).collect(Collectors.toList()));
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req, resp);
    }
}
