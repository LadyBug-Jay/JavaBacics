package com.syntax.switchcase;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//matching cases must of same data type as a variable in swicth
        // no duplicated case in switch
        //Y y
        char choice='K';
        String answer;

        switch(choice) {
        case 'Y':
            answer="Yes";
            break;
        case 'N':
            answer="No";
            break;
        case 'M':
            answer="Maybe";
            break;
        default:
            answer="Unknown";
            break;
        }

        System.out.println(answer);

        //Limitations of SWITCH CASE

        /* 
         * switch case cannot use logical operators
         * switch case cannot use relational operators
         /

        /
         * CANNOT work with boolean values
         * CE: Cannot switch on a value of type boolean.
         * boolean boo=true;

            switch(boo) {

            }

            CANNOT work with float/double and long
         */
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
