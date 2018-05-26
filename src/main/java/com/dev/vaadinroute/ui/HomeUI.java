package com.dev.vaadinroute.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Title;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;

@SpringUI
@SpringViewDisplay
@Title("Home")
public class HomeUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	SpringViewProvider viewProvider;

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub

	}

	public void showView(String viewname) {
		View v = viewProvider.getView(viewname);
		setContent((Component) v);
	}

}
