package patterns.builder.builders;

import patterns.builder.enums.Cms;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    public void buildName() {
        getWebsite().setName("Enterprise website");
    }

    @Override
    public void buildCms() {
        getWebsite().setCms(Cms.ALFRESCO);
    }

    @Override
    public void buildPrice() {
        getWebsite().setPrice(10_000);
    }

}
