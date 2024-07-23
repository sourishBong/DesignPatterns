package singletonPattern.eagerInitialization;

public class ConfigurationManager {

    //Create a private static instance variable
    private static final ConfigurationManager instance=new ConfigurationManager();

    // Application settings
    private String databaseUrl;
    private String apiKey;

    //create private constructor to stop external initialization
    private ConfigurationManager(){
        // Private constructor to prevent instantiation
        // Initialize default settings
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    //create a public static getter method to access single instance

    public static ConfigurationManager getInstance(){
        return instance;
    }

    // Getter and setter methods for application settings
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void displayConfiguration() {
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("API Key: " + apiKey);
    }

    public static void main(String args[]){
        ConfigurationManager instance=ConfigurationManager.getInstance();

        instance.displayConfiguration();
    }
}
