class TNEB {

	
	public static void main(String[] arg)
{
		
		int PreviousUnit;
		int CurrentUnit;
		int ConsumedUnit;
		double TotalAmount;
	PreviousUnit=3602;
	CurrentUnit=4000;
	ConsumedUnit=CurrentUnit-PreviousUnit;
	if(ConsumedUnit<=100)
	{
		System.out.println("FREE");
	}
	else
	{
		ConsumedUnit=ConsumedUnit-100;
		TotalAmount=ConsumedUnit*5.50;
		System.out.println(TotalAmount);
						
	}
}
}