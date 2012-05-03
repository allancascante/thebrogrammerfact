package com.bodybuilding.thebrogrammerfact.ui.panels;

import com.bodybuilding.thebrogrammerfact.ui.models.BrogrammerFactsModel;
import com.bodybuilding.thebrogrammerfact.ui.pages.AddAFactPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

import java.util.Random;

/**
 * @author Allan Cascante (allan.cascante@bodybuilding.com)
 */
public class LatestFactsPanel extends Panel {


    public LatestFactsPanel(String id, BrogrammerFactsModel brogrammerFactsModel) {
        super(id, brogrammerFactsModel);

        final BrogrammerFactsModel factsModel = (BrogrammerFactsModel)getDefaultModel();

        Random random = new Random();
        add(new Label("lastBrogrammerFactLabel", new PropertyModel<String>(factsModel.getObject().get(random.nextInt(factsModel.getObject().size())), "fact")));
        add(new BookmarkablePageLink<AddAFactPage>("addNewFactLink", AddAFactPage.class));
    }


}
