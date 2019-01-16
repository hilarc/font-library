# Fonts:
    NUNITO_EXTRALIGHT
    NUNITO_EXTRALIGHTITALIC 
    NUNITO_LIGHT
    NUNITO_LIGHTITALIC
    NUNITO_REGULAR 
    NUNITO_ITALIC 
    NUNITO_SEMIBOLD 
    NUNITO_SEMIBOLDITALIC
    NUNITO_BOLD
    NUNITO_BOLDITALIC
    NUNITO_EXTRABOLD
    NUNITO_EXTRABOLDITALIC 
    NUNITO_BLACK
    NUNITO_BLACKITALIC
  
# Gradle Depency(Project Level)
    allprojects {  
        repositories{
            google()
            jcenter()
            // Jitpack
            maven { url 'https://jitpack.io' }
        }
    }
    
# Gradle Depency(App Level)
    dependencies {
        implementation 'com.github.hilarc:font-library:1.0.8'
    }
    
# Code Example
    TextView headerText = findViewById(R.id.headerText);
    headerText.setTypeface(Fonts.getFont(getApplicationContext(), Fonts.NUNITO_SEMIBOLD));
