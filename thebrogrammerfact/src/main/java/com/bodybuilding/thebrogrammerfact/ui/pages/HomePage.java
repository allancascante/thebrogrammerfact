package com.bodybuilding.thebrogrammerfact.ui.pages;

import com.bodybuilding.thebrogrammerfact.WicketApplication;
import com.bodybuilding.thebrogrammerfact.ui.models.BrogrammerFactsModel;
import com.bodybuilding.thebrogrammerfact.ui.panels.LatestFactsPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;

    /**
     * The default constructor of the page
     * @param parameters the parameters received by the wicket application
     */
    public HomePage(final PageParameters parameters) {

        ((WicketApplication)getApplication()).setVisitCount(((WicketApplication)getApplication()).getVisitCount()+1);
        BrogrammerFactsModel brogrammerFactsModel = new BrogrammerFactsModel();
        add(new LatestFactsPanel("latestFactPanel", brogrammerFactsModel));
        add(new Label("visitCountLabel", Long.toString(((WicketApplication)getApplication()).getVisitCount())));
    }
}
