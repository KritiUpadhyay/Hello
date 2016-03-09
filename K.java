import java.util.*;
import java.io.File;
public class K {

	public static void main(String[] args) {
		Resident[] r =new Resident[100];
		int i=0;
		try
		{
			
		
		File file =new File("this.txt");
		
		Scanner fc=new Scanner(file);
		while(fc.hasNextLine())
		{
			String n;
			String sex;
			String address;
			
			int a;
			String auth;
			n=fc.nextLine();
			auth=fc.nextLine();
			sex=fc.nextLine();
			a=fc.nextInt();
			fc.nextLine();
			address=fc.nextLine();
			r[i]=new Resident(n,sex,address,a,auth);
			i++;
			
		}

	}catch ( Exception e){
		e.printStackTrace();
	}
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int flag=0;
			System.out.println("Enter 0 to exit");
			String st=sc.nextLine();
			for(int k=0;k<i;k++)
			{
				if (r[k].name.equals(st))
					
				{
					if(r[k].sex.equals("female")&&r[k].auth==true)
					{
						flag++;
						int c=0;
						for(int e=0;e<i;e++)
						{
							if(r[e].age>r[k].age)
								c++;
						}
						System.out.println(c +" are elder");
					}
					 if(r[k].sex.equals("male")&& r[k].auth==true)
					{
						 flag++;
						int max=r[0].age;
						int e;
						for(e=0;e<i;e++)
						{
							if(r[e].age>max && r[e].sex.equals("male"))
								max=r[e].age;
								
						}
						System.out.println("The oldest male'age is" + r[e].age);
					}
					 if(r[k].age<18 && r[k].auth==true)
					{
						 flag++;
						System.out.println("enter the address");
						String se=sc.nextLine();
						int e;
						for(e=0;e<i;e++)
						{
							if(r[e].address.equals(se))
							{
								
								System.out.println(r[e].name);
								continue;
							}
								
						}
					
					}
					 if(flag==0)
						 System.out.println("Invalid choice");
				}
				
			}
			if(st.equals("0"))
			break;
		
			
		}

}
}