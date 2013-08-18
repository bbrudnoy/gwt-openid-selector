/*
 * Copyright 2013 Healthometry Software Inc.
 */

package com.healthometry.client.openid.selector;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * @author Boris Brudnoy
 * 
 */
public class OpenIdSelector extends Composite {


   private static OpenIdSelectorUiBinder uiBinder = GWT.create(OpenIdSelectorUiBinder.class);

   interface OpenIdSelectorUiBinder extends UiBinder<Widget, OpenIdSelector> {}


   public OpenIdSelector() {
      initWidget(uiBinder.createAndBindUi(this));
   }

}
