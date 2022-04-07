public class Commission extends Hourly{
    private double totalSales;
    private double commRate;
    
    //--------------------------------------------------------------------------
    // Sets up this commission hourly employee using the specified information.
    //--------------------------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate, double commRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commRate = commRate;
        totalSales = 0;
    }
    
    //---------------------------------------------------------------
    // Adds the specified number of total sales to this employee's
    // total sales.
    //---------------------------------------------------------------
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    
    //--------------------------------------------------------------------
    // Computes and returns the pay for this commissioned hourly employee.
    //--------------------------------------------------------------------
    public double pay(){
        double payment = super.pay() + (totalSales*commRate);
        totalSales = 0;
        return payment;
    }
    
    //-------------------------------------------------------------------------
    // Returns information about this commissioned hourly employee as a string.
    //-------------------------------------------------------------------------
    public String toString(){
        String result = super.toString();
        result += "\nTotal sales : " + totalSales ;
        return result;
    }
}
