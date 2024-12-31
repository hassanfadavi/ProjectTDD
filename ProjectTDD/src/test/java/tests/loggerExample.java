package tests;

import Base.BaseTest;
import Utils.LoggerUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class loggerExample extends BaseTest {


    @Test
    public void checkLogger(){

//        LoggerUtils.setlogInfo("info");

        LoggerUtils.setlogDebug("debug");

    }
}
