package com.bodybuilding.thebrogrammerfact.ui.models;

import com.bodybuilding.thebrogrammerfact.entities.BrogrammerFact;
import org.apache.wicket.model.Model;

import java.util.Date;


/**
 * @author Allan Cascante (allan.cascante@bodybuilding.com)
 */
public class BrogrammerFactsModel extends Model<BrogrammerFact>{

    public BrogrammerFactsModel() {

        BrogrammerFact brogrammerFact = new BrogrammerFact();

        brogrammerFact.setFact("Brogrammers write code in between push-ups");
        brogrammerFact.setAuthorEmail("allan.cascante@gmail.com");
        brogrammerFact.setDateAdded(new Date());
        brogrammerFact.setDeleted(false);

        this.setObject(brogrammerFact);
    }

}
