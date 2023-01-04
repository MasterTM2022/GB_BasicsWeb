package ru.gb.perov.GBBasicsWeb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductListServlet", urlPatterns = "/product-list-servlet")
public class ProductListServlet extends HttpServlet {

        private static Logger logger = LoggerFactory.getLogger(ProductListServlet.class);
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
            logger.info("New GET request");
            resp.getWriter().printf("<h1>New GET request</h1>");
            Product[] productList = Product.createProductList(10);
            for (Product p : productList) {
                logger.info("<h1>" + p.id + ": " +  p.getTitle() + " = "  + p.getCost() + "</h1>");
                resp.getWriter().println("<h1>" + p.id + ": " +  p.getTitle() + " = $"  + p.getCost() + "</h1>");
            }
        }
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
            logger.info("New POST request");
            resp.getWriter().printf("<h1>New POST request</h1>");
        }
    }