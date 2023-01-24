public class Main {
    public static void main(String[] args) {
        System.out.println(lombard(15, -5));
        System.out.println(lombard(20, 10));
        System.out.println(lombard(30, 4));
        System.out.println(lombard(5, -10));
        System.out.println(lombard(46, -5));

    }
    public static String lombard(int age,int temp) {
        if (age >= 20 && age <= 45 && temp > -20 && temp < 30) {
            return  "Можно идти гулять";
        }
        else if (age<20 && temp>0 && temp<28){
            return  "Можно идти гулять";

        }
        else if (age>45 && temp>-10 && temp<25){
            return  "Можно идти гулять";

        }
        else {
            return "Оставайтесь дома";
        }
    }
}