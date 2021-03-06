package com.bug.client.hcm.presenter;

import com.google.gwt.i18n.client.LocalizableResource.DefaultLocale;
import com.google.gwt.i18n.client.LocalizableResource.Generate;
import com.google.gwt.i18n.client.Messages.DefaultMessage;

@DefaultLocale
@Generate(format = "com.google.gwt.i18n.rebind.format.PropertiesFormat")
public interface AuthenticationMessages extends com.google.gwt.i18n.client.Messages {
	@DefaultMessage("The email {0} does not has @")
	String errorAtSign(String name);

	@DefaultMessage("Please fill your email")
	String errorEmailEmpty();

	@DefaultMessage("User or Password is not correct.")
	String errorUserPasswordFail();

	// Lable
	@DefaultMessage("Login")
	String loginLabel();

	@DefaultMessage("Password")
	String passwordLabel();

	@DefaultMessage("Email")
	String emailLabel();

	@DefaultMessage("Keep me logged in")
	String getReminderLabel();
}