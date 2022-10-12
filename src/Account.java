
public class Account { // 통장
       String ano; //계좌번호 
       String owner; // 주인
       int balance; // 입금액
       double rate; // 이자율
       
       //출금가능액
       int amount;
       
	public Account(String ano, String owner, int balance, double rate) { // 소스 - 제너레이트 컨스트럭터 유징 필드 - 주로 퍼블릭
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
		
	}
 //SET 은 변수값을 할당하는 목적의 함수이기 때문에 인자를 받아야 하고 GET 은 변수값을 반환하는 목적이기 때문에 return 이 필요합니다  
       String getAno() { //get = 읽어온다
    	   return ano;
       }
       
       void setAno(String ano) {
    	   this.ano = ano;
       }
        String getOwner() { //get = 읽어온다
    	   return owner;
       }
        
       void setOwner(String owner) {
    	   this.owner = owner;
       }
       
       int getBalance() {
    	   return balance;
       }
       
       void setBalance(int balance) {
    	   this.balance = balance;
       }
       
       double getRate() {
    	   return rate;
       }
      
       void setRate(double rate) {
    	   this.rate = rate;
       }
       double getAmount() {
    	   return amount;
       }
      
       void setAmount(int amount) {
    	   this.amount = amount;
       }
       
       void rateCal() {
    	   this.amount = balance + (int)(balance * getRate()/100); 
       }
       
       
       
       
}
