package CommissionCalculation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommissionCalcTest {
    @Test
    public void commissionCslc() throws Exception {
    CommissionCalc commissionCalc= new CommissionCalc();
      String str1=  commissionCalc.commissionCslc("1.23");
        String exp1="5,00";
        assertEquals(exp1,str1);
    }
}