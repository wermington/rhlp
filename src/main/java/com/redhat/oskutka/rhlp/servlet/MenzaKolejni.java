package com.redhat.oskutka.rhlp.servlet;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MenzaKolejni
 */
@WebServlet("/MenzaKolejni")
public class MenzaKolejni extends RestaurantGetter {
	private static final long serialVersionUID = -1438512371900562512L;

	protected String getUrl() {
        return "http://www.kam.vutbr.cz/?p=menu&provoz=20";
    }

}