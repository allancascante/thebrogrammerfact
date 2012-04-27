package com.bodybuilding.thebrogrammerfact.ui.pages;

import com.bodybuilding.thebrogrammerfact.ui.models.BrogrammerFactsModel;
import com.bodybuilding.thebrogrammerfact.ui.panels.LatestFactsPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;

    /**
     * The default constructor of the page
     * @param parameters the parameters received by the wicket application
     */
    public HomePage(final PageParameters parameters) {

        add(new LatestFactsPanel("latestFactPanel", new BrogrammerFactsModel()));
    }
}
