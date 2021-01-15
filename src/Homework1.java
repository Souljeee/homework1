public class Homework1 {
    public static void main(String[] args) {
        byte a = 13;
        int b = 1043;
        long c = 256849L;
        float d = 13.32f;
        double e = -134.657438;
        char f = 'd';
        boolean h = true;
        String k = "GeekBrains";
        System.out.println(calc(1.4f,2.56f,7.24f,1.39f));
        System.out.println(verifySum(13,4));
        verifySgn(-12);
        verifySgnSecond(56);
        helloName("Роман");
        verifyYear(2028);
    }

    public static double calc(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean verifySum(int a, int b){
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void verifySgn(int a){
        if(a >= 0){
            System.out.println("Положительное");
        }else{
            System.out.println("Отрицательное");
        }
    }

    public static void verifySgnSecond(int a){
        System.out.println(a < 0);
    }

    public static void helloName(String name){
        System.out.println("Привет, "+name+"!");
    }

    public static void verifyYear(int a){
        if (a % 4 == 0){
            if(a % 100 == 0){
                if(a % 400 == 0){
                    System.out.println("Високосный");
                }else {
                    System.out.println("Не високосный");
                }
            }else {
                System.out.println("Високосный");
            }
        }else{
            System.out.println("Не високосный");
        }
    }
}
