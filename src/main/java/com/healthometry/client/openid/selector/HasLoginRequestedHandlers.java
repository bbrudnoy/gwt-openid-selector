package com.healthometry.client.openid.selector;

import com.google.web.bindery.event.shared.HandlerRegistration;

public interface HasLoginRequestedHandlers {


   HandlerRegistration addLoginRequestedHandler(LoginRequestedEvent.Handler handler);
}
