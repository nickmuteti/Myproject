import java.awt.*;

public class Ship {
        //Attributes
        // Color, Capacity, Owner, country
        private Color mycolor;
        private String myowner;
        private String mycountry;
        private int mycapacity;

        public Ship(){}


        Ship(Color color,String owner,String country, int capacity){

            this.mycolor=color;
            this.myowner=owner;
            this.mycountry=country;
            this.mycapacity=capacity;

        }
        public void setColor(Color color){
            this.mycolor=color;

            }
        public void setMyowner(String owner){
            this.myowner=owner;

        }
        public void setMyCountry(String country){
            this.mycountry=country;

        }
        public void setMycapacity(int capacity){
            this.mycapacity=capacity;

        }

        public Color getColor(){
            return this.mycolor;

        }
        public String getMyowner(){
            return this.myowner;

        }
        public String getMyCountry(){
           return this.mycountry;

        }
        public int getMycapacity(){
            return this.mycapacity;

        }

}
