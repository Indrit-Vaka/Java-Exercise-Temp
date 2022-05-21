package BeautySaloonNeVazhdim;

import java.util.Date;

public class Visit extends Customers {
    private Customers customers;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        super(name);
        this.date = date;
    }

    @Override
    public String getName() {
        return customers.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    @Override
    public String toString(){
        return String.format("Visit [Date: %tm, serviceExpense: %1.2f, Product Expense: %1.2f, %s",date,serviceExpense,productExpense,super.toString());
    }

}
