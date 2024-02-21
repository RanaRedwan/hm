import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
//Q1
        String carName = "morsades";
        
//Q2
        int f, b, n = 19;
//Q3
        int a = 10;
        float B = 8.99f;
        char c = 'A';
        boolean d = false;
        String e = "hello world";
//Q4
        int i = 5;
        double myDouble = (i);
        System.out.println(myDouble);
//Q5
        int x = 9;
        x = x * 5;
        System.out.println(x);
//Q6
        int num = 6;
        System.out.println(num + 6);
//Q7
        int m = 13, y = 6;
        if (m > y) {
            System.out.println(m);
        } else {
            System.out.println(y);
        }
//Q8
        String firseString = "jood ";
        String secondString = "Abood";
        System.out.println(firseString.length());
        System.out.println(firseString.charAt(4));
        System.out.println(firseString.concat(secondString));
        System.out.println(firseString.toUpperCase());
//Q9
        String streetName="al adl";
        String cityName="sana'a";
        String address=streetName + cityName;
        System.out.println(address);
        
//Q10
        int o=9,p=10;
        if (o>p){
            System.out.println("Hello world");
        }
        else {
            System.out.println("New to java");
        }
//Q11
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
//Q12
        int h=0;
        while (h<6){
            System.out.println(h);
            h++;
        }
        
//Q13
        for (int g= 0; g<5 ;g++) {
            System.out.println("yes");
        }
//Q14
        for (int t=1;t<=10;t++){
            if (t==3){
                System.out.println(",");
            }
            System.out.println(t);
        }
        

//Q15
        String[] cities={"Adn","sana'a","chicago"};
        System.out.println(cities[0]);

//Q16
        for(String cityname:cities);
        System.out.println(cityName);

//Q17
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your id:");
        int id= s.nextInt();
        System.out.println("Enter your name:");
        String name=s.next();
        System.out.println("Enter your:");
        int your= s.nextInt();
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("your:"+your);
    }
}