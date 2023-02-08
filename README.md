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

``
An activity in Android is a single, focused task that a user can perform. An activity represents a screen in an app with which the user can interact in order to do something, such as view a list of items, take a photo, or send an email. An Android app can have multiple activities, each with a different screen, and the activities can be navigated between using intents. An activity is implemented as a Java or Kotlin class that extends the Activity class and must be declared in the Android Manifest file.``

* *onCreate()*

``
The onCreate() function is the entry point to this app and calls other functions to build the user interface. In Kotlin programs, the main() function is the specific place in your code where the Kotlin compiler starts. In Android apps, the onCreate() function fills that role. ``

* *setContent()*

``
The setContent() function within the onCreate() function is used to define your layout through composable functions. All functions marked with the @Composable annotation can be called from the setContent() function or from other Composable functions. The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.
``
> The compiler takes the Kotlin code you wrote, looks at it line by line, and translates it into something that the computer can understand. This process is called compiling your code.
> 
---
* *Composable function*

``A Composable function (@Composable annotation above it) takes some input and generates what's shown on the screen.``
> * @Composable function names are capitalized.
> * You add the @Composable annotation before the function.
> * @Composable functions can't return anything.
[read more](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables#11)

* *Modifier* 

``Compose uses a Modifier object, which is a collection of elements that decorate or modify the behavior of Compose UI elements. You use this to style the UI components of the Dice Roller app's components.``

* *state in Compose*

``
State in an app is any value that can change over time. In this app, the state is the cost of service.
``

---

* [Kotlin Nullabilty HandLing](https://developer.android.com/codelabs/basic-android-kotlin-compose-nullability?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-nullability#2)

* [Use classes and objects in Kotlin](https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects#0)

* [Use function types and lambda expressions in Kotlin](https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-function-types-and-lambda#1)

* [Additional Resources](https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#9)




### Descriptions (Project Wise):
3). [Tip Calculator](https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-using-state#6)

2). [Lemonade](https://developer.android.com/codelabs/basic-android-kotlin-compose-button-click-practice-problem?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-button-click-practice-problem#3)

1). [Dice Roller](https://developer.android.com/codelabs/basic-android-kotlin-compose-build-a-dice-roller-app?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-build-a-dice-roller-app#7)
