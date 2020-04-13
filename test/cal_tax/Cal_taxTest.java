/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_tax;

import static cal_tax.Cal_tax.getTax;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author 4star
 */
@RunWith(Parameterized.class)
public class Cal_taxTest {
     Cal_tax m;
     double expres;
     String status;
     double income;
    public Cal_taxTest(double a,String status, double income) {
        this.expres=a;
        this.status=status;
        this.income=income;
    }
    
    @Before
    public void setUp() {
        m=new  Cal_tax();
    }
    
    @After
    public void tearDown() {
        m=new  Cal_tax();
    }
     @Parameterized.Parameters
     public static Collection tax(){
     return Arrays.asList(new Object[][]{
     
         {0.0,"M",0},
         {25,"m",500},
         { 500.0,"M", 10000.0},
         {1072.5,"m",21450},
         {2400,"M",30000},
         {3600,"m",45000},
         {4152,"M",51900},
         {6000,"m",60000},
         {10000,"M",100000},
         {0,"S",0},
         {15,"s",500},         
         {300.0,"s",10000.0},
         {1074,"S",35800},
         {600,"s",20000},
         {4000,"S",50000},
        {6520,"s",81500},
        {5200,"S",65000},
        {8100,"s",90000},
        {18000,"S",200000},
      });
     }

    @Test
    
       public void testGetTax() {
         m=new  Cal_tax();
        System.out.println("getTax");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expres,Cal_tax.getTax(status, income),0.001);
        
       
        
    }
    
    }
    

