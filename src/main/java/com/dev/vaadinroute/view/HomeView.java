package com.dev.vaadinroute.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = HomeView.VIEWNAME)
public class HomeView extends VerticalLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final String VIEWNAME = "";

	@PostConstruct
	void init() {
		Button bt = new Button("To Hello");
		bt.addClickListener(e -> {
			Page.getCurrent().open("/hello", null);
		});
		this.addComponent(bt);
		
		Button btm = new Button("To Main");
		btm.addClickListener(e -> {
			Page.getCurrent().setUriFragment("!MainView");
			//Page.getCurrent().open("/hello", null);
		});
		this.addComponent(btm);
	}

}
