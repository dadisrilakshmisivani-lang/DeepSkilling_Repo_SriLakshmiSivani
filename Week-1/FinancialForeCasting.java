public class FinancialForeCasting {
    public static double value(double currentValue,double growthRate,int years)
    {
        if(years==0)
            return currentValue;

        return value(currentValue,growthRate,years-1)*(growthRate+1);
    }
    public static void main(String[] args) {

        double currentValue = 23000;
        double growthRate = 0.11; 
        int years = 34;
        double forecast = value(currentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years = " + forecast);
    }
}
