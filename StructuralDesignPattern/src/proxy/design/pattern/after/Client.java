package proxy.design.pattern.after;

import java.util.HashMap;
import java.util.Map;

// Step 4: Proxy class for controlling access, caching, and logging
class RemoteServiceProxy implements RemoteServiceInterface {
    private RemoteService realService;
    private Map<String, String> cache;

    public RemoteServiceProxy() {
        this.realService = new RemoteService();
        this.cache = new HashMap<>();
    }

    public String fetchData(String endpoint) {
        // Check if data is in the cache
        if (cache.containsKey(endpoint)) {
            System.out.println("Fetching data from cache: " + endpoint);
            return cache.get(endpoint);
        } else {
            // Fetch data from the real service
            String data = realService.fetchDataFromRemote(endpoint);

            // Cache the result
            cache.put(endpoint, data);

            // Log the access
            System.out.println("Logged access to: " + endpoint);

            return data;
        }
    }
}

// Step 5: Interface to be implemented by both RealService and Proxy
interface RemoteServiceInterface {
    String fetchData(String endpoint);
}

// Step 6: Modify RealService to implement RemoteServiceInterface
class RemoteService implements RemoteServiceInterface {
    public String fetchDataFromRemote(String endpoint) {
        // Simulating a network request to fetch data
        System.out.println("Fetching data from remote service: " + endpoint);
        // Actual implementation would involve HTTP requests, etc.
        return "Data from remote service for " + endpoint;
    }

    public String fetchData(String endpoint) {
        return fetchDataFromRemote(endpoint);
    }
}

public class Client {
    public static void main(String[] args) {
        RemoteServiceInterface service = new RemoteServiceProxy();
        String data = service.fetchData("/api/resource");
        System.out.println("Received data: " + data);
    }
}
