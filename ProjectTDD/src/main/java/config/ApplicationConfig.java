package config;

public class ApplicationConfig {


    public static final String APP_NAME =PropertiesLoader.get("app.name","TDD FRAMEWORK");

    public static final String APP_version =PropertiesLoader.get("app.version","1.0.0");

    public static final String ENV=PropertiesLoader.get("env","dev");

    public static final String BASE_URL=ENV.equals("prod") ? "https://api.production.com" : "https://api.development.com";


    public static final boolean ENABLE_DEBUG_LOGGING=ENV.equals("dev");








}
