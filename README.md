# issue3114
### What product is affected?
- Firebase Performance Monitoring
### Description
- Issue 3114: [link](https://github.com/firebase/firebase-android-sdk/issues/3114)
### Steps to reproduce issue
- Clone project
- Open project
- Go to Terminal
- Uncommenting `com.google.firebase:firebase-perf-ktx` version `20.0.0` then run run `./gradlew module:connectedCheck`, will show the error
- Uncommenting `com.google.firebase:firebase-perf-ktx` version `19.1.1` then run run `./gradlew module:connectedCheck`, will not show the error
### Summary
- Error: `java.lang.IllegalStateException: Default FirebaseApp is not initialized in this process com.argz.module.test. Make sure to call FirebaseApp.initializeApp(Context) first.` is encountered
- Issue is present on `com.google.firebase:firebase-perf-ktx` version > `20.0.0`
