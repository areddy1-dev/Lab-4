
public class Account {

		// TODO Auto-generated method stub
		private static int numAccounts = 0;
		
		
		public Account() {
			numAccounts++;   // Constructor method that will add 1 to numAccounts
		}
		
		public static int getNumAccounts() {     // GetNumAccounts static method created
			return numAccounts;
		}
		
		public static void main(String[] args) {
	         new Account();
	         new Account();
		 new Account();
		 new Account();
			
			System.out.println("Number of Accounts created: " + Account.getNumAccounts());
		
		}
	
	}

