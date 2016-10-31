import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class StudentAverages {

	public static void main(String[] args)throws IOException {
	Scanner nTake=new Scanner(new File("E:\\StudentAverages\\StudentScores.in"));
	int maxIndx=-1;
	String text[]=new String[1000];
	while(nTake.hasNext())
		{
		maxIndx++;
		text[maxIndx]=nTake.nextLine();
		}
	
	nTake.close();

	int sum = 0;
	int average = 0;
	for(int n=0;n<=maxIndx;n++)
		{
		Scanner inArray=new Scanner(text[n]);
		String name=inArray.next();
		sum=0;
		average = 0;
		while(inArray.hasNextInt()) {
			average+=inArray.nextInt();
			sum++;	
			}
		System.out.println(name+": "+(average/sum));
		}
	}
}