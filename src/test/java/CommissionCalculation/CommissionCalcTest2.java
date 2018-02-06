package CommissionCalculation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommissionCalcTest2 {
    @Test
    public void commissionCslc() throws Exception {
        CommissionCalc commissionCalc= new CommissionCalc();
        String str2=  commissionCalc.commissionCslc("235.38");
        String exp2="7,71";
        assertEquals(exp2,str2);
    }

}