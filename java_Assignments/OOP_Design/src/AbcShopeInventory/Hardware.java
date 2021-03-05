package AbcShopeInventory;

public class Hardware implements Product {
	 int ProductId;
	 String ProductName;
	 String SerialNumber;
	 String dimentions;
	 String brand;
	 String capacity;
	 String PowerSupplyRequirement;
	 String BatteryBackup;
	 
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
		
		public void setbrand(String key)
		{
			brand=key;
		}
		
		public String getbrand()
		{
			return brand;
		}
		
		public void setpowersupply(String req)
		{
			PowerSupplyRequirement=req;
		}
		 public String getpowersupply()
		 {
			return PowerSupplyRequirement; 
		 }
		 public void setCapacity(String cap)
		 {
			 capacity=cap;
		 }
		 public String getCapacity()
		 {
			 return capacity;
		 }
		 
		 public void setdimentions(String cap)
		 {
			 dimentions=cap;
		 }
		 public String getdimention()
		 {
			 return dimentions;
		 }

		 public void setbatterybackup(String cap)
		 {
			 BatteryBackup=cap;
		 }
		 public String getbatterybackup()
		 {
			 return BatteryBackup;
		 }


}
