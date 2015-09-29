#include <DHT11.h>
#include <SoftwareSerial.h> 
#include <DS1302.h>
DS1302 rtc(11, 12, 13);
  int relay = 10;
  char BTValue;
  int THpin = 4;
  SoftwareSerial BTSerial(0, 1);
  boolean toggle = true;
  DHT11 dht11(THpin);
  float temp, humi;
  int speakerpin = 8;
  String alarm;
  String times;
  void setup() {
    pinMode(relay, OUTPUT);
    BTSerial.begin(9600);
    Serial.begin(9600);
    rtc.halt(false);
  rtc.writeProtect(false);
  
  rtc.setDOW(THURSDAY);        // Set Day-of-Week to FRIDAY
  rtc.setTime(0, 21, 0);     // Set the time to 12:00:00 (24hr format)
  rtc.setDate(24, 9, 2015);



  
}
  void loop() {
    if (BTSerial.available()) {//1
        BTValue = BTSerial.read();
        Serial.println(BTValue);
        if(BTSerial.find("o")){//2
            digitalWrite(relay, toggle);
            toggle = !toggle;
        }//2
    }//1
    int err;
    if ((err = dht11.read(humi, temp)) == 0) {//3
        //Serial.print("temperature:");
        Serial.println((int) temp);
        //Serial.print(" humidity:");
        Serial.print((int) humi);
        Serial.println();
    
    delay(100);
    }//3

    if (temp >= 60) {
        Serial.println("warning-t");
    }
    if (temp >= 80) {
        tone(speakerpin, 2000, 10000);
        Serial.println("warning-wt");
    }
    if (humi >= 80) {
        tone(speakerpin, 2000, 10000);
        Serial.println("warning-h");
    }
    if (humi >= 90) {
        tone(speakerpin, 2000, 10000);
        Serial.println("warning-ht");
    }
//알람부분
      times=rtc.getTimeStr();
      alarm="0:27:0";
      delay(1000);
      Serial.println(times);
      if(times==alarm)
      digitalWrite(relay, LOW);


    
}//end
