
public class BankRewards implements IPayment {

	public void validate() {
		System.out.println("Limite OK, Rewards OK!");

	}

	public void collectPayment() {
		System.out.println("Pagamento realizado com sucesso!");
		System.out.println("Pontuação creditada no Programa Rewards!");

	}

}
