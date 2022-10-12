import java.util.Scanner;

public class BankApp { 
//은행계좌업무시스템
	//1.계좌 생성
	//2.계좌 목록
	//3.예금
	//4.출금
	Account [] acc = new Account[100];//멤버변수 배열의 주소값은 null로 들어가있음
	Scanner sc = new Scanner(System.in); //멤버변수
	
	void info() {
		System.out.println("-------------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
		System.out.println("-------------------------------------");
		System.out.print("선택 : ");
	}
	
	void creatAccount() {
		System.out.println("----------");
		System.out.println("계좌 생성 메뉴");
		System.out.println("----------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
//		if(findAccount(ano) != null)
		
		System.out.println("계좌주 명 : ");
		String owner = sc.next();
		
		System.out.println("초기입금액 : ");
		int balance = sc.nextInt();
		
		System.out.println("이자를 입력 : ");
		double rate = sc.nextDouble();
		
		//완성하기
		
		Account account = new Account(ano,owner,balance,rate);
		//
		account.rateCal();
		
		
        for(int i = 0;i<acc.length;i++) {
        	if(acc[i] == null) {
        		acc[i] = account;
        		System.out.println("계좌가 생성되었습니다.");
        		break;
        	}
        	
        	
        }
		
	}
	
	
	//계좌목록보기기능

	void accountList() {
		System.out.println("-------------");
		System.out.println("계좌 목록 보기 메뉴");
		System.out.println("-------------");
		
		System.out.println("계좌번호"+"\t"+"계좌주"+"\t"+"입금액"+ "\t" +"이자율"+ "\t" +"출금가능액");
		
	    for(int i = 0;i<acc.length;i++) {
	    	if(acc[i] == null) {
	    		
	    		break;
	    }
	    	System.out.println(acc[i].getAno() + "\t" + acc[i].getOwner() + "\t" + acc[i].getBalance() + "\t" + acc[i].getRate() + "\t" + acc[i].getAmount());
	    }
	}
	  
	//예금기능
	void deposit() {
		System.out.println("-------------");
		System.out.println("예금 기능 메뉴");
		System.out.println("-------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("예금액 : ");
		int balance = sc.nextInt();
		
		//완성기능 
		 Account account = findAccount(ano);
		 
		 if(account == null) {
			 System.out.println("계좌번호가 존재하지 않습니다.");
			 return;
		 }
		 account.setBalance(account.getBalance() + balance);
		 account.rateCal(); //예금 후 이자율 처리하기
		 System.out.println("예금 처리가 정상적으로 처리되었습니다.");
	  } 
	    //출금기능
	
	     void withdraw() {
	        System.out.println("-------------");
	 		System.out.println("출금 기능 메뉴");
	 		System.out.println("-------------"); 
	 		
	 		System.out.println("계좌번호 : ");
			String ano = sc.next();
			
			System.out.println("예금액 : ");
			int balance = sc.nextInt();
			
			 Account account = findAccount(ano);
			 
			 if(account == null) {
				 System.out.println("계좌번호가 존재하지 않습니다.");
				 return;
			 }
			 if(account.getBalance() < balance) {
				 System.out.println("예금액이 부족합니다.");
				 return;
			 }
			 account.setBalance(account.getBalance() - balance);
			 System.out.println("출금 처리가 정상적으로 처리되었습니다.");
	     }
	
	
	
		//계좌찾기
		Account findAccount(String ano) {
			
			Account account = null;
			
			for(int i = 0;i<acc.length;i++) {
				if(acc[i] != null) {
				if(acc[i].ano.equals(ano)) { //.equal() = 문자타입을 비교할때 사용  == 사용하면 안됨
					account = acc[i];
					break;
				}
			}
		}
		return account;
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

