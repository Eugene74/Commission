package CommissionCalculation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommissionCalcTest3 {
    @Test
    public void commissionCslc() throws Exception {
        CommissionCalc commissionCalc= new CommissionCalc();
        String str3=  commissionCalc.commissionCslc("1680.45");
        String exp3="20,00";
        assertEquals(exp3,str3);
    }

}