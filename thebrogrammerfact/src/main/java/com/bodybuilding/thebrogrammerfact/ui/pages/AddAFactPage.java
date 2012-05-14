package com.bodybuilding.thebrogrammerfact.ui.pages;

import com.bodybuilding.thebrogrammerfact.entities.BrogrammerFact;
import com.bodybuilding.thebrogrammerfact.ui.models.BrogrammerFactsModel;
import org.apache.wicket.markup.html.form.EmailTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.validation.validator.EmailAddressValidator;

/**
 * @author Allan Cascante (allan.cascante@bodybuilding.com)
 */
public class AddAFactPage extends BasePage {

    public AddAFactPage(PageParameters parameters) {

        final BrogrammerFactsModel brogrammerFactsModel = new BrogrammerFactsModel();
        final BrogrammerFact brogrammerFact = new BrogrammerFact("Write your fact", "test@test.com");

        Form addFactForm = new Form("addFactForm"){
            @Override
            protected void onSubmit() {
                brogrammerFactsModel.getObject().add(brogrammerFact);
                this.getRequestCycle().setResponsePage(HomePage.class);
            }
        };
        TextField<String> factInputTextField = new TextField<String>("factInput", new PropertyModel<String>(brogrammerFact, "fact"));
        factInputTextField.setRequired(true);
        addFactForm.add(factInputTextField);
        EmailTextField emailTextField = new EmailTextField("authorEmailInput", new PropertyModel<String>(brogrammerFact, "authorEmail"), EmailAddressValidator.getInstance());
        addFactForm.add(emailTextField);
        emailTextField.setRequired(true);
        addFactForm.add(new FeedbackPanel("feedbackPanel"));
        add(addFactForm);

    }

}
