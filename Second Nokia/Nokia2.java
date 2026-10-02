import java.util.Scanner;


public class Nokia2{
	

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

int menuChoice = 1;

do{

System.out.print("""
NOKIA MENU
1.Phonebook
2.Messages
3.Chat
4.Call register
5.Tones
6.Settings
7.Call divert
8.Music
9.Games
10.Calculator
11.Reminders
12.Clock
13.Profiles
14.Services
15.SIM services
0.EXIT
	""");


switch(menuChoice){

case 1: 

System.out.print("""
PHONEBOOK
1.Search
2.Service Nos
3.Add name
4.Erase
5.Edit
6.Copy
7.Assign tone
8.Send b'card
9.Options
10.Speed dails
11.Voice tags

	""");

System.out.print("Choose: ");
int phonebook = input.nextInt();

switch(phonebook){

case 1:
System.out.println("Search");
break;

case 2:
System.out.println("Service Nos");
break;

case 3:
System.out.println("Add name");
break;

case 4:
System.out.println("Erase");
break;

case 5:
System.out.println("Edit");
break;

case 6:
System.out.println("Copy");
break;

case 7:
System.out.println("Assign tone");
break;

case 8:
System.out.println("Send b'card");
break;

case 9:
System.out.println("Options");
break;

case 10:
System.out.println("Speed dials");
break; 

case 11:
System.out.println("Voice tags");
break;

}

break;

case 2:
System.out.print("""
MESSAGES
1. Write messages
2. inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number
10. Service command editor


""");

	
	System.out.print("Choose: ");
        int messages = input.nextInt();

switch (messages) {

	 case 1:
         System.out.println("Write messages");
         break;

         case 2:
         System.out.println("Inbox");
         break;

         case 3:
         System.out.println("Outbox");
         break;

         case 4:
         System.out.println("Picture messages");
         break;

         case 5:
         System.out.println("Templates");
         break;

         case 6:
         System.out.println("Smileys");
         break;

         case 7:
         System.out.println("Message settings");
         break;

         case 8:
         System.out.println("Info service");
         break;

         case 9:
         System.out.println("Voice mailbox number");
         break;

         case 10:
         System.out.println("Service command editor");
         break;

         default:
         System.out.println("Invalid choice");
                   
	 }

                    
	break;

case 3:
	System.out.println("CHAT");
                    
	System.out.println("1. Chat");

                    
	System.out.print("Choose: ");
        int chat = input.nextInt();

                    
	switch (chat) {

                        
	case 1:
        System.out.println("Chat");
        break;

        default:
        System.out.println("Invalid choice");
        
	}

        break;
case 4:

                   
System.out.print("""
CALL REGISTER 
1. Missed calls
2. Received calls
3. Dialed numbers
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepaid credit
	""")

                    
	System.out.print("Choose: ");
        int callRegister = input.nextInt();


	 switch (callRegister) {

	 case 1:
         System.out.println("Missed calls");
         break;

         case 2:
         System.out.println("Received calls");
         break;

         case 3:
         System.out.println("Dialed numbers");
         break;

         case 4:
         System.out.println("Erase recent call lists");
         break;

         case 5:
         System.out.println("Show call duration");
         break;

         case 6:
         System.out.println("Show call costs");
         break;

         case 7:
         System.out.println("Call cost settings");
         break;

         case 8:
         System.out.println("Prepaid credit");
         break;

         default:
         System.out.println("Invalid choice");
                    
	 }

         break;

case 5:

        System.out.print"""
TONES
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Message alert tone
5. Keypad tones
6. Warning tones
7. Vibrating alert
8. Screen saver
	""")

        
	System.out.print("Choose: ");
        int tones = input.nextInt();

	
	
	switch (tones) {

	

	case 1:
        System.out.println("Ringing tone");
        break;

        case 2:
        System.out.println("Ringing volume");
        break;

        case 3:
        System.out.println("Incoming call alert");
        break;

        case 4:
        System.out.println("Message alert tone");
        break;

        case 5:
        System.out.println("Keypad tones");
        break;

        case 6:
        System.out.println("Warning tones");
        break;

        case 7:
        System.out.println("Vibrating alert");
        break;

        case 8:
        System.out.println("Screen saver");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

	break;

case 6:

System.out.println("""
SETTINGS
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
	""")

        
	System.out.print("Choose: ");
        int settings = input.nextInt();
switch (settings) {
        
        case 1:

        System.out.print("""
CALL SETTINGS
1. Automatic redial
2. Speed dialing
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer
	""")

        System.out.print("Choose: ");
        int callSettings = input.nextInt();

        switch (callSettings) {

	case 1:
        System.out.println("Automatic redial");
        break;

        case 2:
        System.out.println("Speed dialing");
        break;

        case 3:
        System.out.println("Call waiting options");
        break;

        case 4:
        System.out.println("Own number sending");
        break;

        case 5:
        System.out.println("Phone line in use");
        break;

        case 6:
        System.out.println("Automatic answer");
        break;

        default:
        System.out.println("Invalid choice");
                            
	}

        break;

 case 2:

        System.out.print("""
PHONE SETTINGS
1. Language
2. Cell info display");
3. Welcome note");
4. Network selection");
5. Confirm SIM service actions");
	""")

        System.out.print("Choose: ");
        int phoneSettings = input.nextInt();

        switch (phoneSettings) {

        case 1:
        System.out.println("Language");
        break;

        case 2:
        System.out.println("Cell info display");
        break;

        case 3:
        System.out.println("Welcome note");
        break;

        case 4:
        System.out.println("Network selection");
        break;

        case 5:
        System.out.println("Confirm SIM service actions");
        break;

        default:
        System.out.println("Invalid choice");
                            
	}

        break;
 case 3:

        System.out.println("""
SECURITY SETTINGS
1. PIN code request
2. Call barring service
3. Fixed dialing
4. Closed user group
5. Security level
6. Change access codes
	""")

        System.out.print("Choose: ");
        int security = input.nextInt();

        switch (security) {

        case 1:
        System.out.println("PIN code request");
        break;

        case 2:
        System.out.println("Call barring service");
        break;

        case 3:
        System.out.println("Fixed dialing");
        break;

        case 4:
        System.out.println("Closed user group");
        break;

        case 5:
        System.out.println("Security level");
        break;

        case 6:
        System.out.println("Change access codes");
        break;

        default:
        System.out.println("Invalid choice");
                            
	}

        break;
case 4:
        System.out.println("Restore factory settings");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

        break;
case 7:

        System.out.println("CALL DIVERT ");
        System.out.println("1. Call divert");

        System.out.print("Choose: ");
        int callDivert = input.nextInt();

        switch (callDivert) {

        case 1:
        System.out.println("Call divert");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

        break;
	case 8:

	System.out.print("""
MUSIC
1. Music Player
2. Radio
3. Recorder
4. Track list

	
	System.out.print("Choose: ");
	int music = input.nextInt();

	switch (music){

	case 1:
	System.out.println("1. Music Player");
	break;
	

	case 2:
	System.out.println("2. Radio");
	break;

	case 3:
	System.out.println("3. Recorder");
	break;

	
	case 4:
	System.out.println("4. Track list");
	break;

	default:
	System.out.println("Invalid choice");
	
	}
 	
	case 9:
 	
	System.out.println("GAMES");
	System.out.println("1. Games");
	

	System.out.println("Choose: ");
	int games = input.nextInt();

	switch (games){

	case 1:
  	System.out.println("Games");
	break;

	default:
 	System.out.println("Invalid choice");

	}
	
	break;
case 10:
	
	System.out.println("CALCULATOR");
	System.out.print("1. Calculator");

	System.out.println("Choose: ");
	int calculator = input.nextInt();

	switch (calculator){
	

	case 1:
	
	System.out.println("Calculator");
        break;

        
	default:
        System.out.println("Invalid choice");
                    
	}

        break;	

	case 11:

        System.out.print ("REMINDERS ");
        System.out.println("1. Reminders");

        System.out.print("Choose: ");
        int reminders = input.nextInt();

        switch (reminders) {

        case 1:
        System.out.println("Reminders");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

        break;
	
	 case 12:

         System.out.println("""
CLOCK
1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
		""")

         System.out.print("Choose: ");
         int clock = input.nextInt();
	

	switch (clock) {

        case 1:
        System.out.println("Alarm clock");
        break;

        case 2:
        System.out.println("Clock settings");
        break;

        case 3:
        System.out.println("Date setting");
        break;

        case 4:
        System.out.println("Stopwatch");
        break;

        case 5:
        System.out.println("Countdown timer");
        break;

        case 6:
        System.out.println("Auto update of date and time");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

        break;


	case 13:

        System.out.println("PROFILES");
        System.out.println("1. Profiles");

        System.out.print("Choose: ");
        int profiles = input.nextInt();

        switch (profiles) {

        case 1:
        System.out.println("Profiles");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

        break;




case 14:

        System.out.println("SERVICES");
        System.out.println("1. Services");

        System.out.print("Choose: ");
        int services = input.nextInt();

        switch (services) {

        case 1:
        System.out.println("Services");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

        break;
case 15:

        System.out.println("SIM SERVICES");
        System.out.println("1. SIM services");

        System.out.print("Choose: ");
        int simServices = input.nextInt();

        switch (simServices) {

        case 1:
        System.out.println("SIM services");
        break;

        default:
        System.out.println("Invalid choice");
                    
	}

        break;
	
	case 0:
        System.out.println("Goodbye!");
        break;

        default:
        System.out.println("Invalid choice. Try again.");
            
}

} while (menuChoice != 0);



}
}
}