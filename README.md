
# ExceptionHandler
Simple Library for Redirect to destination Activity when apps force close

This is an Android project allowing to Intent to destination Activity when apps force close in the simplest way possible.


# Demo Video
For Demo video Click this image

[![Watch This Video](http://img.youtube.com/vi/9CC9Ahih20w/0.jpg)](https://youtu.be/9CC9Ahih20w)

# Usage
To use this library you can add ExceptionHandler library in your project or you can also grab it via Gradle:

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
   repositories {
    maven { url "https://jitpack.io" }
   }
}
```

Add dependencies :
```gradle
dependencies {
     implementation 'com.github.rerlanggas:ExceptionHandler:1.0.0'
}
```
# JAVA
add this code in first activity launch
```java
        //init exception handler, add destination activity
        ExceptionHandler.init(this, [[Destination Activity]].class);
```
# Reference
http://stackoverflow.com/questions/9879038/android-exceptions-without-force-close

LICENCE
-----
 [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).
