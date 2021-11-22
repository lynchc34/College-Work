package bankCustomer;

public class bankCustomer {

	private int accountNumber;
	private String customerName;
	private String customerAddress;
	private int customerDateOfBirth;

	public int getAccountNumber ()
	{
		return accountNumber;
	}

	public void setAccountNumber (int accNumber)
	{
		accountNumber= accNumber;
	}

	public String getCustomerName ()
	{
		return customerName;
	}

	public void setCustomerName (String name)
	{
		customerName = name;
	}

	public String getCustomerAddress ()
	{
		return customerAddress;
	}

	public void setCustomerAddress (String customerAddr)
	{
		customerAddress = customerAddr;
	}

	public int getCustomerDateOfBirth ()
	{
		return customerDateOfBirth;
	}

	public void setCustomerDateOfBirth (int dOB)
	{
		customerDateOfBirth = dOB;
	}

	public static void main (String[]  args)
	{
		bankCustomer cust1 = new bankCustomer();

		cust1.setAccountNumber(12345);
		cust1.setCustomerName("John Smith");
		cust1.setCustomerAddress("Beverly Hills");
		cust1.setCustomerDateOfBirth(290271);
	}
}