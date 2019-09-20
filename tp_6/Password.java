package tp_6;

public class Password {
	private String password;
	private boolean isStrong;
	private int size;
	
	
	
	public String getPassword() {
		return password;
	}



	public boolean isStrong() {
		return isStrong;
	}



	public int getSize() {
		return size;
	}



	public Password(int size) {
		String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] capLetters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		int min=0;
		int may=0;
		int num=0;
		this.password="";
		
		
		for(int i=0;i<size;i++) {
			int number,number2;
			number=(int)(Math.random()*3);
			if(number==2) {
				number2=(int)(Math.random()*9);
				password=password+numbers[number2];
				num++;
			}
			else if(number==1) {
					number2=(int)(Math.random()*25);
					password=password+capLetters[number2];
					may++;
			}
			else {
				number2=(int)(Math.random()*25);
				password=password+letters[number2];
				min++;
			}
		}
		
		this.size=size;
		
		if(num>5 && min>1 && may>2) {
			this.isStrong=true;
		}
		else {
			this.isStrong=false;
		}
	}

	

	
	
}