package CommissionCalculation;


public class CommissionCalc {
    public String commissionCslc(String sum){
        double transactionSum = Double.parseDouble(sum);
        Double commission = percentCalc(transactionSum, 2, 3);
        if(commission<5.00) commission = 5.00;
        if(commission>20.00) commission = 20.00;

        sum=String.format("%.2f", commission);
        return sum;
    }
    private double percentCalc(Double transactionSum, int percent, int addiction) {
        double percentCommission = (transactionSum * percent)/100 + addiction;
        return percentCommission;
    }
}
