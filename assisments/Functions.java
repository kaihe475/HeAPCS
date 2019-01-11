
class Functions {
    static int yearsleft = 1;
    static int gradClass = 2020;

    public static void main(String[] args) {
        int yearstillgrad = calcage(gradClass,yearsleft);
       
    }

    public static int calcage(int gradClass, int yearsleft) {

        return gradClass - yearsleft;
    }

    public static void printMessage(int yearsleft){
    }
    
    
}