public class WaterMelon {

    public static void main(String[] args) {
        WaterMelon.dividedWaterMelon(7);
    }


    public static void dividedWaterMelon(int number) {

        int halfA = 0;
        int halfB = 0;

        if(number % 2 != 0) {
            System.out.println("It's not possible divide for this number");
        }

        if(number % 2 == 0){
            int dividedresult = number / 2;
            halfA = dividedresult;
            halfB = dividedresult;
        }

        if(halfA % 2 != 0){
            halfA++;
            halfB--;
        }

        int sum = halfA + halfB;

        if(sum == number) {
            System.out.println("it's divided");
        }
    }
}
