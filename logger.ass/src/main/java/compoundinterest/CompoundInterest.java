package compoundinterest;

public class CompoundInterest {
	public static float CalculateCompoundInterest(int PrincipleAmount,float TimeinYears,float Rateperannum)
	{
		
		float compoundinterest=(float) ((PrincipleAmount)*(Math.pow(1.0+(Rateperannum/100.0),TimeinYears))-PrincipleAmount);
		return compoundinterest;
		
	}

}
