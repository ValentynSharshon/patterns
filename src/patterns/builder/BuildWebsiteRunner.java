package patterns.builder;

import patterns.builder.builders.EnterpriseWebsiteBuilder;
import patterns.builder.builders.VisitCardWebsiteBuilder;
import patterns.builder.entities.Website;
import patterns.builder.entities.WebsiteDirector;

import static java.lang.System.out;

public class BuildWebsiteRunner {

    public static void main(String[] args) {
        WebsiteDirector director = new WebsiteDirector();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website visitCardWebsite = director.buildWebsite();
        out.println(visitCardWebsite);

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website enterpriseWebsite = director.buildWebsite();
        out.println(enterpriseWebsite);
    }

}
