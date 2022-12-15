public class Main {
    public static void main(String[] args) {

        System.out.println("Task 3.1");

        for (int i = 1; i <= 10; i++) {


            System.out.println(i);
        }
        System.out.println("Task 3.2");


        for (int t = 10; t >= 1; t--) {


            System.out.println(t);
        }


        System.out.println("Task 3.3");


        for (int j = 0; j < 17; j = j + 2) {

            System.out.println(j);
        }


        System.out.println("Task 3.4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }


        System.out.println("Task 3.5");


        for (int i = 1906; i <= 2096; i = i + 4) {


            System.out.println(i + " год является високосным");
        }


        System.out.println("Task 3.6");


        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Task 3.7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }


        System.out.println("Task 3.8");

        int t = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += t;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }


        System.out.println("Task 3.9");

        int sal = 29000;//salary
        double summa =0;
        double proc= 0.01;
        for (int i = 1; i <= 12; i++) {
           double summar =(summa+sal)*(1+ proc);

                System.out.println("Месяц " + i + " сумма накоплений равна " + summar + " рублей");
            }




        System.out.println("Task 3.10");
        int a = 2;
        int b = 2;

        for (int i = 1; i <= 10; i++) {
        int it= 2*i;
            System.out.println(a+"*"+i+"="+it);
        }


        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }


