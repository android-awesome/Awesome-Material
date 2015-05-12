#Android Awesome Material

A library for Android that makes it super easy for developers to incorporate material design and bootstrap buttons with icons into their apps, or simple icon themed TextViews. Includes three separate font sets to chose from to for the icons; Font Awesome, Material Design Iconic Font, and Pixeden Stroke Icon Font Set. Also allows to chose between bootstrap or material design colour themes.

## Installation

#### 1. Gradle

Simply add the following line to your module dependencies:
```
compile 'cyd.awesome.android:awesome-material:1.0.0'
```

Sometimes you need to restart Android Studio as per this [StackOverflow post](http://stackoverflow.com/questions/28079658/namespace-autofill-for-custom-attributes) to fix any autocomplete issues.

#### 2. Add Module

Alternatively, you can download the entire source code and extract all the source files once downloaded. To add your library into an Android Studio project open the module settings (right click on the module name) - and add the AwesomeMaterial folder.

## Usage

You will **need** to include the following in to any XML layouts that are going to be using AwesomeButtons or AwesomeText:

```
xmlns:awesome="http://schemas.android.com/apk/res-auto"
```

## Awesome Buttons

![Awesome Buttons](/screenshots/awesome_buttons.png?raw=true)

```xml
<cyd.awesome.material.AwesomeButton
    android:id="@+id/btnBootstrapPrimary"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Primary"
    android:layout_margin="10dp"
    android:padding="10dp"

    awesome:awesome_type="bootstrap_primary"
    awesome:awesome_rounded_corners="true"

    awesome:awesome_icon_right="FA_HOME"
    awesome:awesome_icon_left="FA_HOME"
    awesome:awesome_icon="FA_HOME"
    awesome:awesome_font="font_awesome"

    />
```

* `awesome:awesome_type` = enum = specifies the background color (and text color) for the button, options start with material_ or bootstrap_
* `awesome:awesome_rounded_corners` = bool = true specifies a rounded button background
* `awesome:awesome_icon_right` = enum = specifies which icon to go **right** of text, options start with FA_ for font awesome, MD_ for material design, and PE_ for pixeden.
* `awesome:awesome_icon_left` = enum = specifies which icon to go **left** of text, options start with FA_ for font awesome, MD_ for material design, and PE_ for pixeden.
* `awesome:awesome_icon` = enum = specifies which icon to go in the middle of the button, options start with FA_ for font awesome, MD_ for material design, and PE_ for pixeden. Note, you **cannot** combine this with `android:text`.
* `awesome:awesome_font` = enum = specifies which font to use, must be either font_awesome, material_design, or pixeden_stroke.

## Awesome TextViews

![Awesome Text](/screenshots/awesome_text.png?raw=true)


```xml
<cyd.awesome.material.AwesomeText
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="60sp"
    android:textColor="@color/md_teal_500"
    android:layout_marginRight="10dp"

    awesome:awesome_font="material_design"
    awesome:awesome_icon="MD_HOME"/>
```

* `awesome:awesome_icon` = enum = specifies which icon to use, options start with FA_ for font awesome, MD_ for material design, and PE_ for pixeden. Note, you **cannot** combine this with * `android:text`.
* `awesome:awesome_font` = enum = specifies which font to use, must be either font_awesome, material_design, or pixeden_stroke.

## Bonus Resources


* drawable files = so you can make regular buttons into material or bootstrap themed buttons
* values
  * colors = all the material design and bootstrap theme colours
  * rounded corners = change the value specified in this folder (for people who add the module, not via gradle) to change the roundedness of the button corners
* assets = all the fonts in .ttf format

### References

* Font Awesome - http://fortawesome.github.io/Font-Awesome/
* Material Design Iconic Font - http://zavoloklom.github.io/material-design-iconic-font/
* Pixeden - http://www.pixeden.com/icon-fonts/stroke-7-icon-font-set
* Material Design Colors - https://gist.github.com/daniellevass/b0b8cfa773488e138037
