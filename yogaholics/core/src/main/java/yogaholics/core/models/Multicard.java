package yogaholics.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
 
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional; 
import org.apache.sling.settings.SlingSettingsService;
 
@Model(adaptables = Resource.class)
public class Multicard {
 
 // Inject the products node under the current node
 @Inject
 @Optional
 public Resource cards;
 
 @Inject @Default(values="Title here")
 public String cardtitle;
 // No need of a post construct as we don't have anything to modify after the
 // model is constructed
 
 public String getCardtitle() {
     return cardtitle;
 }
}

