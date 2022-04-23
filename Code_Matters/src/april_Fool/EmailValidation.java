package april_Fool;

import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static org.testng.Assert.assertTrue;

public class EmailValidation {

    public static void main(String[] args) {


    }
    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    @Test
    public void testUsingStrictRegex(String emailAddress, String regexPattern) {
        emailAddress = "username@domain.com";
        regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        assertTrue(EmailValidation.patternMatches(emailAddress, regexPattern));
    }
}