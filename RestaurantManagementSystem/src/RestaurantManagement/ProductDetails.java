package RestaurantManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDetails {

    static List<Product> list = new ArrayList<Product>();

    static void refresh() {
        list = new ArrayList<Product>();
        File f = new File("products.txt");
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNext()) {
                int id = scan.nextInt();
                String name = scan.next();
                double price = scan.nextDouble();
                Product ob = new Product(id, name, price);
                list.add(ob);
            }
        } catch (Exception e) {
            System.out.println("File not found");

        }

    }

    static List<Product> getListOfProducts() {
        File f = new File("products.txt");
        List<Product> temp = new ArrayList<Product>();
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNext()) {
                int id = scan.nextInt();
                String name = scan.next();
                double price = scan.nextDouble();
                Product ob = new Product(id, name, price);
                temp.add(ob);
            }
        } catch (Exception e) {
            System.out.println("File not found");

        }
        return temp;
    }

    static boolean addProduct(Product p) {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getProductId() == p.getProductId()) {
                System.out.println("Error,Product Id should be Unique");
                return false;
            }
        }
        list.add(p);
        updateFile();
        return true;
    }

    private static void updateFile() {
        File f = new File("products.txt");
        try {
            FileWriter wr = new FileWriter(f);

            for (int i = 0; i < list.size(); i++) {
                Product curr = list.get(i);
                wr.write(curr.getProductId() + " " + curr.getName() + " " + curr.getPrice() + "\n");

            }
            wr.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    static void removeProduct(int id) throws ProductNotFoundException {
        boolean ch = true;
        for (int i = 0; i < list.size(); i++) {
            Product curr = list.get(i);
            if (curr.getProductId() == id) {
                list.remove(i);
                ch = false;
                break;
            }
        }
        if (ch) {
            throw new ProductNotFoundException();
        } else {
            updateFile();
        }

    }
}
