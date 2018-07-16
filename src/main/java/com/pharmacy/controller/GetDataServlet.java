package com.pharmacy.controller;

import com.pharmacy.model.ActiveIngredient;
import com.pharmacy.model.DB;
import com.pharmacy.model.Medicine;
import com.pharmacy.model.MedicinePharmacy;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@WebServlet("/getdata")
public class GetDataServlet extends HttpServlet {
    DB db = new DB();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String medicine = (String) req.getParameter("medicine_id");
        if (medicine.contains("Alternatives")) {
            medicine = medicine.substring(medicine.length() - 1);
            int selectedid=Integer.parseInt(medicine);
            List<Medicine> lst = db.getMedicineList();
            Medicine selectedmed = lst.stream().filter(a -> a.getId() ==selectedid ).findFirst().get();
            List<ActiveIngredient> selectedact = selectedmed.getLstOfAct();
            List<Medicine> lstofalternatives = new ArrayList<Medicine>();
            for (Medicine m : lst
                    ) {
                for (ActiveIngredient act : m.getLstOfAct()
                        ) {
                    if (selectedact.stream().anyMatch(a -> a.getId() == act.getId())) {
                        lstofalternatives.add(m);
                        break;
                    }

                }
            }
//            req.setAttribute("Medicines", lstofalternatives);
            req.getSession().setAttribute("Medicines", lstofalternatives);
            resp.sendRedirect("index.jsp");
//            RequestDispatcher view = req.getRequestDispatcher("index.jsp");
//            view.forward(req, resp);
        } else {
            medicine = medicine.substring(medicine.length() - 1);
            List<MedicinePharmacy> lst = db.getMedicinePharmacyList();

        }


    }
}
