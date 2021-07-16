package yogaholics.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.settings.SlingSettingsService;

@Model(adaptables=Resource.class)

public class titletext {


    private String title;

    @PostConstruct
    protected void init() {
        title += "\tThe new title:\n";
    }

    public String getMessage() {
        return title;
    }

}
