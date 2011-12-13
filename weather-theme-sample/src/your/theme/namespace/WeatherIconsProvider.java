package your.theme.namespace;

import net.hubalek.android.makeyourclock.themes.weather.AbstractWeatherIconsProvider;

/**
 * Concrete implementation of weather icons provider.
 */
public class WeatherIconsProvider extends AbstractWeatherIconsProvider {
    @Override
    protected int getDescriptionResourceId() {
        return R.string.weather_icon_theme_description;
    }

    @Override
    protected int getAuthorUrlResourceId() {
        return R.string.weather_icon_theme_author_web_url;
    }

    @Override
    protected int getAuthorResourceId() {
        return R.string.weather_icon_theme_author_name;
    }
}
