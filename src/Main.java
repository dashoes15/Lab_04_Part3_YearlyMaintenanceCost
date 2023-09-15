import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int springCost;
        int summerCost;
        int fallCost;
        int winterCost;
        int yearlyCost;
        System.out.println("Input spring maintencence cost");
        springCost = scan.nextInt();
        System.out.println("Input summer maintenence cost");
        summerCost = scan.nextInt();
        System.out.println("Input fall maintence cost");
        fallCost = scan.nextInt();
        System.out.println("Input winter maintenence cost");
        winterCost = scan.nextInt();
        yearlyCost = springCost+summerCost+fallCost+winterCost;
        System.out.println("Your yearly maintenence cost is $" + yearlyCost);
    }
}