package javastudy;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class RightFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/page/*" })
public class RightFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RightFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		String url=req.getRequestURL().toString();
		RequestDispatcher rd=req.getRequestDispatcher("/error.jsp");
		if(req.getSession().getAttribute("NAME")==null)
		{
			
			req.setAttribute("info", "你没有登录,不能访问["+url+"]!");
			rd.forward(req, res);
			return;
		}
		
		String name=req.getSession().getAttribute("NAME").toString();
		@SuppressWarnings("unchecked")
		HashMap<String, String> map=(HashMap<String, String>)req.getServletContext().getAttribute("RIGHTS");
		if(map.containsKey(name))
		{
			String murl=map.get(name).toString();
			if(url.endsWith(murl))
			{
				req.setAttribute("info", "你没有权限,不能访问["+url+"]!");
				rd.forward(req, res);
				return;
			}
			
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
