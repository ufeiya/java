package program1;
import java.util.Scanner;
public class Time2 {
	private int hour; // 0 - 23
	 private int minute; // 0 - 59
	 private int second; // 0 - 59
	 


	 public Time2()
	 {
	 this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
	 } // end Time2 no-argument constructor

	 // Time2 constructor: hour supplied, minute and second defaulted to 0
	 public Time2( int h )
	 {
	 this( h, 0, 0 ); // invoke Time2 constructor with three arguments
	 } // end Time2 one-argument constructor

	 // Time2 constructor: hour and minute supplied, second defaulted to 0
	 public Time2( int h, int m )
	 {
	 this( h, m, 0 ); // invoke Time2 constructor with three arguments
	 } // end Time2 two-argument constructor 

	 // Time2 constructor: hour, minute and second supplied
	 public Time2( int h, int m, int s )
	 {
	 setTime( h, m, s ); // invoke setTime to validate time
	 } // end Time2 three-argument constructor 

	 // Time2 constructor: another Time2 object supplied
	 public Time2( Time2 time )
	 {
	 // invoke Time2 constructor with three arguments
	 this( time.getHour(), time.getMinute(), time.getSecond() );
	 } // end Time2 constructor with Time2 argument

	 // Set Methods
	 // set a new time value using universal time; perform
	 // validity checks on data; set invalid values to zero
	 public void setTime( int h, int m, int s )
	 {
	 setHour( h ); // set the hour
	 setMinute( m ); // set the minute
	 setSecond( s ); // set the second
	 } // end method setTime

	 // validate and set hour 
	 public void setHour( int h )
	 {
	 hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
	 } // end method setHour

	 // validate and set minute
	 public void setMinute( int m )
	 {
	 minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
	 } // end method setMinute
	 
	// validate and set second
	 public void setSecond( int s )
	 {
	 second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
	 } // end method setSecond

	 // Get Methods
	 // get hour value
	 public int getHour()
	 {
	 return hour; 
	 } // end method getHour

	 // get minute value
	 public int getMinute()
	 {
	 return minute; 
	 } // end method getMinute

	 // get second value
	 public int getSecond()
	 {
	 return second; 
	 } // end method getSecond

	 // Tick the time by one second
	 public void tick()
	 {
	 setSecond( second + 1 );

	 if ( second == 0 )
	 incrementMinute();
	 } // end method tick

	 // Increment the minute
	 public void incrementMinute()
	 {
	 setMinute( minute + 1 );

	 if ( minute == 0 )
	 incrementHour();
	 } // end method incrementMinute

	 // Increment the hour
	 public void incrementHour()
	 {
	 setHour( hour + 1 );
	 // end method incrementHour
	 } 
	 // convert to String in universal-time format (HH:MM:SS)
	 public String toUniversalString()
	 {
		 return String.format(
				 "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner( System.in );

		 Time2 time = new Time2();

		 System.out.println( "Enter the time" );
		 System.out.print( "Hours: " );
		 time.setHour( input.nextInt() );
		 System.out.print( "Minutes: " );
		 time.setMinute( input.nextInt() );
		 System.out.print( "Seconds: " );
		 time.setSecond( input.nextInt() );
		 
		 int choice = input.nextInt();


		 
		 while ( choice != 5 )
		 {
		 switch ( choice )
		 {
		 case 1: // add 1 second
		 time.tick();
		 break;

		 case 2: // add 1 minute
		 time.incrementMinute();
		 break;

		 case 3: // and 1 hour
		 time.incrementHour();
		 break;

		 case 4: // add arbitrary seconds
		 System.out.print( "Enter seconds to tick: " );
		 int ticks = input.nextInt(); 
		 
		 for ( int i = 0; i < ticks; i++ )
			 time.tick();

			 break;
			 } // end switch

			 System.out.printf( "Hour: %d Minute: %d Second: %d\n",
			 time.getHour(), time.getMinute(), time.getSecond() );
			 System.out.printf( "Universal time: %s Standard time: %s\n",
			 time.toUniversalString(), time.toString() );


			 choice = getMenuChoice();
			 } // end while
			 } // end main

			 // prints a menu and returns a value corresponding to the menu choice
			 private static int getMenuChoice()
			 {
			 Scanner input = new Scanner( System.in );

			 System.out.println( "1. Add 1 second" );
			 System.out.println( "2. Add 1 minute" );
			 System.out.println( "3. Add 1 hour" );
			 System.out.println( "4. Add seconds" );
			 System.out.println( "5. Exit" );
			 System.out.print( "Choice: " );

			 return input.nextInt();
			 } // end method getMenuChoice
			
	}


