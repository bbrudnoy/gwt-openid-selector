/*
 * Copyright 2013 Healthometry Software Inc.
 */

package com.healthometry.client.openid.selector;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Fired when a login is requested. Contains the URL of the OpenID provider to login with.
 * 
 * @author Boris Brudnoy
 * 
 */
public class LoginRequestedEvent extends GwtEvent<LoginRequestedEvent.Handler> {


   private static final Type<Handler> TYPE = new Type<Handler>();

   public interface Handler extends EventHandler {


      void onLoginRequested(LoginRequestedEvent event);
   }

   private String provider;


   public LoginRequestedEvent(String provider) {
      if (provider == null)
         throw new NullPointerException("Parameter [provider] must not be null");
      if (provider.trim().isEmpty())
         throw new IllegalArgumentException("Parameter [provider] must not be empty");
      // -----
      this.provider = provider;
   }


   @Override
   public Type<Handler> getAssociatedType() {
      return TYPE;
   }


   /**
    * The static equivalent of {@link #getAssociatedType()}, for use in handler registrations.
    * 
    * @return the event type
    */
   public static Type<Handler> getType() {
      return TYPE;
   }


   /**
    * Returns the URL of the OpenID provider to login with.
    * 
    * @return the URL of the OpenID provider
    */
   public String getProviderUrl() {
      return provider;
   }


   @Override
   protected void dispatch(Handler handler) {
      handler.onLoginRequested(this);
   }
}
