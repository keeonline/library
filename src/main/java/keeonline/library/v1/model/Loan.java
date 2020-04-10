package keeonline.library.v1.model;

import java.time.LocalDate;
import java.util.Objects;

public class Loan {
    public enum LoanState {
        Active,Complete,Unknown;
    }

    private static int nextId = 0;

    private int loanId;

    private LoanState state;
    private int customerId;
    private int productId;
    private LocalDate returnDue;
    private LocalDate returned;

    public Loan(){
    }

    public Loan(int customerId,int productId,LocalDate returnDue){
        this.loanId = nextId++;
        this.state = LoanState.Active;
        this.customerId = customerId;
        this.productId = productId;
        this.returnDue = returnDue;  // date format must be '2011-12-03'
    }

    public int getLoanId() {
        return loanId;
    }

    public LoanState getState() {
        return state;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public LocalDate getReturnDue() {
        return returnDue;
    }

    public void setReturnDue(LocalDate returnDue) {
        this.returnDue = returnDue;
    }

    public LocalDate getReturned() {
        return returned;
    }

    public void setReturned(LocalDate returned) {
        this.returned = returned;
    }

    public boolean isActive() {
        return state == LoanState.Active;
    }

    public boolean isComplete() {
        return state == LoanState.Complete;
    }

    public void loanComplete() {
        this.state = LoanState.Complete;
        this.returned = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return customerId == loan.customerId &&
                productId == loan.productId &&
                Objects.equals(returnDue, loan.returnDue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, productId, returnDue);
    }
}
