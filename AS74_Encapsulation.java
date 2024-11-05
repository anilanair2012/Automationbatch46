package basicprogram;
class Amazone{
	
	
	private String emailid="abc@gmail.com";

	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	
	
}
public class AS74_Encapsulation extends Amazone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AS74_Encapsulation as=new AS74_Encapsulation();
		as.setEmailid("anila@abc.com");
		System.out.println(as.getEmailid());
	}

	
}
