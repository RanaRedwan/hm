public class Fruit {
    int id;
    int size;
    int farmNumber;
    String name, color;
    public Fruit(String name, String color, int id, int size, int farmName){
        this.name = name;
        this.color = color;
        this.size = size;
        this.id = id;
        this.farmNumber = farmName;
        System.out.println("name:" + name + "\n" + "color:" + color + "\n" + "size:" + size);
        System.out.println("id:" + id + "\n" + "farm name" + farmName);

    }

    public void setId ( int id){
        this.id = id;
    }

    public void setSize ( int size){
        this.size = size;
    }

    public void setFarmNumber ( int farmNumber){
        this.farmNumber = farmNumber;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setColor (String color){
        this.color = color;
    }

    public int getId () {
        return id;
    }

    public int getSize () {
        return size;
    }

    public int getFarmNumber () {
        return farmNumber;
    }

    public String getName () {
        return name;
    }

    public String getColor () {
        return color;
    }

    @Override
    public String toString () {
        return "Fruit{" +
                "id=" + id +
                ", size=" + size +
                ", farmNumber=" + farmNumber +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}