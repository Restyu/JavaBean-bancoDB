package paquete;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/saldo")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controlador() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String id = request.getParameter("id");
		
		ConexionDB db = new ConexionDB();
		
		Cliente cliente = db.Conectar(id);
		
		String accion;
		if (cliente == null) {
		accion = "/ClienteDesconocido.jsp"; } else if (cliente.getSaldo() < 0) {
		accion = "/SaldoNegativo.jsp";
		request.setAttribute("clientemalo", cliente); } else if (cliente.getSaldo() < 10000) {
		accion = "/SaldoNormal.jsp";
		request.setAttribute("clienteregular", cliente); } else {
		      accion = "/SaldoAlto.jsp";
		      request.setAttribute("grancliente", cliente);
		    }
		    RequestDispatcher dispatcher =
		      request.getRequestDispatcher(accion);
		    dispatcher.forward(request, response);
		  }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
