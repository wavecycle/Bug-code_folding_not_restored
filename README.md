# Bug-code_folding_not_restored
Demonstration of how Android Studio IDE does not autosave and restore basic code folding on load up.
NB: The behaviour described below works perfectly in IntelliJ IDEA, using the same MainActivity.kt file.

Steps to replicate the issue:

1. View code in MainActivity, then using icon (-) or shortcut (control-minus), fold code on the following lines:

  a. 30 ("liveData1.observe...")

  b. 34 ("liveData2.observe...")

  c. 39 ("liveData3.observe...")

  d. 45 ("fun printToLog()...")

2. Close IDE and restart. View MainActivity code and all the previously folded lines have expanded themselves.

This is the problem: the IDE should remember where I folded blocks and restart with the same areas folded, like IntelliJ IDEA does.

NB: I've tried selecting/deselecting all of the default code folding options in the settings and this problem still persists.

Thank you :)
