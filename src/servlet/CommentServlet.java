package servlet;

import bean.Category;
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
    private final CommentServlet service = new CommentServlet();

    public String list(HttpServletRequest request, HttpServletResponse response) {
        Pagination pagination = PaginationUtil.createPagination(request, service.getTotal());
        List<Category> comments = service.list(pagination.getStart(), pagination.getCount());
        request.setAttribute("comments", comments);
        request.setAttribute("pagination", pagination);
        return "jsp/admin/listCategory.jsp";
    }

}
