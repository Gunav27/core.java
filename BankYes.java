class BankYes{  //class name first letter should be upper case eg:-Bank
       


         // Before main(String e[]) if you are using string then add static 
	    static String bankName = "Yes bank" ;
		static String ifscCode = "YESB00004076" ;
		static String branch = "Malleshwaram" ;
		static int branchCode = 4076 ;
		static long phoneNo = 8124356782L ;
		static String accountType = "Current" ;
		static double interesPerAnnum = 6.7 ;

     public static void main(String e[]){
		 // After this statement no need of static can write as it is
	     
		        System.out.println("Bank name "+ bankName +"   "+ "place of branch " +branch) ;
				System.out.println("Ifsc code "+ifscCode +"\n" + "Branch code is "+branchCode +"\n" + "branch phone number "+phoneNo +"\n" +"Type of account "+accountType) ;
				System.out.println("Interest per annum "+interesPerAnnum ) ;
				
	 }




}