# Toaster - A beautiful Toast Library for Android
[![API](https://img.shields.io/badge/Platform-Android-orange.svg?style=flat)](https://www.android.com/)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21) 
[![](https://jitpack.io/v/saadiftkhar/toaster.svg)](https://jitpack.io/#saadiftkhar/toaster)
[![API](https://camo.githubusercontent.com/f4c9ff617324d5d9ee025a4122d0ae983a5efbade9f4475ccada6084c842159b/68747470733a2f2f696d672e736869656c64732e696f2f747769747465722f666f6c6c6f772f73616e6a61795f7370696b65793f6c6162656c3d54776974746572267374796c653d736f6369616c)](https://twitter.com/saadiftikhar27)

# Demo App
![image info](https://github.com/saadiftkhar/library-demo-templates/blob/main/Toaster/demo.gif)

# How to configure dependency
To get a Git project into your build:
## Gradle
- build.gradle (Project level) or settings.gradle

     ```
     allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```

- build.gradle (Module: app)
    ```
    dependencies {
        implementation 'com.github.saadiftkhar:toaster:Tag'
	 }
  ```
  
## Usage
  
# Sample Code for - Toaster
### Pass the paramater by using [Named Arguments](https://www.programiz.com/kotlin-programming/default-named-arguments) specially for optional paramters
- ### Success Toast
  
     ```
      Toaster.success(
          context = this,
          text = "this is success toast",
          font = R.font.basier_circle      // optional
       )
   ```
  
  
- ### Error Toast
   
  ```
  Toaster.error(
      context = this,
      text = "this is error toast",
      font = R.font.basier_circle      // optional
   )
   ```
   
   
- ### Delete Toast
  
  ```
  Toaster.delete(
      context = this,
      text = "this is delete toast",
      font = R.font.basier_circle      // optional
   )
   ```
   
   
- ### Warning Toast
  
  ```
  Toaster.warning(
      context = this,
      text = "this is warning toast",
      font = R.font.basier_circle      // optional
   )
   ```
   
   
- ### Info Toast
  
  ```
  Toaster.info(
      context = this,
      text = "this is info toast",
      font = R.font.basier_circle      // optional
   )
   ```
   
# Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
