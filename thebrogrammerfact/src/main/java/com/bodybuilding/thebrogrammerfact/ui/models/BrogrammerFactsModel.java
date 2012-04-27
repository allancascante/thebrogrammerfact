package com.bodybuilding.thebrogrammerfact.ui.models;

import com.bodybuilding.thebrogrammerfact.entities.BrogrammerFact;
import org.apache.wicket.model.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * @author Allan Cascante (allan.cascante@bodybuilding.com)
 */
public class BrogrammerFactsModel extends Model<HashSet<BrogrammerFact>>{

    public BrogrammerFactsModel() {

        HashSet<BrogrammerFact> object = new HashSet<BrogrammerFact>();
        BrogrammerFact brogrammerFact = new BrogrammerFact();

        brogrammerFact.setFact("Brogrammers write code in between push-ups");
        brogrammerFact.setAuthorEmail("allan.cascante@gmail.com");
        brogrammerFact.setDateAdded(new Date());
        brogrammerFact.setDeleted(false);

        object.add(brogrammerFact);

        this.setObject(object);
    }

}
