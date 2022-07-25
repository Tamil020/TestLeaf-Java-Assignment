package week1.day1;

public class Mobile {
	public void sendMessage() {
	System.out.println("sending message");
	}
	public void shareDocument() {
	System.out.println("sharing document");
	}
	public void call() {
	System.out.println("dailing a call");
     
	}public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.sendMessage();
		mob.shareDocument();
		mob.call();
	}
	}


