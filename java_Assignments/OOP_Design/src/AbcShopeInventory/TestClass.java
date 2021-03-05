package AbcShopeInventory;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Softwares s=new Softwares();
		Hardware h=new Hardware();
		
		String  sinfo[][]=new String[6][2];
		String [][] hinfo= new String[8][2];
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<2;j++)
			{
				sinfo[i][j]=new String();
			}
		}
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<2;j++)
			{
				hinfo[i][j]=new String();
			}
		}
		
		sinfo[0][0]="ProductId:";
		sinfo[1][0]="ProductName:";
		sinfo[2][0]="SerialName:";
		sinfo[3][0]="LicenseKey:";
		sinfo[4][0]="Memory:";
		sinfo[5][0]="OS:";
		
		hinfo[0][0]="ProductId:";
		hinfo[1][0]="ProductName:";
		hinfo[2][0]="SerialName:";
		hinfo[3][0]="Brand:";
		hinfo[4][0]="Power Supply:";
		hinfo[5][0]="Capacity:";
		hinfo[6][0]="Dimention:";
		hinfo[7][0]="Batterybackup:";
		
		s.setProductId(10001);
		s.setProductName("Microsoft Office");
		s.setSerialNumber("k123");
		s.setLicenseKey("QERW1234jk");
		s.setMemory(null);
		s.setOS(null);
		
		h.setProductId(1002); 
		h.setProductName("Laptop");
		h.setSerialNumber("k234");
		h.setbrand("Dell");
		h.setpowersupply("10v");
		h.setCapacity("2TB");
		h.setdimentions("1023*1000");
		h.setbatterybackup("2 HR");
		
		hinfo[0][1]=String.valueOf(h.getProductId()); 
		hinfo[1][1]=h.getProductName();
		hinfo[2][1]=h.getSerialNumber();
		hinfo[3][1]=h.getbrand();
		hinfo[4][1]=h.getpowersupply();
		hinfo[5][1]=h.getCapacity();
		hinfo[6][1]=h.getdimention();
		hinfo[7][1]=h.getbatterybackup();	
		 
		sinfo[0][1]=String.valueOf(s.getProductId());
		sinfo[1][1]=s.getProductName();
		sinfo[2][1]=s.getSerialNumber();
		sinfo[3][1]=s.getLicenseKey();
		sinfo[4][1]=s.getMemory();
		sinfo[5][1]=s.getOS();
		
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(sinfo[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(hinfo[i][j]+" ");
			}
			System.out.println();
		}


	}

}
