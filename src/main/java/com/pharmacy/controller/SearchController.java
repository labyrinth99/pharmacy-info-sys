package com.pharmacy.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacy.model.DB;
import com.pharmacy.model.Medicine;
@WebServlet("/GetAllmedicationServlet")
public class SearchController extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DB db = new DB();

      ArrayList<Medicine> medicineList;
        medicineList = (ArrayList<Medicine>) db.getMedicineList();

        request.setAttribute("products",medicineList);
//        String userName = request.getParameter("userName").trim();
//        if (userName == null || "".equals(userName)) {
//            userName = "Guest";
//        }
//
//        String greetings = "Hello " + userName;
//
//        response.setContentType("text/plain");
//        response.getWriter().write(greetings);
    }

}
