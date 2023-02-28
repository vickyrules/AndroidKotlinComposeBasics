<div align = "center">

| ![image](https://user-images.githubusercontent.com/73611313/216632656-974bdaec-e50b-4eed-9a7a-45574519cddc.png)    |
|-----|
| ![image](https://user-images.githubusercontent.com/73611313/216632993-6ab58413-0f0e-4533-8d78-ecc99f55e1dd.png)    |

</div>

# Android-Kotlin-Compose Basics :

* *Manifest file*

``
The Android Manifest is an XML file that provides important information about the app to the Android operating system. It includes details such as the app's package name, the permissions the app requires, the app's components (activities, services, broadcast receivers, etc.), the minimum API level required to run the app, and other app-related details. The Android Manifest is an essential part of every Android app,and must beincluded in the app's root directory for the app to work properly.
``
* *What is Activity*

``An activity in Android is a single, focused task that a user can perform. An activity represents a screen in an app with which the user can interact in order to do something, such as view a list of items, take a photo, or send an email. An Android app can have multiple activities, each with a different screen, and the activities can be navigated between using intents. An activity is implemented as a Java or Kotlin class that extends the Activity class and must be declared in the Android Manifest file.``

---

### Activity LifeCycle
<div  align="center" >
<img width="50%" src = "https://user-images.githubusercontent.com/73611313/220359339-338a6423-0a89-4771-aefe-8dbb2139fd90.png"/>
<img width="50%" src = "https://user-images.githubusercontent.com/73611313/220364213-c6cc8dd8-acbc-41c8-8519-20e4dfb3fd3d.png"/>
</div>


* *onCreate()*
>The onCreate() function is the entry point to this app and calls other functions to build the user interface. In Kotlin programs, the main() function is the specific place in your code where the Kotlin compiler starts. In Android apps, the onCreate() function fills that role. ``

* *setContent()*

>The setContent() function within the onCreate() function is used to define your layout through composable functions. All functions marked with the @Composable annotation can be called from the setContent() function or from other Composable functions. The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.

`` The compiler takes the Kotlin code you wrote, looks at it line by line, and translates it into something that the computer can understand. This process is called compiling your code.
``

* *onStart()*
> The onStart() lifecycle method is called just after onCreate(). After onStart() runs, your activity is visible on the screen. Unlike onCreate(), which is called only once to initialize your activity, onStart() can be called by the system many times in the lifecycle of your activity.

* *onRestart()*
* *onResume()*
* *onPause()*
* *onDestroy()*

[summary](https://developer.android.com/codelabs/basic-android-kotlin-compose-activity-lifecycle?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-4-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-activity-lifecycle#6)

**When an activity starts from the beginning, you see all three of these lifecycle callbacks called in order:**

>* onCreate() when the system creates the app.
>* onStart() makes the app visible on the screen, but the user is not yet able to interact with it.
>* onResume() brings the app to the foreground, and the user is now able to interact with it.

---
## Jetpack Compose:
* *Composable function*

``A Composable function (@Composable annotation above it) takes some input and generates what's shown on the screen.``
> * @Composable function names are capitalized.
> * You add the @Composable annotation before the function.
> * @Composable functions can't return anything.
    [read more](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#11)

* *Modifier*

``Compose uses a Modifier object, which is a collection of elements that decorate or modify the behavior of Compose UI elements. You use this to style the UI components of the Dice Roller app's components.``

* *state in Compose*

>State in an app is any value that can change over time. In this app, the state is the cost of service.
[learn more..](https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-using-state#13)


---
## Compose Animations:
* *Spring Bounce Animation*
> Spring animation is a physics-based animation driven by a spring force. With a spring animation, the value and velocity of movement are calculated based on the spring force that is applied
[read more..](https://developer.android.com/codelabs/basic-android-kotlin-compose-woof-animation?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-woof-animation#6)
---

## Kotlin:

* [Kotlin Nullabilty HandLing](https://developer.android.com/codelabs/basic-android-kotlin-compose-nullability?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-nullability#2)

* [Use classes and objects in Kotlin](https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects#0)

* [Use function types and lambda expressions in Kotlin](https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-function-types-and-lambda#1)

* [Additional Resources](https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#9)

* [Generic data types](https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#1)

* [enum class](https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#2)

* [data class](https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#3)

* [singleton object](https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#4)

* [collections](https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-collections#6)

* [Higher order functions](https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#8)

* ### Coroutines:
  >Concurrency involves performing multiple tasks in your app at the same time. For example, your app can get data from a web server or save user data on the device, while responding to user input events and updating the UI accordingly.

  ``To do work concurrently in your app, you will be using Kotlin coroutines. Coroutines allow the execution of a block of code to be suspended and then resumed later, so that other work can be done in the meantime. Coroutines make it easier to write asynchronous code, which means one task doesn't need to finish completely before starting the next task, enabling multiple tasks to run concurrently.``

  * ###### Synchronous:

  > In synchronous code, only one conceptual task is in progress at a time. You can think of it as a sequential linear path. One task must finish completely before the next one is started.

  * ###### Asynchronous:
  > Use the launch() function from the coroutines library to launch a new coroutine. To execute tasks concurrently, add multiple launch() functions to your code so that multiple coroutines can be in progress at the same time.
  [read more...](https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-kotlin-playground?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-coroutines-kotlin-playground#2)

  * *async()*
  > * In the real world, you won't know how long the network requests for forecast and temperature will take. If you want to display a unified weather report when both tasks are done, then the current approach with launch() isn't sufficient. That's where async() comes in.
  > * Use the async() function from the coroutines library if you care about when the coroutine finishes and need a return value from it.
      [read how to use](https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-kotlin-playground?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-coroutines-kotlin-playground#2)

  * *Parallel Decomposition*
  >Parallel decomposition involves taking a problem and breaking it into smaller subtasks that can be solved in parallel. When the results of the subtasks are ready, you can combine them into a final result.

  * ###### EXCEPTION and CANCELLATION
  >An exception is an unexpected event that happens during execution of your code. You should implement appropriate ways of handling these exceptions, to prevent your app from crashing and impacting the user experience negatively.

  >  A similar topic to exceptions is cancellation of coroutines. This scenario is typically user-driven when an event has caused the app to cancel work that it had previously started.
  >[read more..](https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-kotlin-playground?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-coroutines-kotlin-playground#3)

  * ###### CoroutineContext
  > The CoroutineContext provides information about the context in which the coroutine will be running in. The CoroutineContext is essentially a map that stores elements where each element has a unique key. These are not required fields, but here are some examples of what may be contained in a context:
  > [read more...](https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-kotlin-playground?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-coroutines-kotlin-playground#4)
---
## Testing:
* *Automated tests*

``Automated testing is code that checks to ensure that another piece of code that you wrote works correctly.``
[read more...](https://developer.android.com/codelabs/basic-android-kotlin-compose-write-automated-tests?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-write-automated-tests#2)

* *Unit tests to test coroutines:*
> * Unit testing code that uses coroutines requires some extra attention, as their execution can be asynchronous and happen across multiple threads.
> * To call suspending functions in tests, you need to be in a coroutine. As JUnit test functions themselves aren't suspending functions, you need to use the runTest coroutine builder. This builder is part of the kotlinx-coroutines-test library and is designed to execute tests. The builder executes the test body in a new coroutine.  
[example](https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-android-studio?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-coroutines-android-studio#6)
---
## UI-UX Design Best Practise:

* [design adapted icon](https://developer.android.com/codelabs/basic-android-kotlin-compose-training-change-app-icon?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-training-change-app-icon#8)
* [material color system](https://m2.material.io/design/color/the-color-system.html)


---

## Testing for App Accessibility
* *TalkBack*
>[TalkBack](https://developer.android.com/codelabs/basic-android-kotlin-compose-test-accessibility?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-test-accessibility#2) is a Google screen reader that provides spoken feedback so users can navigate their device without looking at the screen. This is especially helpful for people with impaired vision.

* *Switch Access*
>[Switch Access](https://developer.android.com/codelabs/basic-android-kotlin-compose-test-accessibility?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-test-accessibility#3) lets you interact with your Android device using one or more switches instead of the touchscreen. This alternative to using the touchscreen for users is especially helpful to users with limited dexterity.

---
#### Networks  
* [Http response](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)
  
* *REST*

    ``REST is a software architectural style that defines the set of rules to be used for creating web service``


    *REST architecture must have:* 

      * Client-server architecture
      * Resources exposed as URIs (Uniform Resource Idetifiers)
      * Uniform Interface
      * Stateless


---
### Descriptions (Project Wise):
7). [Race Tracker](https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-android-studio?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-coroutines-android-studio#1)

6). [DesertClicker](https://developer.android.com/codelabs/basic-android-kotlin-compose-activity-lifecycle?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-4-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-activity-lifecycle#1)

5).
* [Woof with Animation](https://developer.android.com/codelabs/basic-android-kotlin-compose-woof-animation?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-woof-animation#2)
* [Woof static](https://developer.android.com/codelabs/basic-android-kotlin-compose-material-theming?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-material-theming#2)

4).[AffirmationApp](https://developer.android.com/codelabs/basic-android-kotlin-compose-training-add-scrollable-list?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-training-add-scrollable-list#0)

3).
*  [Tip Calculator-I](https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-using-state#6)
* [Tip calculator-II](https://developer.android.com/codelabs/basic-android-kotlin-compose-calculate-tip?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-calculate-tip#0)

2). [Lemonade](https://developer.android.com/codelabs/basic-android-kotlin-compose-button-click-practice-problem?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-button-click-practice-problem#3)

1). [Dice Roller](https://developer.android.com/codelabs/basic-android-kotlin-compose-build-a-dice-roller-app?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-build-a-dice-roller-app#7)

