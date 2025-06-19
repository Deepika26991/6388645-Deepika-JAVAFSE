package CommandPrompt;
//Main.java
public class Main {
 public static void main(String[] args) {
     Light livingRoomLight = new Light();

     // Create commands
     Command lightOn = new LightOnCommand(livingRoomLight);
     Command lightOff = new LightOffCommand(livingRoomLight);

     // Use remote
     RemoteControl remote = new RemoteControl();

     remote.setCommand(lightOn);   // Set ON command
     remote.pressButton();         // Output: Light is ON

     remote.setCommand(lightOff);  // Set OFF command
     remote.pressButton();         // Output: Light is OFF
 }
}
