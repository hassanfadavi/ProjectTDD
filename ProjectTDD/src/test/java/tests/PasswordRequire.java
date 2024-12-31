package tests;

import Base.BaseTest;
import core.Password;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordRequire extends BaseTest {

    //Verify that the password contains
    // a capital letter,
    // a small letter,
    // a number,
    // and a special character.
    @Test
    public void passRequire(){

       Password.password("@aAaaaa1");

       boolean isPasswordValid=true;

        Assertions.assertEquals(isPasswordValid, Password.checkRequrement(),"Password should fail validation");




    }


}
