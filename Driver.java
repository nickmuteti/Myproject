import java.awt.*;
import java.util.ArrayList;

public class Driver {

    public static void main(String args[]){

        //Create several cargo ships
        CargoShip a = new CargoShip(Color.blue,"John","Japan",12);
        CargoShip b= new CargoShip(Color.YELLOW,"Song","China",2);;
        CargoShip c= new CargoShip(Color.GRAY,"Mank","India",7);;
        CargoShip d= new CargoShip(Color.PINK,"Gell","Taiwan",6);;

        // Create Several Cruise Ships
        CruiseShip e= new CruiseShip(Color.RED,"Kolen","US",4);;
        CruiseShip f = new CruiseShip(Color.white,"Desu","Germany",6);;
        CruiseShip g= new CruiseShip(Color.blue,"Lian","Japan",8);;
        CruiseShip h= new CruiseShip(Color.ORANGE,"Juan","Taiwan",16);;


        //Create an array containing all the above

        Ship[] ships = new Ship[8];
        //assign the array data
        ships[0]=a;
        ships[1]=b;
        ships[2]=c;
        ships[3]=d;
        ships[4]=e;
        ships[5]=f;
        ships[6]=g;
        ships[7]=h;

        //Print the dat of ship 5
        System.out.println("Ship 5 can host: " + ships[5].getMycapacity());
        System.out.println("Ship 4 is Color: " + ships[4].getColor());
        System.out.println("Ship 1 is owned by: " + ships[1].getMyowner());
        System.out.println("Ship 6 is from: " + ships[6].getMyCountry());



    }
}
