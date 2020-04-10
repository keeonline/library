package keeonline.library.v1.model;

import java.util.ArrayList;
import java.util.List;

public class LoanList {

    private List<Loan> loans;

    public LoanList(){
        loans = new ArrayList<>();
    }

    public Loan add(Loan loan) {
        loans.add(loan);
        return loan;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public synchronized Loan deleteById(int id) {
        Loan loan = findById(id);
        if (loan != null){
            loans.remove(loan);
        }
        return loan;
    }

    public synchronized Loan findById(int id) {
        for (Loan l : loans) {
            if (l.getLoanId() == id) {
                return l;
            }
        }
        return null;
    }

    public LoanList active(){
        LoanList result = new LoanList();
        for (Loan l : loans){
            if (l.isActive()){
                result.add(l);
            }
        }
        return result;
    }

    public LoanList complete(){
        LoanList result = new LoanList();
        for (Loan l : loans){
            if (l.isComplete()){
                result.add(l);
            }
        }
        return result;
    }

}
