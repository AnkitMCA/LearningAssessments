/*

Ques.10 Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below

* Customer
  - Pays the cash to the cashier and places his order, get a token number back
  - Waits for the intimation that order for his token is ready
  - Upon intimation/notification he collects the coffee and enjoys his drink
  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)

* Cashier
  - Takes an order and payment from the customer
  - Upon payment, creates an order and places it into the order queue
  - Intimates the customer that he has to wait for his token and gives him his token
  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)

* Barista
 - Gets the next order from the queue
 - Prepares the coffee
 - Places the coffee in the completed order queue
 - Places a notification that order for token is ready

*/

import java.util.Scanner;

public class Ques10 {
    private static Ques10 st = new Ques10();
    private static int token_number=1001;
    private boolean token_status;
    private double order_amount;
    private  boolean payment_status;
    private int[] order_queue;
    private int[] ready_queue;
    private final int MAX_ORDER;
    private Scanner In;
    private static int o_count;


    public Ques10() {
        MAX_ORDER=10;
        token_status=false;
        payment_status=false;
        order_queue=new int[MAX_ORDER];
        ready_queue=new int[MAX_ORDER];
        In=new Scanner(System.in);
    }


    public static Ques10 getInstance() {
        return st;
    }

    public int requestService() {
        System.out.println("[Pay Bill] Enter amount: ");
        order_amount=In.nextLong();
        if(order_amount>=0) {
            order_queue[o_count]=token_number;
            o_count++;
            token_number++;
            System.out.println("Order id "+token_number+" is in order queue, please wait.");

            return  token_number;
        } else {
            System.out.println("Amount not paid, try again.");
            return 0;
        }
    }

    public void processOrder() {
        if(order_queue.length>0) {
            for(int i=0;i<order_queue.length;i++) {
                if(order_queue[i]==0) {
                    break;
                } else {
                    System.out.println("Order id " + order_queue[i] + " is ready.");
                    ready_queue[i] = order_queue[i];
                }
            }
            order_queue=null;
        }
    }

    public void deliverService() {
        if(ready_queue.length>0) {
            for(int i=0;i<ready_queue.length;i++) {
                if(ready_queue[i]==0) {
                    break;
                } else {
                    System.out.println("Order id " + ready_queue[i] + " is completed.");
                }
            }
            ready_queue=null;
        }
    }


    public static void main(String[] args) {
        st.requestService();
        st.processOrder();
        st.deliverService();
    }
}