Experiment 8: Implement Menus and WebView in Android

Student Details

- Name: Bhavya Khatri
- USN: 25MCAR0217
- Course: MCA – 3rd Semester
- Experiment: 8
- Platform: Android
- Language: Kotlin
- UI Design: XML Layouts

1. Aim

To implement an Android application using Kotlin and XML that demonstrates the use of an Options Menu and WebView to load and display websites within the application.

2. Objective

- To create an Android Options Menu using "onCreateOptionsMenu()".
- To handle menu selections using "onOptionsItemSelected()".
- To display web pages inside an Android application using "WebView".
- To load a website entered by the user through an input field.
- To use a Toolbar to display the application title and Options Menu.
- To demonstrate menu actions such as Home, Reload, Clear URL, and About.

3. Concepts and Technologies Used

Technology / Concept| Description
Kotlin| Programming language used for application logic.
XML Layouts| Used to design the application's user interface.
ConstraintLayout| Positions the UI components relative to one another.
Toolbar| Displays the application title and overflow menu.
Options Menu| Provides actions such as Home, Reload, Clear URL, and About.
WebView| Displays web pages inside the application.
EditText| Accepts a website URL from the user.
Button| Triggers the website-loading operation.
Toast| Displays short messages, including student information.
Internet Permission| Allows the application to access websites.

4. Scenario Demonstrated

The application demonstrates how a user can browse websites inside an Android application without opening a separate browser.

The main screen displays the experiment title, student details, a URL input field, a Load Website button, and a WebView.

The user can enter a website address and tap Load Website to display the requested page. The Toolbar provides an Options Menu containing four actions: Home, Reload, Clear URL, and About.

The About option displays the student's name and USN in a Toast message.

5. Application Workflow

1. Launch the application.
2. The main screen displays the URL field, Load Website button, and WebView.
3. The application initially loads Google in the WebView.
4. Enter a website address in the URL field.
5. Tap Load Website to load the requested page inside the application.
6. Open the three-dot Options Menu in the Toolbar.
7. Select an appropriate menu item:
   - Home: Loads Google and restores its URL in the input field.
   - Reload: Reloads the currently displayed page.
   - Clear URL: Clears the URL input field.
   - About: Displays the student's name and USN.

6. Project Folder Structure

Experiment08/
├── AndroidProject/
│   └── Experiment08/
│       ├── app/
│       │   └── src/
│       │       └── main/
│       │           ├── java/
│       │           │   └── com/example/experiment08/
│       │           │       └── MainActivity.kt
│       │           ├── res/
│       │           │   ├── layout/
│       │           │   │   └── activity_main.xml
│       │           │   └── values/
│       │           └── AndroidManifest.xml
│       ├── build.gradle.kts
│       └── settings.gradle.kts
├── Screenshots/
│   ├── output.png
│   ├── test_case_1_webview.png
│   ├── test_case_2_menu.png
│   └── test_case_3_about.png
├── Observation/
└── README.md

Note: The tree shows the intended submission organization. Keep the actual generated Gradle files, resources, and source directories from Android Studio. Adjust the tree if your final repository structure differs.

7. Important Source Files

MainActivity.kt

This file contains the application's main logic, including:

- Initializing the Toolbar and setting it as the activity's support action bar.
- Connecting XML views to Kotlin variables using "findViewById()".
- Loading websites through the WebView.
- Validating the URL input and adding the HTTPS scheme when one is omitted.
- Creating the Options Menu.
- Handling menu-item selections.
- Displaying the About message.

activity_main.xml

This file defines the application's user interface using ConstraintLayout. It contains the Toolbar, experiment heading, student details, URL input field, Load Website button, and WebView.

AndroidManifest.xml

This file declares the Internet permission required to load websites:

<uses-permission android:name="android.permission.INTERNET" />

8. Test Cases

Test Case 1: Load a Website

Objective: To verify that the application can load a website inside the WebView.

Procedure:

1. Launch the application.
2. Enter a valid website URL.
3. Tap Load Website.
4. Observe the WebView.

Expected Result: The requested website is displayed inside the application.

Screenshot: "Screenshots/test_case_1_webview.png"

Status: Pass only after successful execution and verification.

<img width="720" height="1600" alt="test_case_1_webview" src="https://github.com/user-attachments/assets/ea9ca310-9829-4254-8b1e-0c518957fed7" />


Test Case 2: Display the Options Menu

Objective: To verify that the Toolbar displays the available menu options.

Procedure:

1. Launch the application.
2. Tap the three-dot icon in the Toolbar.
3. Observe the menu items.

Expected Result: The menu displays Home, Reload, Clear URL, and About.

Screenshot: "Screenshots/test_case_2_menu.png"

Status: Pass only after confirming that all four options appear.

<img width="720" height="1600" alt="test_case_2_menu" src="https://github.com/user-attachments/assets/d339ead5-eda7-4da0-bc07-235a6d46ec25" />


Test Case 3: Display Student Information

Objective: To verify that the About menu displays the student's identification.

Procedure:

1. Open the Options Menu.
2. Select About.
3. Observe the Toast message.

Expected Result: The message displays Bhavya Khatri and USN 25MCAR0217.

Screenshot: "Screenshots/test_case_3_about.png"

Status: Pass only after confirming that the message appears correctly.

<img width="720" height="1600" alt="test_case_3_about" src="https://github.com/user-attachments/assets/71d2b79a-6497-44a6-904d-894cb708998d" />


9. Application Output

The main output screenshot demonstrates the application interface, student information, URL input field, Load Website button, and Google displayed inside the WebView.

Output Screenshot: "Screenshots/output.png"

<img width="720" height="1600" alt="output" src="https://github.com/user-attachments/assets/9c8e4f58-21a8-4289-a234-f01472b70b91" />
