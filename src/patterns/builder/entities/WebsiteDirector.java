package patterns.builder.entities;

import patterns.builder.builders.WebsiteBuilder;
import patterns.builder.entities.Website;

public class WebsiteDirector {
    private WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebsite();
    }

}
