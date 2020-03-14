package simpleinterest;

public class SimpleInterest {

	public static float calculateSimpleInterst(int PrincipleAmount,float TimeinYears,float Rateperannum)
	{
		
		float interest=(((PrincipleAmount)*(TimeinYears)*(Rateperannum))/100);
		
		return interest;
	}

}
