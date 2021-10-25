public class Lab2 {
    public static int x = 3;
    public static int z = 3;

    public static void main(String[] args){
        double result = sum(x,z);
        double Substractresult = substract(x,z);
        double multiplicationResult = multiplication(x,z);
        double divisionResult= division(x,z);
        System.out.println(result);
        System.out.println(Substractresult);
        System.out.println(multiplicationResult);
        System.out.println(divisionResult);
    }
    public static double sum(int first, int second){
        double result = first + second;
        return result;
    }
    public static int substract(int first, int second){
        double Substractresult = first - second;
        return (int) Substractresult;
    }
    public static int multiplication(int first, int second){
        double multiplication = first * second;
        return (int) multiplication;
    };
    public static float division(float first, float second){
        double divisionResult = first/second;
        return (float) divisionResult;
    }

}
