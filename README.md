# Android-Kotlin-Compose Basics :
* *Manifest file*

``
The Android Manifest is an XML file that provides important information
about the app to the Android operating system. It includes details such
as the app's package name, the permissions the app requires, the app's
components (activities, services, broadcast receivers, etc.), the minimum
API level required to run the app, and other app-related details. The Android
Manifest is an essential part of every Android app,and must beincluded in the
app's root directory for the app to work properly.
``
* *What is Activity*

``
An activity in Android is a single, focused task that a user can perform.
An activity represents a screen in an app with which the user can interact
in order to do something, such as view a list of items, take a photo, or
send an email. An Android app can have multiple activities, each with a
different screen, and the activities can be navigated between using intents.
An activity is implemented as a Java or Kotlin class that extends the Activity class
and must be declared in the Android Manifest file.``

* *onCreate()*

``
The onCreate() function is the entry point to this app and calls other functions to
build the user interface. In Kotlin programs, the main() function is the specific place
in your code where the Kotlin compiler starts. In Android apps, the onCreate() function
fills that role. ``

* *setContent()*

``
The setContent() function within the onCreate() function is used to define your layout
through composable functions. All functions marked with the @Composable annotation can
be called from the setContent() function or from other Composable functions. The annotation
tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.
``
> The compiler takes the Kotlin code you wrote, looks at it line by line, and translates
it into something that the computer can understand. This process is called compiling your code. </mark>
