# BriscolaScoreKeeper
exercise for UDACITY Android Basic Nano Degree<br>
# game rules
Briscola is a Mediterranean trick-taking card game played with a standard Italian 40-card deck. <br>
For model of this app I used Sicilian type. <br>
For the purpose of calculating total score the cards have the following point value:<br>

* Ace: 11 points
* Three: 10 points
* King: 4 points
* Horse: 3 points
* Woman: 2 points <br>
The remaining cards have no point value

As you can see, the total value of cards in the deck adds up to 120 points.
<br> Therefore, the player or team which scores 61 points or more wins the game.<br>
# ADVICE: I'm not an expert devoleper so use this code carefully.

### User interface:

I choose this user interface: 
- two columns with name, score e five buttons point for each team
- a central reset bottom button.


### Used views:
- an external ScrollView implementing landscape mode and visualization for little screen device
- inside that a RelativeLayout for positioning the columns layout and reset Button
- an horizontal LinearLayout with two columns inside separated by a single line View 
  - each column is a vertical LinearLayout with 2 TextView and 5 Button 



### Testing:
I tested compatibility with Nexus 5 5.0 1080x1920 xxhdpi

Used content description on text and button views for screen readers and other accessibility tools


# term of use
Copyright (C) 2017 The Android Open Source Project<br>
Licensed under the Apache License, Version 2.0 (the "License");<br>
you may not use this file except in compliance with the License.<br>
You may obtain a copy of the License at<br>
http://www.apache.org/licenses/LICENSE-2.0 <br>
Unless required by applicable law or agreed to in writing, software <br>
distributed under the License is distributed on an <br>
"AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>
 See the License for the specific language governing permissions and limitations under the License.<br>
