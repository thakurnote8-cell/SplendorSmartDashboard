# Privacy — Splendor Smart Dashboard

Splendor Smart Dashboard is designed to work offline and does not require an account or a cloud service for dashboard operation.

## Data used on the device

- **Location:** used locally to calculate GPS speed, accuracy and trip distance when location permission is granted.
- **Sensors:** rotation/magnetic sensors may be used locally for the compass display.
- **Battery/power state:** used to show battery/charging status and handle the app's power-event notification behavior.
- **Trip/settings data:** stored locally in Android app preferences.

The app does not intentionally upload these dashboard data to a remote server.

## Important limitations

GPS speed depends on the Android device's location fix. Fuel/range is an estimate based on user-configured values; it is not a physical fuel sensor. USB/charging detection is only a power signal and does not prove motorcycle ignition state.