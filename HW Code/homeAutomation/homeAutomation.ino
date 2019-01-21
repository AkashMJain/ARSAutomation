int ledPin1 = 13;
int ledPin2 = 12;
int ledPin3 = 11;
int ledPin4 = 10;
int ledPin5 = 9;

String readString;

void setup()
{
  Serial.begin(9600);
  pinMode(ledPin1, OUTPUT);
  pinMode(ledPin2, OUTPUT);
  pinMode(ledPin3, OUTPUT);  
  pinMode(ledPin4, OUTPUT); 
  pinMode(ledPin5, OUTPUT); 
}
void loop()
{
  while (Serial.available())
  {
    delay(3);
    char c = Serial.read();
    readString += c;
  }
  if(readString.length() >0)
  {
    Serial.println(readString);
    if(readString == "on1")
    {
      digitalWrite(ledPin1, HIGH);
    }
    if(readString == "off1")
    {
      digitalWrite(ledPin1, LOW);
    } 
    
    if(readString == "on2")
    {
      digitalWrite(ledPin2, HIGH);
    }
    if(readString == "off2")
    {
      digitalWrite(ledPin2, LOW);
    } 
    
    if(readString == "on3")
    {
      digitalWrite(ledPin3, HIGH);
    }
    if(readString == "off3")
    {
      digitalWrite(ledPin3, LOW);
    } 
    
    if(readString == "on4")
    {
      digitalWrite(ledPin4, HIGH);
    }
    if(readString == "off4")
    {
      digitalWrite(ledPin4, LOW);
    } 
    
    if(readString == "on5")
    {
      digitalWrite(ledPin5, HIGH);
    }
    if(readString == "off5")
    {
      digitalWrite(ledPin5, LOW);
    } 
    readString="";
  }
}


