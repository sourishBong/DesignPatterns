package singletonPattern.lazyInitialization;

public class ConfigurationManagerlazy {

    private static ConfigurationManagerlazy instance;

    // Application settings
    private String databaseUrl;
    private String apiKey;

    private ConfigurationManagerlazy(){
        // Private constructor to prevent instantiation
        // Initialize default settings
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public static ConfigurationManagerlazy getInstance(){
        if(instance==null){
            synchronized (ConfigurationManagerlazy.class){
                if(instance==null)
                    instance=new ConfigurationManagerlazy();
            }
        }
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

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(()->{
                ConfigurationManagerlazy instance=ConfigurationManagerlazy.getInstance();
                instance.displayConfiguration();
            }).start();
        }
    }
}
