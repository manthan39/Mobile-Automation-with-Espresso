package PageObjects;

import androidx.test.espresso.ViewInteraction;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.snowcorp.login.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.snowcorp.login.LoginActivityTest2.childAtPosition;

public class LoginScreen {

    private final int registrationBtn = R.id.button_register;

    public void clickOnRegistrationButton(){
        ViewInteraction materialButton = onView(
                allOf(withId(R.id.button_register), withText("Go to Register"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton.perform(click());
    }

    public void CheckLoginPageTitle(){
        ViewInteraction textView = onView(
                allOf(withText("Android Login"),
                        withParent(allOf(withId(R.id.action_bar),
                                withParent(withId(R.id.action_bar_container)))),
                        isDisplayed()));
        textView.check(matches(withText("Android Login")));
    }


}
