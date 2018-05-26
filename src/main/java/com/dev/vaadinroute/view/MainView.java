package com.dev.vaadinroute.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = MainView.VIEWNAME)
public class MainView extends VerticalLayout implements View {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static final String VIEWNAME = "MainView";

	@PostConstruct
	void init() {
		Button bt = new Button("To Home");
		bt.addClickListener(e -> {
			Page.getCurrent().setUriFragment("");
		});
		this.addComponent(bt);
	}

}
