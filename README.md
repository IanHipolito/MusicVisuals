# Music Visualiser Project
----
# Youtube Video of Our Project
[![YouTube](https://github.com/MK-CIAN/MusicVisuals/blob/master/images/OOP_Pic.jpg?raw=true)](https://youtu.be/flGGAfn6u8M)
----
# Group Members
| Name | Student Number |
|-----------|-----------|
|Cian McKenna | C21755919 |
|Ian Hipolito | C21436494 |
|Josua Flores | C21352183 |

----

# Description of the assignment
In this assignment we have a total of 5 different scenes that use Java Processing.
The song we chose for this assignment is "starryeyed" by Ellie Goulding. We felt this song gave us good oppurtunties to create a narrative within our video and of course gave us many visualization oppurtunites. All of our visualisations respond to the amplitude and frequency of the music, this is doen through the minim library.

----
# Instructions
- Compile and run main.java from ie.tudublin package
- In order of appearance = {Scene1(Cian), Scene2(Ian), Scene3(Cian & Ian), Scene4(Joshua), Scene5(Joshua), , Scene1(Cian)}
----
# How it works
- We created a folder for each team members scene's, these folders are named with our student numbers. 
- We then have a main file which is used to run all of our visualtions this file is called MainVisual, this is an extend of the Visual file.
- The MainVisual file starts the music and calls the needed methods from the visual file, such as getAmplitude.
----
## Cian McKenna
- I created the opening scene of the project, this scene is meant to resemble an stary night sky aong with shooting stars and northern lights to visualise the music, also with moving terrain in the foreground.
- To create this scene I created a randomly generated stars to fill up the sky, this is done through creating an arraylist of different parameters such as StarNum, x, y, StarReact, these parameters would all have random values to look more realistic. The northern lights visulizer is made by using by getting the size of amplitude in the audio player and creating lines that are controlled by the lerped buffer. The terrain is created by creating an array which changes values based on the noise function.
![Cian Scene 1](images/CMCKOOP.jpg)
- The next scene I was involved in was scene 3, I worked on these scene with Ian and we created a visual that mathced the lyrics of the song(Carousels of Color)
-How this was acheieved was by creating 5 different lines who's lenght and thickness is effected by the amplituded of the music, this is meant to represent the rides you would see on a carousel, we then added an outside ring of points which would rotate to give use the overall carousel shape, this is done through a TWO_PI loop and various points with different variables.
![Cian & Ian Scene 3]

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

