import classes.GameLogic;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class GameServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        GameLogic game = (GameLogic) session.getAttribute("game");

        if (game == null) {
            game = new GameLogic();
            session.setAttribute("game", game);
        }

        request.getRequestDispatcher("game.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        GameLogic game = (GameLogic) session.getAttribute("game");

        if (game == null) {
            game = new GameLogic();
            session.setAttribute("game", game);
        }
        
        String nickname = request.getParameter("nickname");
        if (nickname != null && !nickname.isEmpty()){
            session.setAttribute("nickname", nickname);
        }

        String guessParam = request.getParameter("guess");
        if (guessParam != null && !guessParam.isEmpty()) {
            int guess = Integer.parseInt(guessParam);
            game.checkGuess(guess);
        }

        request.getRequestDispatcher("game.jsp").forward(request, response);
    }
}
