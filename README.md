# stream-quality-index
From Fall 2015 Hack Princeton, a very simple Android app that calculates the water quality of a stream. The user inputs
the number of each kind of bug and the app calculates if the water is safe or not safe to use as a drinking source.

In collaboration with Mayee Chen and Ryan Lee (whose GitHub accounts I of yet do not know).
- I wrote most of the XML.
- Mayee wrote most of the Java.
- Ryan looked up syntax we were not sure about and helped combine Mayee's and my files.

####Future Goals (maybe for the next Hackathon?)

1. Clean up the code. 

  1. We did not know much about version control at the time so we were each working on our own computers and doing good
  old-fashioned copy and paste. This caused some problems because we used different company names when creating the 
  Android Studio projects. In the end, we just pasted the final content within the corresponding file on Mayee's laptop.
  
2. Check the calculations.

3. Find better pictures and make them responsive to screen size.

  1. In addition, don't be lazy and make nice captions.

4. Typed input instead of just + and - buttons, for when there are a bajillion bugs.

  1. I learned how to do this, but I just did not think about it at the time.

5. (Pretty lofty goal that I currently do not have the ability to accomplish) Uses your location to find nearby potential
drinking water sources. Have some sort of database holding the stream quality indices that the user can access.

  1. Perhaps each time user calculates index, check location, and asks if want to add that index to the database.
  
  2. Would then need some way to measure trustworthiness of information (ratings? certification?)
