package flyweight;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website news = websiteFactory.getWebsiteCategory("news");
        news.use();
        System.out.println(websiteFactory.getWebsiteAmount());
    }
}
