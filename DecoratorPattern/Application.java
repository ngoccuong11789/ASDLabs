package Labs.DecoratorPattern;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// create 2 accounts;
		Account account1 = accountService.createAccount("1263862", "Frank Brown",AccountType.CHECKING);
		Account account2 = accountService.createAccount("4253892", "John Doe",AccountType.SAVING);
		// use account 1;

		Interest promotionalInterest1 = new PromotionP1(account1.getInterest());
		promotionalInterest1 = new PromotionP2(promotionalInterest1);
		account1.applyPromotion(promotionalInterest1);

		Interest promotionalInterest2 = new PromotionP3(account2.getInterest());
		account2.applyPromotion(promotionalInterest2);

		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.addInterest("1263862");

		accountService.withdraw("1263862", 230);
		// use account 2;Ï
		accountService.deposit("4253892", 12450);
		accountService.addInterest("4253892");

		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
