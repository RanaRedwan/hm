public class Car {
    public Car() {
    }
    public static void main(String[] args) {
        classCar obj=new classCar();
        obj.carname="volvo";
        obj.carcouler="white";
        System.out.println(obj.carcouler);
        System.out.println(obj.carname);

        classCar obj2=new classCar();
        obj2.carname="lambergene";
        obj2.carcouler="red";
        obj2.ver="2024";
        System.out.println(obj2.carcouler);
        System.out.println(obj2.carname);
        System.out.println(obj2.ver);



    }
}
