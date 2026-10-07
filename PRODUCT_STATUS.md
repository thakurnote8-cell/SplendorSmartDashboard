# Product status

**Product:** Splendor Smart Dashboard
**Version:** 1.0.0
**Package:** com.splendordashboard
**Target:** Android 15 / API 35
**Primary layout:** landscape / handlebar-mounted phone

## Included

- Real GPS speed with smoothing and implausible-jump rejection
- GPS status and accuracy indicator
- Compass heading when supported by device sensors
- Trip start / pause / resume / reset
- Persistent trip state across app restarts
- Configurable fuel/range estimator
- REFUEL action that resets the estimated range baseline
- Day / night / automatic theme behavior
- Keep-screen-awake and fullscreen controls
- Battery and charging indication
- Navigation shortcut with graceful missing-app handling
- Demo mode with explicit DEMO labeling
- Diagnostics screen
- Settings persistence
- Charging/boot receiver with Android background-launch-safe notification behavior
- Offline-first operation
- GitHub Actions debug APK build
- Launcher icon and Android application metadata

## Deliberate non-claims

- No direct motorcycle ECU/CAN/OBD integration is included.
- USB power is not treated as an ignition signal.
- Fuel level is not physically sensed.
- Automatic activity launch is not guaranteed because Android may restrict background launches.
- The current project is a testable debug build; a production signing key is not included.