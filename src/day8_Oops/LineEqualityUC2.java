package day8_Oops;

public class LineEqualityUC2 {

	public static void main(String[] args) {
		System.out.println( "Welcome to Line Comparison Computation" );
        int x1=0;
        int y1=0;
        int line1x1=0;
        int line1y1=0;

        int x2=0;
        int y2=8;
        int line1x2=0;
        int line1y2=8;

        double LengthOfLine  = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The lenght of line is :"+ LengthOfLine );
        Double LengthOfLine1  = Math.sqrt(Math.pow((line1x2-line1x1),2) + Math.pow((line1y2-line1y1),2));
        System.out.println("The lenght of line is :"+ LengthOfLine1 );

        int line2x1=0;
        int line2y1=0;

        int line2x2=0;
        int line2y2=8;

        Double LengthOfLine2  = Math.sqrt(Math.pow((line2x2-line2x1),2) + Math.pow((line2y2-line2y1),2));

        System.out.println("The lenght of line is :"+ LengthOfLine2 );

        if ( LengthOfLine1.equals(LengthOfLine2)  ) {
        	System.out.println("The Two Line are equal");
        }
        else
        {
        	System.out.println("The Two Lines Are Not Equal");
        }
	}

}
