package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test restock
        Warehouse w = new Warehouse(); 
        int day = 0; 
        int ID = 0; 
        String productName = "";
        int itemInitialStock = 0; 
        int initialDemand = 0;

        int numOfQueries = StdIn.readInt(); 
        int restockAmount = 0; 
        String command = ""; 

        for (int i = 0; i<numOfQueries; i++){
            command = StdIn.readString(); 
            if (command.equals("add")){
                day = StdIn.readInt();
                ID = StdIn.readInt();
                productName = StdIn.readString();
                itemInitialStock = StdIn.readInt();
                initialDemand = StdIn.readInt(); 
                w.addProduct(ID, productName, itemInitialStock, day, initialDemand);
            }
            else{
                ID = StdIn.readInt(); 
                restockAmount = StdIn.readInt();
                w.restockProduct(ID, restockAmount);
            }
        }

        StdOut.println(w);
    }
}
