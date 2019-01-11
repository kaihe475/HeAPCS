class Cruise {

    static Boolean cruiseControlSet = false;

    static int speed = 35;

    static final int MAX_SPEED = 65;

    static int warningSpeed = 25;

    public static void main(String[] args) {
        toggleCruiseControl();
        incrementSpeed();
        toggleCruiseControl();
    }

    public static void toggleCruiseControl() {

        cruiseControlSet = !cruiseControlSet;
         if( cruiseControlSet ) {

            System.out.println("Cruise Control inabled.");
             }
        else {

            System.out.println( "Cruise Control Disabled");   
        }
    }

    public static void incrementSpeed() {

        if( cruiseControlSet && ( speed < 30 )) {
            
         System.out.println(" Decelerate 5mph");
            
        }

        System.out.println("Accelerated 5mph");
        reportSpeed();

        if (exceedsWarningThreshold()){;

            alert( true );
        }
    }

    public static void decrementSpeed() {
        if(cruiseControlSet && (speed > 0 )) {

            speed -= 5 ;
        }

        System.out.println( " Decelerated 5 mph" );
        reportSpeed();

        if (exceedsWarningThreshold()){;
            System.out.println( " Decelerat by 5 mph" ); ;
        }
    }

    public static void reportSpeed () {
        System.out.println("Current speed is:\t" + speed + "mph");
    }

    public static void alert( Boolean IsDecelerating ) {

        if(IsDecelerating) {
            System.out.println("Warning, current speed still exceeds warning threshold.");
        }
        else {
            System.out.println("Warning, current speed exceeds warning threshold.");
        }
        System.out.println("Your speed:\t\t" + speed + "mph/" + warningSpeed + "mph");
    }

    public static Boolean exceedsWarningThreshold(){;

    return speed > warningSpeed;
    }
}