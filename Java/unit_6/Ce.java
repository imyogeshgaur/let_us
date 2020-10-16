package Java.unit_6;

public class Ce {
    public static void main(String[] args) {
            double i,y,x;
            for (y = 0; y <=6; y++) {
                for (x = 5.5; x <=12.5; x++) {
                    i = 2 +(y*0.5*x);
                    System.out.println("For y = "+y+" x = "+x+" i = "+i);
                }
            }
    }
}
