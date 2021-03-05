package AbcShopeInventory;

public class Softwares implements Product{
 int ProductId;
 String ProductName;
 String SerialNumber;
 String LicenseKey;
 String Memory;
 String OS;
	@Override
	public void setProductId(int id) {
		// TODO Auto-generated method stub
		ProductId=id;
	}

	@Override
	public int getProductId() {
		// TODO Auto-generated method stub
		return ProductId;
	}

	@Override
	public void setProductName(String name) {
		// TODO Auto-generated method stub
		ProductName=name;
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return ProductName;
	}

	@Override
	public void setSerialNumber(String serial) {
		// TODO Auto-generated method stub
		SerialNumber=serial;
	}

	@Override
	public String getSerialNumber() {
		// TODO Auto-generated method stub
		return SerialNumber;
	}
	
	public void setLicenseKey(String key)
	{
		LicenseKey=key;
	}
	
	public String getLicenseKey()
	{
		return LicenseKey;
	}
	
	public void setMemory(String mem)
	{
		Memory=mem;
	}
	 public String getMemory()
	 {
		return Memory; 
	 }
	 public void setOS(String os)
	 {
		 OS=os;
	 }
	 public String getOS()
	 {
		 return OS;
	 }

}
