package com.google.appinventor.client.actions;

import com.google.appinventor.client.TopPanel;
import com.google.appinventor.shared.rpc.user.Config;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;

import static com.google.appinventor.client.Ode.getSystemConfig;

public class OpenFeedbackAction implements Command {
  @Override
  public void execute() {
    Config config = getSystemConfig();
    if (config.getFeedbackUrl() != null) {
      Window.open(config.getFeedbackUrl(), TopPanel.WINDOW_OPEN_LOCATION, TopPanel.WINDOW_OPEN_FEATURES);
    }
  }
}
