import java.util.*;
class Main{
    public static void main(String args[]){
        City city = new City("Black");
        city.horn();
        System.out.println("Top Speed : "+city.topSpeed);
        System.out.println(city);
    }
}
class Vehical{
    protected String brand = "Honda";
    Vehical(){
        System.out.println("Vehical Class Constructor Called!!!");
    }
    public void horn(){
        System.out.println("Peep Peeepp!!");
    }
    
}
interface FourWheeler{

}
class City extends Vehical implements FourWheeler{
    public String model = "City v1";
    int topSpeed = 180;
    String color="";
    City(String color){
        System.out.println("City Class Constructor called !!");
        this.color = color;
    }
    public String toString(){
        return "City";
    }
}

