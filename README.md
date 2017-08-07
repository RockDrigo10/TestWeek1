Test 1:
1.	What set of commands are executed to push a repo on Github?
		git init
		git add
		git commit -m "Message"
2.	Where the strings.xml in the project structure?
		res - values - strings
3.	What is the difference between SP and DP?
		sp is use for textsize only dp for width height etc
4.	How can you support multiple languages in your app? Explain step by step process.
		you have to create a new xml file under values folder where you are going to set the locale based on the language you want in your app then you just have to change the device's language
5.	What is the difference between match_parent and wrap_content?
		match parent will take the properties from the parent while wrap content will get the properties from the device
6.	How can you setup a method for a button click without binding the view?
		by creating btn.setOnClickListener
7.	How can you define a button click method with binding the button view?

8.	How can you change the color of the TextView?
		textcolor and creating a color on color.xml
9.	Where are all the colors in the android architecture saved?
		color.xml
10.	How would you add a different layout for a landscape and a language? Name the qualifiers.
		Locale
11.	How would you make the keyboard hide for EditText when the activity is created?
		using the property enable = false
12.	What are ViewGroups and Views?
		Views are separate elements such as webview, textview, etc. while viewgroups is the class where you set of grouped views
13.	What attribute is necessary in a linear layout if there are more than one child views?
		id, orientation
14.	In which case you would use a Linear layout and a Relative layout?
		Linear layout if you just want to have everything in a single line, Relative layout when you want to set your content in order
15.	How would you load an image in a ImageView from xml and programmatically?
		xml by using src attribute and programmaticaly by using an intent and binding it on the Activity Result method
16.	List all the states in an activity lifecycle.
		onCreate() onStart() onResume() onPause() onStop() -onRestart()-onStart() and onDestroy()
17.	What is the lifecycle of activity one and activity two when we go to activity one from two?
		Activity1onCreate() Activity1onStart() Activity1onResume() Activity1onPause() ActivityonStop() Activity2onCreate() Activity2onStart() Activity2onResume()
18.	How to restrict an activity from changing the orientation?
		you can do it in the manifest configChanges and orientation or programmatically on the method of the onConfiguratonChanged
19.	Which method is called to persist the data before the activity is destroyed?
		onSaveInstanceState
20.	What is the argument of that method?
		outstate
21.	How do we save the data in the method?
		saveState
22.	How to get that data back? What is the name of the method?
		onActivityCreated
23.	What is a bundle? What can a bundle contain?
		saveInstanceState
24.	What is the difference between onPause and onStop?
		onPause is always called, onStop no always
25.	How to start an activity for getting a result back?

26.	Which callback is used get the result back in the above case?
		onActivityCreated
27.	What are difference types of Intent? What are the difference between them? When do we use each of them?
		Intents explicit where you specify the component and implicit where you specify an action
28.	How to communicate data between activities?
		by using intentsor or sharepreferences
29.	How to add data to an intent?
		intent.putExtra and the data you want to send
30.	What kind of data can be added to an intent?
		almost everything objects strings etc
31.	How to get the data sent from activity one in activity two?
		by getting the intent
32.	What is context?
		is the current activity where you are
33.	Name different kinds of layouts in Android?
		Linear Relative Fragment
34.	How to send an object through an Intent?
		intent.putExtra("key",object);
35.	What is Serializable?
		It is used to transfer an object to another view, copying the bytecode
36.	What is Parcelable?
		works same as Serialixzable but it's faster
37.	Which is better and why?
		Parcelable because it doent use reflection
38.	How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?
		to make a class Serializable implements Serializable
		to make a class Parcelable implements Parcelable and the creator method
39.	Can we avoid implementing methods using Parcelable?
		i dont think so
40.	What are launch modes? Explain each one of them in detail.
		launch modes allow you to control the way your activities are shown in case you go back in your app
		singleTop
		singleInstance
		singletask
41.	What is back stack?
		back stack is the way you navigate back through your application
42.	How to we create a .apk file?
		building your app Build APK
43.	How to create and signed .apk file
		you need to generate a key password and alias
