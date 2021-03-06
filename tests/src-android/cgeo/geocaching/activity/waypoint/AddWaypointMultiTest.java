package cgeo.geocaching.activity.waypoint;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withChild;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

import cgeo.geocaching.R;
import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.enumerations.WaypointType;
import cgeo.geocaching.models.Geocache;

import android.test.suitebuilder.annotation.Suppress;

import com.google.android.apps.common.testing.ui.espresso.ViewInteraction;

public class AddWaypointMultiTest extends AbstractAddWaypointActivityTest {

    @Override
    protected Geocache createTestCache() {
        final Geocache cache = super.createTestCache();
        cache.setType(CacheType.MULTI);
        return cache;
    }

    @Suppress
    public static void testMysteryDefaultWaypointFinal() {
        final ViewInteraction waypointTypeSelector = onView(withId(R.id.type));
        waypointTypeSelector.check(matches(isDisplayed()));
        waypointTypeSelector.check(matches(withChild(withText(WaypointType.STAGE.getL10n()))));
    }

}
