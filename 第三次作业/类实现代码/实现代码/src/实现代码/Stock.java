
import java.util.*;

/**
 * 
 */
public class Stock {

    /**
     * Default constructor
     */
    

    /**
     * 
     */
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
    public Stock(String newSymbol,String newName){
		symbol=newSymbol;
		name=newName;
    }
	/**
     * @return
     */
    public String getChangePercent() {
        // TODO implement here
        return Math.abs(currentPrice-previousClosingPrice)/previousClosingPrice*100+"%";
    }

}