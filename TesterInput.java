import java.util.Scanner;

public class TesterInput extends produk {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("masukkan dvd atau cd");
        String input = n.nextLine();
        System.out.println("masukkan nama = ");
        String name = n.nextLine();
        System.out.println("Masukkan number = ");
        int number = n.nextInt();
        System.out.println("quantity = ");
        int quantity = n.nextInt();
        System.out.println("masukkan price = ");
        Double price = n.nextDouble();
        n.next();
        if (input.equalsIgnoreCase("CD")) {
            System.out.println("Artist = ");
            String Artist = n.nextLine();
            System.out.println("label = ");
            String label = n.nextLine();
            System.out.println("masukkan total song = ");
            int numsong = n.nextInt();
            CD abc = new CD(Artist, numsong, label, number, name, quantity, price);
            abc.print();
        } else if (input.equalsIgnoreCase("DVD")) {
            System.out.println("\nStudio  = ");
            String studio = n.nextLine();
            System.out.println("\nRating = ");
            String rating = n.nextLine();
            System.out.println("\nLength = ");
            int length = n.nextInt();
            DVD surya = new DVD( length,rating,studio,number, name,  quantity,price);
            surya.print();
        }
        n.close();

    }
}
