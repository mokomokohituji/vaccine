package vaccine;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/index.jsp");
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // ワクチンチャレンジ！君もワクワクチンチンだ！
		Random random = new Random();

        int vacRan = random.nextInt(8);
        String vaccine = "";
        for (int i = 0; i <= 8; i++) {
            int vac = random.nextInt(4);
            String vaccineCase = "";
            switch (vac) {
                case 0:
                    vaccineCase = "ワ";
                    break;
                case 1:
                    vaccineCase = "ク";
                    break;
                case 2:
                    vaccineCase = "チ";
                    break;
                case 3:
                    vaccineCase = "ン";
                    break;
            }
            vaccine += vaccineCase;
        }
        request.setAttribute("vaccine", vaccine);
        //System.out.println(vaccine);
        
        if(vaccine.matches(".*" + "ワクチン" +"*.")){
        	request.setAttribute("success", "ワクチンチャレンジ成功！おめでとう！");
       
        }else if(vaccine.equals("ワクワクチンチン")){
        	request.setAttribute("success", "おめでとう！君も立派なワクワクチンチンだ！");
        
        }else if(vaccine.matches(".*" + "ワクワク" +"*.")||vaccine.matches(".*" + "チンチン" +"*.")){
        	request.setAttribute("success", "ワクワクチンチンに近づいている！がんばれがんばれ！");
        	
        } else {
        	request.setAttribute("success", "残念ながら君はまだワクワクチンチンではないらしい…、また挑戦してくれ！");
        	
        }
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/result.jsp");
		disp.forward(request, response);
	}

}
