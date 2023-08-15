package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test addProduct
        Warehouse w = new Warehouse(); 
        int day = 0; 
        int ID = 0; 
        String productName = "";
        int itemInitialStock = 0; 
        int initialDemand = 0; 
    
        int numOfProducts = StdIn.readInt(); 
        for (int i = 0; i<numOfProducts; i++){
            day = StdIn.readInt();
            ID = StdIn.readInt();
            productName = StdIn.readString();
            itemInitialStock = StdIn.readInt();
            initialDemand = StdIn.readInt(); 
            w.addProduct(ID, productName, itemInitialStock, day, initialDemand);
        }

        StdOut.println(w);
    }
}
