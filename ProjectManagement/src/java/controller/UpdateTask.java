/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.ProjectDao;
import dao.TaskDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Employee;
import model.Project;
import model.Task;

/**
 *
 * @author ADMIN
 */
public class UpdateTask extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateTask</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateTask at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("mod") != null && request.getParameter("mod").equals("1")) {
            TaskDao tdao = new TaskDao();
            ProjectDao pdao = new ProjectDao();
            String task_id = request.getParameter("task_id");
            Task listbyid = tdao.getTaskById(task_id);
            request.setAttribute("listbyid", listbyid);
            ArrayList<String> list = tdao.getAllStatus();
            request.setAttribute("status", list);
            ArrayList<String> list3 = pdao.getAllEmployeeCode();
            request.setAttribute("Empcode", list3);
            request.getRequestDispatcher("view/updatetask.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TaskDao tdao = new TaskDao();
        String task_id = request.getParameter("task_id");
        String task_code = request.getParameter("tcode");
        String project_code = request.getParameter("pcode");
        String task_name = request.getParameter("tname");
        String start_date = request.getParameter("startdate");
        String end_date = request.getParameter("enddate");
        String employee_code = request.getParameter("empcode");
        String status = request.getParameter("status");
        Employee e = new Employee();
        e.setEmployee_code(employee_code);
        Project p = new Project();
        p.setProject_code(project_code);
        Task t = new Task(task_id, task_code, p, task_name, start_date, end_date, e, status);
        tdao.UpdateTask(t);
        ArrayList<Task> list = tdao.getListTask();
        request.setAttribute("listtask", list);
        request.getRequestDispatcher("view/task.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
