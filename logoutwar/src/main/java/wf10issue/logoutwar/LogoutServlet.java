package wf10issue.logoutwar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@ServletSecurity(@HttpConstraint(rolesAllowed = { "quickstarts" }))
public class LogoutServlet extends HttpServlet {
	private static final Logger log = LoggerFactory.getLogger(LogoutServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		log.info("In doGet");

		HttpSession session = req.getSession();
		session.invalidate();

		log.info("Done doGet");
	}

}
