package patterns.builder.builders;

import patterns.builder.entities.Website;

public abstract class WebsiteBuilder {
    private Website website;

    public void createWebsite() {
        website = new Website();
    }

    public abstract void buildName();

    public abstract void buildCms();

    public abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }

}
