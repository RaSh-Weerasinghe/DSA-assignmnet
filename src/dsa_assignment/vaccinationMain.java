package dsa_assignment;

import java.util.Scanner;

public class vaccinationMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //get waiting queue length from user
        System.out.print("Enter length of queue (only interger numbers) ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Enter length of queue (only integer numbers) ");
        }
        int queueLength = scan.nextInt();
        System.out.println("Queue length is " + queueLength);
        circularQueue personQueue = new circularQueue(5);
        LinkList personList = new LinkList();

        System.out.println("Now you can manage queue");
        System.out.println("Enter 1 for add new person");
        System.out.println("Enter 2 for remove front person");
        System.out.println("Enter 3 for view front person");
        System.out.println("Enter 4 for view rear person");
        System.out.println("Enter 5 for how much people in the queue");
        System.out.println("Enter 6 for view all the persons in the queue");
        System.out.println("Enter 7 for remove front person and show the next person in queue");
        System.out.println("Enter 8 for show all the completed persons");
        System.out.println("Enter any non numeric charater for exit");
        System.out.print("Enter now ");
        while (scan.hasNextInt()) {
            String choosen = scan.nextLine();
            System.out.println();
            if (choosen.equals("1")) {
                System.out.print("Name ");
                String name = scan.nextLine().trim();
                while (name.equals("")) {
                    System.out.println("Name cant be empty Please enter name. If you need to cancel registration enter 0 ");
                    System.out.print("Name ");
                    name = scan.nextLine().trim();
                }
                if (name.equals("0")) {
                    System.out.print("Enter any non numeric charater for exit or choose number ");
                    continue;
                }
                System.out.print("TP no ");
                String tpNumber = scan.nextLine().trim();
                System.out.print("Age (put y for years and m for months) ");
                String age = scan.nextLine().trim();
                while (age.equals("")) {
                    System.out.println("Age cant be empty Please enter Age. ");
                    System.out.print("Name ");
                    age = scan.nextLine().trim();
                }
                System.out.print("Address ");
                String address = scan.nextLine().trim();
                while (address.equals("")) {
                    System.out.println("Address cant be empty Please enter Address. If you need to cancel registration enter 0 ");
                    System.out.print("Name ");
                    address = scan.nextLine().trim();
                }
                if (address.equals("0")) {
                    System.out.print("Enter any non numeric charater for exit or choose number ");
                    continue;
                }
                personQueue.insertPerson(name + "|" + tpNumber + "|" + address);
                System.out.print("Enter any non numeric charater for exit or choose number ");
                continue;
            }
            if (choosen.equals("2")) {
                personQueue.removePerson();
                System.out.print("Enter any non numeric charater for exit or choose number ");

                continue;
            }
            if (choosen.equals("3")) {
                personQueue.viewFrontPerson();
                System.out.print("Enter any non numeric charater for exit or choose number ");

                continue;
            }
            if (choosen.equals("4")) {
                personQueue.viewRearPerson();
                System.out.print("Enter any non numeric charater for exit or choose number ");

                continue;
            }
            if (choosen.equals("5")) {
                personQueue.showQueueItemCount();
                System.out.print("Enter any non numeric charater for exit or choose number ");

                continue;
            }
            if (choosen.equals("6")) {
                personQueue.showAllQueue();
                System.out.print("Enter any non numeric charater for exit or choose number ");
                continue;
            }
            if (choosen.equals("7")) {
                if (!personQueue.getFrontPerson().equals("0")) {
                    personList.insertFirst(personQueue.getFrontPerson());
                }
                personQueue.removePerson();
                System.out.print("The next person is ");
                personQueue.viewFrontPerson();
                System.out.print("Enter any non numeric charater for exit or choose number ");
                continue;
            }
            if (choosen.equals("8")) {
                personList.displayList();
                continue;
            }

            System.out.print("Wrong number. Please try again ");
        }
        System.out.println("Exit from the program");
    }
}
