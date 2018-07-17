package level2;

public class PaintWizard {
	private static final String[] PAINTNAME= {"CheapoMax","AverageJoes","DuluorousPaints"};
	private static final double[] PAINTPRICE= {19.99,17.99,25.00};
	private static final int[] PAINTLITRES= {20,15,10};
	private static final int[] PAINTCOVERAGE={10,11,20};
	private static final int 	CHEAPOMAX=0,
			AVERAGEJOES=1,
			DULUXOROUSPAINTS=2;

	public PaintWizard() {
		System.out.println(PAINTNAME[CHEAPOMAX]+": £"+PAINTPRICE[CHEAPOMAX]+" for "+PAINTLITRES[CHEAPOMAX]+"L");
		System.out.println(PAINTNAME[AVERAGEJOES]+": £"+PAINTPRICE[AVERAGEJOES]+" for "+PAINTLITRES[AVERAGEJOES]+"L");
		System.out.println(PAINTNAME[DULUXOROUSPAINTS]+": £"+PAINTPRICE[DULUXOROUSPAINTS]+" for "+PAINTLITRES[DULUXOROUSPAINTS]+"L\n");
	}
	
	public String getLeastWaste() {
		int[] waste=new int[PAINTNAME.length];
		int bestPaintID=0;
		for (int i=0;i<PAINTNAME.length;i++) {
			waste[i]=(int)((PAINTCOVERAGE[i]^2)%PAINTLITRES[i]);
			System.out.println(waste[i]);
		}
		for (int i=0;i<PAINTNAME.length;i++) 
			if (waste[i]<waste[bestPaintID]) {
				bestPaintID=i;
			}
		return PAINTNAME[bestPaintID]+" wastes the least paint";
	}
	
	

	public String getCheapestBrand() {
		double[] cost=new double[PAINTNAME.length];
		int cheapPaintID=0;
		for (int i=0;i<PAINTNAME.length;i++) {
			cost[i]=(double)((int)((PAINTCOVERAGE[i]^2)%PAINTLITRES[i]))/PAINTPRICE[i];
			System.out.println(cost[i]);
		}
		for (int i=0;i<PAINTNAME.length;i++) 
			if (cost[i]<cost[cheapPaintID]) {
				cheapPaintID=i;
			}
		return PAINTNAME[cheapPaintID]+" works out the cheapest";
	}
}
