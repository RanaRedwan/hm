public class Pet {
    private  int Id;
    private String Name;
    private String Type ;
    private int Age ;
    private int Allpetsnumber;
    private int Price;
    private int cost;

    public Pet(int id, String name, String type, int age, int allpetsnumber, int price, int cost) {
        Id = id;
        Name = name;
        Type = type;
        Age = age;
        Allpetsnumber = allpetsnumber;
        Price = price;
        cost = cost;
    }

    public void purchasePet(int idPet)
    {
        Id+= idPet;
    }
    public void sellPet(int numPet)
    {
        Allpetsnumber -= numPet;
    }

    public int calculateProfit()
    {
        return Id * (Price-Allpetsnumber);
    }

    public void Displaydetails ()
    {
        System.out.println("\nPet: "+Name+"\n"+"Type: "+Type+"\n"+"Age: "+Age);
        System.out.println("All pets number: "+Allpetsnumber+"\n"+"price: " +Price+"$");
        System.out.println("Profit is:"+calculateProfit()+"$");
    }

}
