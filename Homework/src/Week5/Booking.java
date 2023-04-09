package Week5;

import java.util.ArrayList;

public class Booking {
    private ArrayList<Item> itemList;
    private Discount discount;

    public Booking() {
        this.itemList = new ArrayList<>();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item i){
        itemList.add(i);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void addDiscount(Discount discount) {
        this.discount = discount;
    }

    public double bookingSum(){
        double sum = 0;
        for(Item e: itemList){
            sum += e.getPrice();
        }
        return sum;
    }
}
