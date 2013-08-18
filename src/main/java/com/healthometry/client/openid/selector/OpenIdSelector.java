/*
 * Copyright 2013 Healthometry Software Inc.
 */

package com.healthometry.client.openid.selector;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * @author Boris Brudnoy
 * 
 */
public class OpenIdSelector extends Composite {


   @UiField
   Frame loginFrame;

   private static OpenIdSelectorUiBinder uiBinder = GWT.create(OpenIdSelectorUiBinder.class);

   interface OpenIdSelectorUiBinder extends UiBinder<Widget, OpenIdSelector> {}


   public OpenIdSelector() {
      initWidget(uiBinder.createAndBindUi(this));
      loginFrame.setUrl(GWT.getModuleBaseForStaticFiles() + "lib/osel/signin.html");
      setupRequestLoginFunc();
   }


   private void requestLogin(String provider) {
      Window.alert(provider);
   }


   private native void setupRequestLoginFunc() /*-{
		var widget = this;
		$wnd.requestLogin = $entry(function(provider) {
			widget.@com.healthometry.client.openid.selector.OpenIdSelector::requestLogin(Ljava/lang/String;)(provider);
		});
   }-*/;

}
