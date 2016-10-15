# Listen
Listen... is a simple World of Warcraft addon created to display a random fact on call. I created it because all the time I'll say "Listen..." and everyone will shut up and wait for me to talk, but I never do. I figure I can macro it and enjoy the future.

## Installation
Simply create a folder in your WoW/interface/addons directory called "Listen". Download the .zip containing the code and extract it into the folder you created. 

## In-Game Usage
Simply type "/listenhere" and receive your random fact.

## Java Usage
I used Java to parse in a text file of all the facts. I could have done this inside Lua, but I like java's simple line-by-line reading a lot better. Just list everything you want line by line in the  "FactsList.txt" file and run the Listen_ParseJava project. it will format it into  applicable strings for Lua usage.

## Lua Usage
WoW addons are script-based and require Lua.

## Known Bugs
### Quotation Interrupt
lines that contain inner quotations cause errors as they interrupt the string, I will fix this in the next version of the java file. For now simply preface each inner quotation with the \" character.
