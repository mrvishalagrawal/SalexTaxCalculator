package com.xebia;

import com.xebia.Conversion.ItemFactory;
import com.xebia.domain.entities.Item;
import com.xebia.receipt.Receipt;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] inputs = {"1 book at 12.49", "1 music CD at 14.99",
                "1 chocolate bar at 0.85"};
        System.out.println(inputs);
        App taxCalculatorApplication = new App();
        Receipt receipt = taxCalculatorApplication.generateReceipt(inputs);
        System.out.println(receipt);
    }

    Receipt generateReceipt(String[] inputs) {
        List<Item> items = ItemFactory.from(inputs);
        return new Receipt(items);
    }
}
