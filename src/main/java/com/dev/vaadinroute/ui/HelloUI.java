package com.dev.vaadinroute.ui;

import com.dev.vaadinroute.view.MyView;
import com.dev.vaadinroute.view.WorldView;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI(path = "/hello")
@Title("Hello")
public class HelloUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Navigator navigator;

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		nav();
	}

	void nav() {
		// Create a navigator to control the views
		navigator = new Navigator(this, this);

		// Create and register the views
		navigator.addView("", new WorldView());
		navigator.addView("my", new MyView());
	}

}
