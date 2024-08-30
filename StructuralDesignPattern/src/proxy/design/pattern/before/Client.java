package proxy.design.pattern.before;

// Step 1: Class directly interacting with the remote service
class RemoteServiceClient {
    public String fetchData(String endpoint) {
        // Making a request to the remote service
        String data = RemoteService.fetchDataFromRemote(endpoint);
        return data;
    }
}

// Step 2: The actual remote service
class RemoteService {
    public static String fetchDataFromRemote(String endpoint) {
        // Simulating a network request to fetch data
        System.out.println("Fetching data from remote service: " + endpoint);
        // Actual implementation would involve HTTP requests, etc.
        return "Data from remote service for " + endpoint;
    }
}


public class Client {

    public static void main(String[] args) {
        RemoteServiceClient client = new RemoteServiceClient();
        String data = client.fetchData("/api/resource");
        System.out.println("Received data: " + data);
    }
}
