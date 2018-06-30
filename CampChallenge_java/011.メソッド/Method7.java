/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ak
 */
public class Method7 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Method7</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Method7 at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");

              String[] userData = userProfile("1");
              for(int i=0; i<userData.length; i++){
//                  if(userData[i].equals("null")){
//                     continue;
//                  }else if(!userData[i].equals("1")){ 
//                      out.print(userData[i]);
//                  }
                if(!userData[i].equals("1")){
                    if(userData[i].equals("null")){
                        continue;
                    }else{
                        out.print(userData[i]);
                    }
                }
                  
              }
        }
    }
    
    String[] userProfile(String s){
        String[] user1 = {"1","技育太郎","東京",null,"プログラマー"};
        String[] user2 = {"2","技育花子",null,"女","システムエンジニア"};
        String[] user3 = {"3","技育三郎","大阪","男",null};
        
        if(s.equals(user1[0])){
            return user1;
        }else if(s.equals(user2[0])){
            return user2;
        }else if(s.equals(user3[0])){
            return user3;
        }else{
            return null;
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
        processRequest(request, response);
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
        processRequest(request, response);
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
