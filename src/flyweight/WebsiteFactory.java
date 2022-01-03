package flyweight;

import java.util.HashMap;

public class WebsiteFactory {
    private HashMap<String, Website> pool = new HashMap<>();

    public Website getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            ConcreteWebsite website = new ConcreteWebsite(type);
            pool.put(type, website);
        }
        return pool.get(type);
    }

    public int getWebsiteAmount() {
        return pool.size();
    }
}
