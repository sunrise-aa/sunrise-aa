package Classes_and_Objects;


import java.util.*;

public class StockTest {
    public static void main(String[] args) {

        Stock stock1=new Stock("ORCL","Oracle Corporation");
        stock1.previousClosingPrice=34.5;
        stock1.currentPrice=34.35;
        System.out.println("当前市值变化为"+stock1.getChangePercent());
    }

}

/**
 *
 */
class Stock {
    public String symbol;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public double previousClosingPrice;
    /**
     *
     */
    public double currentPrice;
    /**
     *
     */
    Stock(String newSymbol,String newName){
        symbol=newSymbol;
        name=newName;
    }
    /**
     *   @return
     */
    public String getChangePercent() {
        // TODO implement here
        return Math.abs(currentPrice-previousClosingPrice)/previousClosingPrice*100+"%";
    }

}