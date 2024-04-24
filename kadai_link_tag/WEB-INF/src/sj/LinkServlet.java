package sj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
		  throws ServletException, IOException {
		 
		 // リクエスト・レスポンスの設定
		 request.setCharacterEncoding("UTF-8");
	     response.setContentType("text/html; charset=UTF-8");
	     
	     // URLのパラメータ(画面遷移の種類)を取得
	     String userName = request.getParameter("name");
	     
	     //メッセージをリクエストスコープへの登録、フォワードによる画面遷移
	     if( userName != null ) {
	    	 request.setAttribute("success", "Servletからデータを受信しました： " + userName + "さん、こんにちは！");
		     request.getRequestDispatcher("/index.jsp").forward(request, response);
	     } 

	 }
}
