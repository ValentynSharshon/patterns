package patterns.builder.builders;

import patterns.builder.enums.Cms;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    public void buildName() {
        getWebsite().setName("Visit card");
    }

    @Override
    public void buildCms() {
        getWebsite().setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        getWebsite().setPrice(500);
    }

}
