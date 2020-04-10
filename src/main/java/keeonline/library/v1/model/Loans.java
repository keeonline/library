package keeonline.library.v1.model;

public class Loans {
	private static Loans instance;

	private LoanList allLoans;

	private Loans() {
		super();
		allLoans = new LoanList();
	}
	
	public static synchronized Loans getInstance() {
		if (instance == null) {
			instance = new Loans();
		}
		return instance;
	}
	
	public LoanList getAllLoans() {
		return allLoans;
	}

	public synchronized Loan newLoan(Loan loan) {
		//TODO: validate loan
		allLoans.add(new Loan(loan.getCustomerId(),loan.getProductId(),loan.getReturnDue()));
		return loan;
	}

	public synchronized Loan returnLoan(Loan loan) {
		//TODO: validate loan
		Loan returned = allLoans.findById(loan.getLoanId());
		if (returned != null){
			returned.loanComplete();
		}
		return returned;
	}

}
