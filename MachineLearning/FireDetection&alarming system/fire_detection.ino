#include <LiquidCrystal.h>
const int rs = 12, en = 11, d4 = 5, d5 = 4, d6 = 3, d7 = 2;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);


int LED=13;

int d=0;

int ledState = LOW; 
 
unsigned long previousMillis = 0; 
const long interval = 200;  
unsigned long previousMillis2 = 0; 
const long interval2 = 10000;  

void setup() 
{
  lcd.begin(16, 2);
  
  lcd.print("Camera off....");
  pinMode(LED, OUTPUT);
  
  Serial.begin(9600);
  
  
}

void loop()
 {  
    if (Serial.available()) {
     d = Serial.read();
     
     if(d == 'p' )
      { 
        lcd.clear();
        lcd.print(" Fire Detected ");
   
        Blink();
      
    
        delay(800);
      }

   if(d == 's' )
      {  
        lcd.clear();
        lcd.print("Capturing Video...");
        digitalWrite(LED, LOW); 
        unsigned long currentMillis2 = millis();
       if ((unsigned long)(currentMillis2 - previousMillis2) >= interval2)
          {
            previousMillis2 = currentMillis2;
           }
      
        delay(5);
      }
 

 }

 }

void Blink()
 {
   unsigned long currentMillis = millis();
   if (currentMillis - previousMillis >= interval)
     {
      previousMillis = currentMillis;
        if (ledState == LOW)
        {
          ledState = HIGH;
         } else
         {
          ledState = LOW;
          }
       digitalWrite(LED, ledState);

      }
  }
