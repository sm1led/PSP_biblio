import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    // Tests for password validation
    @Test
    void testPassword_tooShort() {
        assertFalse(passwordChecker.notShorterThanX("Passw1","7"));
    }

    @Test
    void testPassword_lengthValid() {
        assertTrue(passwordChecker.notShorterThanX("Passw123","7"));
    }

    @Test
    void testPassword_hasUppercase() {
        assertTrue(passwordChecker.hasUppercase("Passw1"));
    }

    @Test
    void testPassword_hasSpecialSym() {
        assertTrue(passwordchecker.hasSpecialSym("Passw1"));
    }

    // Tests for phone validation

    @Test
    void testPhoneNumber_hasCorrectSymbols() {
        assertTrue(phoneValidator.hasCorrectSym("861263212"));
    }

    @Test
    void testPhoneNumber_tooShort() {
        assertFalse(phoneValidator.hasCorrectSym("86126322"));
    }

    @Test
    void testChangePhonePrefix() {
        assertEquals("+37061263212",phoneValidator.addCountryPrefix("861263212"));
    }

    @Test
    void testPhoneNumber_wrongCountryPrefix() {
        assertFalse(phoneValidator.checkCountryPrefix("LT", "+39061263212"));
    }

    @Test
    void testPhoneNumber_numberTooShort() {
        assertFalse(phoneValidator.checkCountryPrefix("LT", "+3761263212"));
    }

    // Tests for email validation
    @Test
    void testEmail_hasAtSign() {
        assertTrue(emailValidator.hasAtSign("dramblys@gmail.com"));
    }

    @Test
    void testEmail_hasInvalidCharacters() {
        assertFalse(emailValidator.checkValidCharacters("dramblys£@gmail.com"));
    }

    @Test
    void testEmail_hasInvalidDomain() {
        assertFalse(emailValidator.checkDomain("dramblys@gmaile.com"));
    }

    @Test
    void testEmail_hasInvalidTopLevelDomain() {
        assertFalse(emailValidator.checkDomain("dramblys@gmail.come"));
    }
    
}
