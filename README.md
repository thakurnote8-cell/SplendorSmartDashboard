# Splendor Smart Dashboard

Native, offline-first Android motorcycle dashboard for a handlebar-mounted phone. **Product name: Splendor Smart Dashboard. Version 1.0.0.**

## Build
Open in Android Studio with Android 15 / API 35 SDK installed. The project uses Android Gradle Plugin 8.6.1 and Java 17. Build the debug APK with `gradle assembleDebug` or the included GitHub Actions workflow.

## Runtime notes
- GPS speed is real only when Android supplies a location fix; smoothing and implausible-jump rejection are applied.
- Fuel/range is an estimate from configured tank/mileage and refuel events.
- USB/charging is only a power signal, not proof of ignition.
- Android background-launch restrictions may prevent automatic activity launch; a notification is used instead.
- Navigation uses an installed navigation app.
- Demo mode is explicitly labeled.

## Default vehicle configuration
Tank 9.8 L, mileage 60 km/L, reserve 1.0 L, practical display range 550 km, gauge max 160 km/h.

## GitHub APK
The Actions workflow builds a debug APK on GitHub-hosted Ubuntu using Java 17, Android SDK 35 and Gradle 8.7. Open **Actions → Build Android APK**, run the workflow, then download artifact `splendor-smart-dashboard-debug-apk`.

This is a debug/test build. No production signing key is included.