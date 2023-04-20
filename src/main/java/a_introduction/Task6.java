package a_introduction;

public class Task6 {
    public static void main(String[] args) {

        double alcoholContent = 5.5;
        final String beerType = alcoholContent >= 6  ? "mocne" : "słabe";

        System.out.println(beerType);
    }
}
