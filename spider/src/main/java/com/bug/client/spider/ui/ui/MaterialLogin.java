package com.bug.client.spider.ui.ui;

import com.bug.client.hcm.presenter.AuthenticationMessages;
import com.bug.client.hcm.view.EmailLoginView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialModal.TYPE;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class MaterialLogin extends Composite implements EmailLoginView {

	private static MaterialLoginUiBinder uiBinder = GWT.create(MaterialLoginUiBinder.class);

	// private HelloClient helloClient = GWT.create(HelloClient.class);

	interface MaterialLoginUiBinder extends UiBinder<Widget, MaterialLogin> {
	}

	@UiField
	MaterialTextBox password;
	@UiField
	MaterialTextBox email;
	@UiField
	MaterialButton btnLogin;
	@UiField
	MaterialCheckBox checkBoxRemider;

	AuthenticationMessages authenticationMessages = GWT.create(AuthenticationMessages.class);

	private LoginPresenter loginPresenter;

	public MaterialLogin() {
		initWidget(uiBinder.createAndBindUi(this));
		setText();
	}

	private void setText() {

		btnLogin.setText(authenticationMessages.loginLabel());
		password.setPlaceholder(authenticationMessages.passwordLabel());
		email.setPlaceholder(authenticationMessages.emailLabel());
		checkBoxRemider.setText(authenticationMessages.getReminderLabel());
	}

	@UiHandler("btnLogin")
	void onLogin(ClickEvent e) {
		// RootPanel.getBodyElement().addClassName("white");
		// RootPanel.get().clear();

		MaterialModal.showModal(true, new ModalContent());

		// loginPresenter.login();

		// MaterialToast.alert("Success"+ email.getText());
		// helloClient.createEmployee(new MethodCallback<Employee>() {
		//
		// @Override
		// public void onSuccess(Method method, Employee response) {
		// MaterialToast.alert("Success" + response.getName());
		//
		// }
		//
		// @Override
		// public void onFailure(Method method, Throwable exception) {
		// MaterialToast.alert("Failure 1" + exception.getMessage());
		//
		// }
		// });

	}

	public void setLoginPresenter(LoginPresenter loginPresenter) {
		this.loginPresenter = loginPresenter;
	}

	@Override
	public String getEmail() {
		return email.getText();
	}

	@Override
	public String getPassword() {
		return password.getText();
	}

	@Override
	public void setNotify(String notify) {
		MaterialToast.alert("Login:" + authenticationMessages.loginLabel());
		MaterialToast.alert("Login:" + notify);
	}

	@Override
	public String getNotify() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmail(String e) {
		email.setText(e);

	}

}
