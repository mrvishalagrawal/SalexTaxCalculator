package com.xebia;


import com.xebia.receipt.Receipt;
import org.junit.Assert;
import org.junit.Test;


/**
 * author @Vishal
 */
public class AppTest 
{

    private App taxCalculatorApplication = new App();

    @Test
    public void withoutImported()
    {
   String[] inputs = {"1 book at 12.49", "1 music CD at 14.99",
                "1 chocolate bar at 0.85"};

        Receipt receipt = taxCalculatorApplication.generateReceipt(inputs);

        System.out.println(receipt);
        Assert.assertEquals(1.50, receipt.getTotalSalesTax(),0);
        Assert.assertEquals(29.83, receipt.getTotalAmount(),0);
   }

    @Test
    public void  test2() {

        String[] inputs = {"1 imported box of chocolates at 10.00",
                "1 imported bottle of perfume at 47.50"};

        Receipt receipt = new App().generateReceipt(inputs);
        System.out.println(receipt);
        Assert.assertEquals(7.65, receipt.getTotalSalesTax(),0);
        Assert.assertEquals(65.15, receipt.getTotalAmount(),0);

    }


    @Test
    public void test3() {

        String[] inputs = {"1 imported bottle of perfume at 27.99",
                "1 bottle of perfume at 18.99",
                "1 packet of headache pills at 9.75",
                "1 box of imported chocolates at 11.25"};

        Receipt receipt = new App().generateReceipt(inputs);
        System.out.println(receipt);
        Assert.assertEquals(6.70, receipt.getTotalSalesTax(),0);
        Assert.assertEquals(74.68, receipt.getTotalAmount(),0);


    }


}
