import java.util.Scanner;

public class BankApp { 
//������¾����ý���
	//1.���� ����
	//2.���� ���
	//3.����
	//4.���
	Account [] acc = new Account[100];//������� �迭�� �ּҰ��� null�� ������
	Scanner sc = new Scanner(System.in); //�������
	
	void info() {
		System.out.println("-------------------------------------");
		System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
		System.out.println("-------------------------------------");
		System.out.print("���� : ");
	}
	
	void creatAccount() {
		System.out.println("----------");
		System.out.println("���� ���� �޴�");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();
		
//		if(findAccount(ano) != null)
		
		System.out.println("������ �� : ");
		String owner = sc.next();
		
		System.out.println("�ʱ��Աݾ� : ");
		int balance = sc.nextInt();
		
		System.out.println("���ڸ� �Է� : ");
		double rate = sc.nextDouble();
		
		//�ϼ��ϱ�
		
		Account account = new Account(ano,owner,balance,rate);
		//
		account.rateCal();
		
		
        for(int i = 0;i<acc.length;i++) {
        	if(acc[i] == null) {
        		acc[i] = account;
        		System.out.println("���°� �����Ǿ����ϴ�.");
        		break;
        	}
        	
        	
        }
		
	}
	
	
	//���¸�Ϻ�����

	void accountList() {
		System.out.println("-------------");
		System.out.println("���� ��� ���� �޴�");
		System.out.println("-------------");
		
		System.out.println("���¹�ȣ"+"\t"+"������"+"\t"+"�Աݾ�"+ "\t" +"������"+ "\t" +"��ݰ��ɾ�");
		
	    for(int i = 0;i<acc.length;i++) {
	    	if(acc[i] == null) {
	    		
	    		break;
	    }
	    	System.out.println(acc[i].getAno() + "\t" + acc[i].getOwner() + "\t" + acc[i].getBalance() + "\t" + acc[i].getRate() + "\t" + acc[i].getAmount());
	    }
	}
	  
	//���ݱ��
	void deposit() {
		System.out.println("-------------");
		System.out.println("���� ��� �޴�");
		System.out.println("-------------");
		
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();
		
		System.out.println("���ݾ� : ");
		int balance = sc.nextInt();
		
		//�ϼ���� 
		 Account account = findAccount(ano);
		 
		 if(account == null) {
			 System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
			 return;
		 }
		 account.setBalance(account.getBalance() + balance);
		 account.rateCal(); //���� �� ������ ó���ϱ�
		 System.out.println("���� ó���� ���������� ó���Ǿ����ϴ�.");
	  } 
	    //��ݱ��
	
	     void withdraw() {
	        System.out.println("-------------");
	 		System.out.println("��� ��� �޴�");
	 		System.out.println("-------------"); 
	 		
	 		System.out.println("���¹�ȣ : ");
			String ano = sc.next();
			
			System.out.println("���ݾ� : ");
			int balance = sc.nextInt();
			
			 Account account = findAccount(ano);
			 
			 if(account == null) {
				 System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
				 return;
			 }
			 if(account.getBalance() < balance) {
				 System.out.println("���ݾ��� �����մϴ�.");
				 return;
			 }
			 account.setBalance(account.getBalance() - balance);
			 System.out.println("��� ó���� ���������� ó���Ǿ����ϴ�.");
	     }
	
	
	
		//����ã��
		Account findAccount(String ano) {
			
			Account account = null;
			
			for(int i = 0;i<acc.length;i++) {
				if(acc[i] != null) {
				if(acc[i].ano.equals(ano)) { //.equal() = ����Ÿ���� ���Ҷ� ���  == ����ϸ� �ȵ�
					account = acc[i];
					break;
				}
			}
		}
		return account;
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

