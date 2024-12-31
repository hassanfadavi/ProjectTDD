package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {



 public static final Properties  properties=new Properties();


 static {

        try  (InputStream input = PropertiesLoader.class.
                getClassLoader().
                getResourceAsStream("application.properties")) {


        if (input == null)
            throw new RuntimeException("not found app.properties");

        properties.load(input);

    }catch (IOException e){
            throw new RuntimeException("failed to load app.properties");
    }



 }


 public static String get(String key){

  return  properties.getProperty(key);

 }


 public static String get(String key,String value){

     return properties.getProperty(key,value);
 }


}
