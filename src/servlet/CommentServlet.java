package servlet;

import bean.Comment;
import service.CommentService;
import util.Pagination;
import util.PaginationUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author littlestar
 */
@WebServlet(name = "CommentServlet", value = "/comment.servlet")
public class CommentServlet extends BaseServlet {
    private final CommentService service = new CommentService();

    public String list(HttpServletRequest request, HttpServletResponse response) {
        Pagination pagination = PaginationUtil.createPagination(request, service.getTotal());
        List<Comment> comments = service.list();
        request.setAttribute("comments", comments);
        request.setAttribute("pagination", pagination);
        return "jsp/admin/listComment.jsp";
    }

    public String delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("cid"));
        service.delete(id);
        return "@"+request.getServletContext().getContextPath()+"/admin/comment_list";
    }
}
