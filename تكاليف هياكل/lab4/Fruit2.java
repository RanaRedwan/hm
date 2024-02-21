public class Fruit2 {
//in class main creat 2 objects of class fruit
//creat the first one with default  constructor
//and add the data by using set and get
//then creat the second object with constructor
//that receives allattributs data lastly print the
//two objects using "displayDetails" method or"toSting" method
        public static void main (String[]args){
            Fruit obj = new Fruit("Apple","Red",123,44,564);
            Fruit obj2 = new Fruit("banan","yallow",890,98,98);
        }

    public Fruit2(String name, String color,int id,int size,int farmName)
    {
        System.out.println(toString());
    }

}