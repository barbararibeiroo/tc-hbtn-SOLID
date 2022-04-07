
public class BankCard implements IPayment {

	@Override
	public void collectPayment() {
		System.out.println("Pagamento Realizado");

	}

	@Override
	public void validate() throws Exception {
		// TODO Auto-generated method stub

	}

}
