package com.dev.vaadinroute.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class WorldView extends VerticalLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WorldView() {
		Button btMy = new Button("Go to My View");
		btMy.addClickListener(e -> {
			getUI().getNavigator().navigateTo("my");
		});

		Button btHome = new Button("To Home");
		btHome.addClickListener(e -> {
			Page.getCurrent().open("/", null);
		});

		addComponent(btMy);
		addComponent(btHome);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Welcome to the World View");
	}

}
