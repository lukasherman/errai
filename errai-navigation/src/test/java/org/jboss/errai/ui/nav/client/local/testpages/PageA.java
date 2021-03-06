package org.jboss.errai.ui.nav.client.local.testpages;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShowing;

import com.google.gwt.user.client.ui.SimplePanel;

@ApplicationScoped
@Page(role = DefaultPage.class)
public class PageA extends SimplePanel {

  public int beforeShowCallCount;
  private boolean[] initStateHolder;
  public boolean initStateWhenBeforeShowWasCalled;

  @PageShowing
  private void beforeShow() {
    beforeShowCallCount++;
    initStateWhenBeforeShowWasCalled = initStateHolder == null ? false : initStateHolder[0];
  }

  public void setInitStateHolder(boolean[] initStateHolder) {
    this.initStateHolder = initStateHolder;
  }

}
