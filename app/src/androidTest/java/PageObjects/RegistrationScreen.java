package PageObjects;

import androidx.test.espresso.ViewInteraction;

import org.junit.runner.RunWith;
import org.snowcorp.login.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.snowcorp.login.LoginActivityTest2.childAtPosition;
import static org.snowcorp.login.LoginActivityTest2.childAtPosition;

public class RegistrationScreen {

    private final int emailId = R.id.edit_email;
    private final int passwd = R.id.edit_password;


    public void EnterFullName(){
        ViewInteraction textInputEditText = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.edit_name),
                                0),
                        0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("manthan bhatiya"), closeSoftKeyboard());
    }
    public void EnterEmail(){
        ViewInteraction textInputEditText2 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.edit_email),
                                0),
                        0),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("manthan@gmail.com"), closeSoftKeyboard());
    }

    public void EnterPass(){
        ViewInteraction textInputEditText3 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.edit_password),
                                0),
                        0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("123456789"), closeSoftKeyboard());
    }

    public  void clickOnRegisterBtn (){
       onView(withId(R.id.button_register)).perform(click(),closeSoftKeyboard());

    }
}
