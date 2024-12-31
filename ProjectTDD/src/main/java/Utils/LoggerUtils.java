package Utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;


public class LoggerUtils {


    public static final Logger logger= LogManager.getLogger(LoggerUtils.class);

    public static void setlogInfo(String message){
        infoRootLevel();
        logger.info(message);
    }
    public static void  setlogDebug(String message){
        debugRootLevel();
        logger.debug(message);
    }
    public static  void debugRootLevel( ){
        Configurator.setRootLevel(Level.DEBUG);
        logger.debug("Enabled debug mode.");
    }
    public static  void infoRootLevel( ){
        Configurator.setRootLevel(Level.INFO);
        logger.info("Enabled info mode.");
    }




}
