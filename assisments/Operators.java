class Operators {
    public static void main(String args[]) {

    //String name = "Merrell";
    //System.out.println(name);

        String FirstName = "Kai" ; 
        String LastName = "He" ;
        String FullName = FirstName + " " + LastName ;

        System.out.println("FirstName");
        System.out.println(FirstName);
        System.out.println("LastName");
        System.out.println(LastName);
        System.out.println("FullName");
        System.out.println(FullName); 

        int currentYear = 2018;
        int yearsUntilGraduation = 2;
        int myGradYear = currentYear + yearsUntilGraduation;

        System.out.println("myGradYear");
        System.out.println(myGradYear);

        int currentAge = 17;
        int nextAge = currentAge + 1;
        System.out.println("currentAge");
        System.out.println(currentAge);
        System.out.println("nextAge");
        System.out.println(nextAge);



        int halfCurrentAge = currentAge / 2;
        int halfNextAge = nextAge / 2;
        System.out.println("halfCurrentAge");
        System.out.println(halfCurrentAge);
        System.out.println("halfNextAge");
        System.out.println(halfNextAge);

        int moduloCurrentAge = currentAge / 2;
        int moduloNextAge = nextAge / 2;
        System.out.println(moduloCurrentAge);
        System.out.println(moduloNextAge);
        
        double bitcoinsOwned = 1;
        double bcsCoinsOwned = 25;

        double bitcoinValue = 1;
        double bcsCoinValue = 1;

        double bitcoinsWorth = bitcoinsOwned * bitcoinValue;
        double bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue;
        System.out.println("My current bitcoins are worth $" + bitcoinsWorth);
        System.out.println("My current BCSCoins are worth $" + bcsCoinsWorth);

        double reward = 500;
        double amtToRedeem = 25;
        bcsCoinValue = reward / amtToRedeem; //Reassign bcsCoinValue to the potential
        System.out.println("One BCSCoin might be worth $" + bcsCoinValue + " later. If so...");

        bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue; //This is the exact same calculation we used earlier, but we updated bcsCoinValue, so let's calculate it again.
        System.out.println("My current BCSCoins could eventually be worth $" + bcsCoinsWorth);   

        Boolean haveJob = false;
        Boolean lookingForWork = true;
        Boolean canProgram = true;
        int currentSavings = 50;

        //There are some print statements below. Can you guess which ones will print?
        if(!haveJob) {
        if(lookingForWork && canProgram) {
            System.out.println("Your chances as getting a job go up!");
        }
        else {
            System.out.println("You might need to gain more skills before you can get a job.");
        }
        }
        if(currentSavings < 500) {
        System.out.println("You should be saving more money.");
        }
        else {
        System.out.println("Do you need to save more money, still?");
        }                      

        }
}
