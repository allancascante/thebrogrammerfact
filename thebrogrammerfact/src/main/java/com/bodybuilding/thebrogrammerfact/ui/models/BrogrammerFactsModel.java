package com.bodybuilding.thebrogrammerfact.ui.models;

import com.bodybuilding.thebrogrammerfact.entities.BrogrammerFact;
import org.apache.wicket.model.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author Allan Cascante (allan.cascante@bodybuilding.com)
 */
public class BrogrammerFactsModel extends Model<ArrayList<BrogrammerFact>>{

    private static ArrayList<BrogrammerFact> factsDataBase = new ArrayList<BrogrammerFact>();

    static {
        factsDataBase.add(new BrogrammerFact("Brogrammers write code in between push-ups...", "allan.cascante@bodybuilding.com"));
    }

    public BrogrammerFactsModel() {
        this.setObject(factsDataBase);
    }
}
