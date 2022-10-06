package Task3;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static ArrayList<Customer> customer;
    public static void main(String[] args) {

    Customer c1 = new Customer("Jørgen","Jørgensen","JørgenKiller420");
        Customer c2 = new Customer("Rasmus","Ditlevsen","RasmusSkinnyRøv");
        Customer c3 = new Customer("Marcus","Løbel","Kussemar");
        Customer c4 = new Customer("Viktor","Viktorsen","ViktorGamer69");
        Customer c5 = new Customer("Phillip","Kristensen","ShadowKiller");
        Customer c6 = new Customer("Bob","Jensen","BobJensenErSej");

        // (Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.)
     customer = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6));

     // Kalder metode.
     printCustomers();
    }
    // Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved at gennemløbe 'customers' med et ’for each’ loop.
    public static void printCustomers(){
        for(Customer c:customer){
            System.out.println(c);
        }
    }
}
