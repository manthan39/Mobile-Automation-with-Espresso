package PageObjects;

import android.app.Activity;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.snowcorp.login.LoginActivity;

public class TestBase<MainActivity extends Activity> {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

}
