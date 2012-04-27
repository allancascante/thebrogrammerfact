package com.bodybuilding.thebrogrammerfact.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Allan Cascante (allan.cascante@bodybuilding.com)
 */
public class BrogrammerFact implements Serializable {

    private String fact;
    private Date dateAdded;
    private String authorEmail;
    private boolean deleted;

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
