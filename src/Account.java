
public class Account { // ����
       String ano; //���¹�ȣ 
       String owner; // ����
       int balance; // �Աݾ�
       double rate; // ������
       
       //��ݰ��ɾ�
       int amount;
       
	public Account(String ano, String owner, int balance, double rate) { // �ҽ� - ���ʷ���Ʈ ����Ʈ���� ��¡ �ʵ� - �ַ� �ۺ�
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
		
	}
 //SET �� �������� �Ҵ��ϴ� ������ �Լ��̱� ������ ���ڸ� �޾ƾ� �ϰ� GET �� �������� ��ȯ�ϴ� �����̱� ������ return �� �ʿ��մϴ�  
       String getAno() { //get = �о�´�
    	   return ano;
       }
       
       void setAno(String ano) {
    	   this.ano = ano;
       }
        String getOwner() { //get = �о�´�
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
