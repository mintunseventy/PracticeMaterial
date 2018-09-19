package vending;

import java.util.List;

public interface VendingMachine {

    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange();
    public void reset();

    //javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5CZ1aG9qb

}
