public class Item {
    String[] itemCode;
    String[] itemName;
    double[] itemPrice;

    Item(String[] itemCode, String[] itemName, double[] itemPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    void displayItems(int i){
        System.out.println("ItemCode: "+itemCode[i]);
        System.out.println("ItemName: "+itemName[i]);
        System.out.println("ItemPrice: "+itemPrice[i]);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        String[] itemName = {"Water bottle","Rice","blackboard"};
        String[] itemCode = {"01AA","01BB","02AA"};
        double[] itemPrice = {500,700,400};

        Item item1 = new Item(itemCode, itemName, itemPrice);
        for(int i=0;i<itemPrice.length;i++){
            item1.displayItems(i);
        }
    }
}
