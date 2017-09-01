# editor2
A nice photo editor , with filters, effects, stickers etc
Do you also have many different apps in your Android Phone for image click, editing and sharing purpose? Now clean your phone memory. Phimpme is here, with all the features packaged into one.

Click beautiful image from  app. Use various advance scene modes, and variety of While balance modes.

You can use your voice actions to invoke Camera, Just say "Ok Google click a picture". You can also select front and rear camera based on voice.

Browse the local gallery inside the app with folder and all photos mode. Copy, move to images, add description the images.

Edit images with various advance filters, optimized performace using OpenCV library.

Enhance contrast, hue, satur, temp, tint and sharpness of the image.

Crop and rotate feature from Transform section.

Apply different stickers of facial, express, objects, comments, wishes, emojis, hashtag

You can also write anything on images in your handwriting.

To fast the process, user can use the undo and redo features present in the editor.

<b>Setting up the Android Project</b>

Download the phimpme-android project source. You can do this either by forking and cloning the repository (recommended if you plan on pushing changes) or by downloading it as a ZIP file and extracting it.

Install the NDK in Android Studio.

Open Android Studio, you will see a Welcome to Android window. Under Quick Start, select Import Project (Eclipse ADT, Gradle, etc.)

Navigate to the directory where you saved the phimpme-android project, select the root folder of the project (the folder named "phimpme-android"), and hit OK. Android Studio should now begin building the project with Gradle.

Once this process is complete and Android Studio opens, check the Console for any build errors.

Note: If you recieve a Gradle sync error titled, "failed to find ...", you should click on the link below the error message (if avaliable) that says Install missing platform(s) and sync project and allow Android studio to fetch you what is missing.
Download this OpenCV-android-sdk zip file and extract it.

Copy all the files from "OpenCV-android-sdk/sdk/native/3rdparty" to "phimpme-android/app/src/main/3rdparty" (create directory if it doesn't exist)
Copy all the files from "OpenCV-android-sdk/sdk/native/libs" to "phimpme-android/app/src/main/jniLibs" (create directory if it doesn't exist)
Now build your project. If your build fails then try deleting these build directories "phimpme-android/app/.externalNativeBuild" and "phimpme-android/app/build", if they exist and run the build again.
Once all build errors have been resolved, you should be all set to build the app and test it.

To Build the app, go to Build>Make Project (or alternatively press the Make Project icon in the toolbar).

If the app was built succesfully, you can test it by running it on either a real device or an emulated one by going to Run>Run 'app' or presing the Run icon in the toolbar.

<b>License</b>

This project is currently licensed under the GNU General Public License v3. A copy of LICENSE is to be present along with the source code. To obtain the software under a different license, please contact FOSSASIA.
