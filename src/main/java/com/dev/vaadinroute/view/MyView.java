package com.dev.vaadinroute.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class MyView extends VerticalLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyView() {
		Button button = new Button("Go to World View");
		button.addClickListener(e -> {
			getUI().getNavigator().navigateTo("");
		});
		addComponent(button);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Welcome to the My View");
	}

}
