package builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
