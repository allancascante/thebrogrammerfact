package com.bodybuilding.thebrogrammerfact.ui.panels;

import com.bodybuilding.thebrogrammerfact.ui.models.BrogrammerFactsModel;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

/**
 * @author Allan Cascante (allan.cascante@bodybuilding.com)
 */
public class LatestFactsPanel extends Panel {


    public LatestFactsPanel(String id, BrogrammerFactsModel brogrammerFactsModel) {
        super(id, brogrammerFactsModel);

        add(new Label("lastBrogrammerFactLabel", new PropertyModel<String>(getDefaultModel(), "fact")));

    }


}
