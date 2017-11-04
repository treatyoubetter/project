import java.util.*;


public class DataAnalyze1 
{
	public static void main(String[] args)
	{
		final Integer numTrail=4;
		Scanner keyboard=new Scanner(System.in);
		Integer sampSize,i,j,avg1,avg2,avg3,avg4,minavg,maxavg;
		
		ArrayList<Integer> sampTrail1=new ArrayList<Integer>();
		ArrayList<Integer> sampTrail2=new ArrayList<Integer>();
		ArrayList<Integer> sampTrail3=new ArrayList<Integer>();
		ArrayList<Integer> sampTrail4=new ArrayList<Integer>();
		
		
		try
		{
			System.out.print("Please enter the sample size : ");
			sampSize=Integer.parseInt(keyboard.nextLine());
			
			for(i=0;i<numTrail;i++)
			{
				System.out.println("Enter numbers for Trial "+i);
				
				for(j=0;j<sampSize;j++)
				{
					
					System.out.print("Enter sample #"+j+" : ");
					if(i==0)
						sampTrail1.add(Integer.parseInt(keyboard.nextLine()));
					if(i==1)
						sampTrail2.add(Integer.parseInt(keyboard.nextLine()));
					if(i==2)
						sampTrail3.add(Integer.parseInt(keyboard.nextLine()));
					if(i==3)
						sampTrail4.add(Integer.parseInt(keyboard.nextLine()));
					
					
				}
				System.out.println();
			}
			
			avg1=findAverage(sampTrail1);
			avg2=findAverage(sampTrail2);
			avg3=findAverage(sampTrail3);
			avg4=findAverage(sampTrail4);
			
			minavg=avg1;
			if(minavg>avg2)minavg=avg2;
			if(minavg>avg3)minavg=avg3;
			if(minavg>avg4)minavg=avg4;
			
			maxavg=avg1;
			if(maxavg<avg2)maxavg=avg2;
			if(maxavg<avg3)maxavg=avg3;
			if(maxavg<avg4)maxavg=avg4;
			
			System.out.println("\n\tSample #\tTrail 1\t\tTrail 2\t\tTrail 3\t\tTrail 4");
			for(i=0;i<sampSize;i++)
			{
				System.out.println("\t"+i+"\t\t"+sampTrail1.get(i)+"\t\t"+sampTrail2.get(i)+"\t\t"+sampTrail3.get(i)+"\t\t"+sampTrail4.get(i));
			}
			System.out.println("\t------------------------------------------------------------------------");			
			
			System.out.println("Average : \t\t"+avg1+"\t\t"+avg2+"\t\t"+avg3+"\t\t"+avg4);
			System.out.println("\nMin Average : "+minavg);
			System.out.println("Max Average : "+maxavg);
			
			if(minavg==maxavg)
				System.out.println("\nThe trials match EXACTLY!");
			else if (maxavg< 2 * minavg)
				System.out.println("\nThe trials concur with each other!");
			else
				System.out.println("\nThe trials do not concur!");
			
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex.getMessage());
		}		
		
	}
	
	public static Integer findAverage(ArrayList<Integer> alist)
	{
		Integer j,sum=0;
		for(j=0;j<alist.size();j++)
		{
			sum+=alist.get(j);
		}
		return sum/alist.size();
		
	}
	
}

