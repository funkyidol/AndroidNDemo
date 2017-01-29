# Android Nougat Features

*(Additional notes apart from the [presentation](https://speakerdeck.com/funkyidol/nougatty-android))*

### Multi-Window Mode

 - Target API should be 24 or higher
 - Small Devices: Apps open sid-by-side

   Android TV: Apps can be used in picture-in-picture mode

   Other Large devices: Apps open in Free-form mode (hint- Chrome OS)
 - No change in Activity Lifecycle
 - Activities are paused when they loose, event if they are visible.
 - Default value for `android:resizableActivity` is true. If set to false for a perticular
 activity, that activity will not go into split window mode and a toast message will be shown by
 the system. If this tag is set to false in `<application>`, then all activities in the
 application will not go into split screen mode.
 - If target API is 23 or lower and a multi window session is started, then the app is
  forcefully resized with system toast message that the app may behave unexpectedly.
 - Full screen apps cannot hide status bar in multi-window mode.
 - Change notifications are provided for multi-window mode in `onMultiWindowModechanged(boolean
  isInMultiWindow)`. System calls this callback every time activity goes in or out of multi-window
   mode.
 - To launch a new activity adjacent to the current one, use the tags `Intent
   .FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_NEW_TASK`. New task flag is important
   otherwise launch adjacent tag won't work as an activity started ina new task can be show
   adjacent to the current one. Also this flag is ignored if the current activity is not in
   multi-window mode.
