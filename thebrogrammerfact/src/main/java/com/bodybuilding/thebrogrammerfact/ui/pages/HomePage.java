package com.bodybuilding.thebrogrammerfact.ui.pages;

import com.bodybuilding.thebrogrammerfact.ui.models.BrogrammerFactsModel;
import com.bodybuilding.thebrogrammerfact.ui.panels.LatestFactsPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;

    private static Long visitCount = 0L;

    /**
     * The default constructor of the page
     * @param parameters the parameters received by the wicket application
     */
    public HomePage(final PageParameters parameters) {

        visitCount++;
        BrogrammerFactsModel brogrammerFactsModel = new BrogrammerFactsModel();
        add(new LatestFactsPanel("latestFactPanel", brogrammerFactsModel));
        add(new Label("visitCountLabel", visitCount.toString()));
    }
}
