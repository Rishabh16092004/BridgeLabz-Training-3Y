public class level1_7 {
    public static void main(String[] args) {
        double radiuskm = 6378.0;
        double kmtoMiles = 0.621371;
        double volume3 = (4.0/3.0)*Math.PI*Math.pow(radiuskm,3);
        double radiusMiles = radiuskm*kmtoMiles;
        double volumeMiles3 = (4.0/3.0)*Math.PI*Math.pow(radiusMiles,3);
        System.out.println("The volume of earth in cubic kilometers is "+volume3 +" and cubic miles is "+volumeMiles3);
    }
}
