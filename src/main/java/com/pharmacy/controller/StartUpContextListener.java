package com.pharmacy.controller;

import com.pharmacy.model.DB;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class StartUpContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DB dataBase = new DB();
        ServletContext ctx = sce.getServletContext();
        ctx.setAttribute("dataBase", dataBase);
        System.out.println("here started");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
