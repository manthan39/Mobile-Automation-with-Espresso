package tests;

import android.os.SystemClock;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import PageObjects.LoginScreen;
import PageObjects.RegistrationScreen;
import PageObjects.TestBase;

import static androidx.test.espresso.Espresso.onView;

@RunWith(AndroidJUnit4.class)
public class RegistrationTest extends TestBase {

        LoginScreen loginScreen = new LoginScreen();
        RegistrationScreen registrationScreen = new RegistrationScreen();

        @Test
        public void VerifyRegistration(){

            loginScreen.clickOnRegistrationButton();
            registrationScreen.EnterFullName();
            registrationScreen.EnterEmail();
            registrationScreen.EnterPass();
            registrationScreen.clickOnRegisterBtn();
            SystemClock.sleep(5000);
            loginScreen.CheckLoginPageTitle();
        }


    }


