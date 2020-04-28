package com.example.designpatterndemo;

import java.util.ArrayList;
import java.util.Scanner;

interface Amount {
    void totalAmount(int price, int quantity);
}

public class Assignment {
    private static ArrayList<Item> itemsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        initialize();
    }

    private static void initialize() {
        FoodItem nameObj = new FoodItem();
        Pizza pizzaObj = new Pizza();
        Pasta pastaObj = new Pasta();
        exit exitObj = new exit();
        nameObj.ShopName();
        pizzaObj.ShopName();
        pastaObj.ShopName();
        exitObj.ShopName();
        getValidNumber();
    }

    private static void getValidNumber() {
        Scanner myObj = new Scanner(System.in);
        int userName = myObj.nextInt();
        switch (userName) {
            case 1:
                System.out.println("Packages for Pizza ");
                PizzaList pizzaListObj = new PizzaList();
                pizzaListObj.ShopName();
                getPizzaValue(new OrderPizzaList());
                break;
            case 2:
                System.out.println("Pasta's Packages ");
                PastaList pastaListObj = new PastaList();
                pastaListObj.ShopName();
                getPastaValue(new OrderPastaList());
                break;
            default:

                Item itemPizza = new Item();
                itemPizza.name = "Pizza";

                Item itemPasta = new Item();
                itemPasta.name = "Pasta";
                //check if array-list is not empty then
                //print bill first and then exit.
                if (itemsArrayList.size() > 0) {
                    for (int i = 0; i < itemsArrayList.size(); i++) {
                        // if item name is pizza add into pizza item else pasta item
                        Item itemMain = itemsArrayList.get(i);
                        if (itemMain.name.equalsIgnoreCase("pizza")) {
                            //pizza's total quantities
                            itemPizza.quantity += itemMain.quantity;
                            //pizza's total price
                            itemPizza.price += itemMain.price;
                        } else if (itemMain.name.equalsIgnoreCase("pasta")) {
                            //pasta's total quantities
                            itemPasta.quantity += itemMain.quantity;
                            //pasta's total price
                            itemPasta.price += itemMain.price;
                        }
                    }
                    System.out.println("*****************Bill******************");
                    System.out.println("S.No.   Item   Qyt.    Amount");
                    //This is to check if user select only pizza
                    if (itemPizza.price > 0) {
                        System.out.println("1        "
                                + itemPizza.name + "  "
                                + itemPizza.quantity + "     "
                                + itemPizza.price);
                    }
                    //This is to check if user select only pasta
                    if (itemPasta.price > 0) {
                        int sNo = 2;
                        if (itemPizza.price == 0) sNo = 1;
                        System.out.println(sNo + "       "
                                + itemPasta.name + "  "
                                + itemPasta.quantity + "     "
                                + itemPasta.price);
                    }

                    System.out.println("               TotalAmount" +
                            (itemPasta.price + itemPizza.price));
                }
                System.out.println("Thanks for coming in Anna's shop");
                break;
        }
    }

    private static void getPizzaValue(Amount callback) {
        Scanner pizzaObj = new Scanner(System.in);
        int selectPizza = pizzaObj.nextInt();
        if (selectPizza == 1) {
            System.out.println(" 1 Large Pizza  " + "  12AUD     ");
            callback.totalAmount(12, 1);
        } else if (selectPizza == 2) {
            System.out.println("  2 Large Pizza  " + " 22 AUD      ");
            callback.totalAmount(22, 2);
        } else if (selectPizza >= 3) {
            int totalPizzaNumber = selectPizza * 10;
            System.out.print(totalPizzaNumber + "  you are getting  " + (selectPizza / 3) + "  garlic bread");
            callback.totalAmount(totalPizzaNumber, selectPizza);
        } else {
            initialize();
        }
    }

    private static void getPastaValue(Amount callback) {
        Scanner pastaObj = new Scanner(System.in);
        int selectPasta = pastaObj.nextInt();
        if (selectPasta == 1) {
            System.out.println(" 1 Large Pasta  " + "  8 AUD     ");
            callback.totalAmount(8, 1);
        } else if (selectPasta == 2) {
            System.out.println("  2 Large Pasta  " + " 15 AUD      ");
            callback.totalAmount(15, 2);
        } else if (selectPasta >= 3) {
            int totalPizzaNumber = selectPasta * 7;
            System.out.print(totalPizzaNumber + "  you are getting  " + (selectPasta / 3) + "  1.25 Litre soft drink");
            callback.totalAmount(totalPizzaNumber, selectPasta);
        } else {
            initialize();
        }
    }

    public static class OrderPizzaList implements Amount {
        @Override
        public void totalAmount(int price, int quantity) {
            //create object here with required name,quantity and price.
            Item item = new Item();
            item.name = "Pizza";
            item.price = quantity;

            //add into the arrayList
            itemsArrayList.add(item);

            //ask user again about the item and perform
            // action on user's input.
            initialize();
        }
    }

    public static class OrderPastaList implements Amount {
        @Override
        public void totalAmount(int price, int quantity) {
            //create object here with required name,quantity and price.
            Item item = new Item();
            item.name = "Pasta";
            item.price = quantity;
            //add into the arrayList
            itemsArrayList.add(item);
            //ask user again about the item and perform
            // action on user's input.
            initialize();
        }
    }
}

class FoodItem {
    public void ShopName() {
        System.out.println("Welcome to Anna's shop");
        System.out.println("Select Food Item");
    }
}

class Pizza extends FoodItem {
    public void ShopName() {
        System.out.println("1. Pizza   " + "         " + "       Type 1 for Pizza  ");
    }
}

class Pasta extends FoodItem {
    public void ShopName() {
        System.out.println("2. Pasta " + "         " + "         Type 2 for Pasta  ");
    }
}

class exit extends FoodItem {
    public void ShopName() {
        System.out.println("3. Exit " + "         " + "         Type 3 for Exit  ");
    }
}

class PizzaList extends FoodItem {
    public void ShopName() {
        System.out.println("1. Large Pizza      12AUD" + "         " + "                                                             Type 1 for Large Pizza  ");
        System.out.println("2. 2 Large Pizzas   22AUD" + "         " + "                                                             Type 2 for 2 Large Pizzas  ");
        System.out.println("3. N large pizzas\n" +
                "(For N>=3)    N*10AUD" + " Offer* - every 3 pizzas customer will get 1 garlic bread        " + "         Type amount of Pizzas you want  ");
        System.out.println("4. Back" + "         " + "                                                             Type 4 for back to menu  ");
    }
}

class PastaList extends FoodItem {
    public void ShopName() {
        System.out.println("1. Large Pasta      8 AUD" + "         " + "                                                             Type 1 for Large Pizza  ");
        System.out.println("2. 2 Large Pasta   15 AUD" + "         " + "                                                             Type 2 for 2 Large Pizzas  ");
        System.out.println("3. M large pasta\n" +
                "(For M>=3)    M*7AUD" + " Offer* - every 3 pizzas customer will get 1.25 liter soft drink  " + "               Type amount of Pizzas you want  ");
        System.out.println("4. Back" + "         " + "                                                             Type 4 for back to menu  ");
    }
}

class Item {
    String name;
    int quantity;
    double price;
}
