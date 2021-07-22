package day11_Switch;

public class TernaryPractice {

    public static void main(String[] args) {
        /*
        1. Given two values: yearly salary and credit score determine if you can get a loan.
			    To be approve for the loan, print: "Loan Approved":
				        Salary: above 60,000
				        Credit Score: above 650
			    	Otherwise print: "Loan Denied"
			    	NOTE: MUST APPLY TERNARY
         */
        double salary = 90_000;
        int creditScore = 720;
        String result =  ( salary >= 60000 && creditScore >= 650) ? "Loan Approved" : "Loan Denied"  ;

        /*
        if( salary >= 60000 && creditScore >= 650){ //if the person is eligibel for loan
            result  = "Loan Approved";
        }else{ //if the person is not eligible for loan
            result = "Loan Denied";
        }
         */

        System.out.println("result = " + result);

        System.out.println("------------------------------------------------------------------");
        /*
        2. Given a sport you play at the community center you will have to pay some entrance fee.
				    Soccer or Tennis fee is: 100
				    Otherwise fee is: 50
				   NOTE: MUST APPLY TERNARY
         */

        String sport = "Golf";
        int price = (sport == "Soccer" || sport == "Tennis" ) ? 100 : 50 ;
        System.out.println("price = " + price);

        System.out.println("----------------------------------------------------------------");
        /*
        3. write a program that checks for the bigger of 3 numbers.
		you get 3 int variables with different values: n1 , n2 and n3
			if n1 is biggest output: "n1 is bigger"
			if n2 is biggest output: "n2 is bigger"
			if n3 is biggest output: "n3 is bigger"
			NOTE: MUST APPLY TERNARY
         */

        int n1 = 100,
                n2 = 500,
                n3 = 300;

        String result2 = (n1 > n2 && n1 > n3)?  n1+" is bigger"
                :(n2 > n1 && n2 >n3)? n2+" is bigger"
                : n3+" is bigger"  ;

        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------------------------");
        int number = 12;
        String name = "";

        if(number >= 1 && number<= 12){

            name =   (number == 1)? "Jan" :(number==2)? "Feb" :(number == 3)? "Mar" :(number==4)?"Apr"
                    :(number==5)?"May" :(number==6)?"Jun" :(number==7)? "Jul" :(number==8)? "Aug"
                    :(number ==9)? "Sep" :(number==10)? "Oct" :(number==11)?"Nov" : "Dec";

            //   11 ? and 11 :

        }else{
            name = "Invalid";
        }




    }
/*
06/07/2021
Topics: Switch Statement

package name: day11_Switch

Warmmup tasks:
	1. Given two values: yearly salary and credit score determine if you can get a loan.

			    To be approve for the loan, print: "Loan Approved":
				        Salary: above 60,000
				        Credit Score: above 650
			    	Otherwise print: "Loan Denied"

			    	NOTE: MUST APPLY TERNARY

	2. Given a sport you play at the community center you will have to pay some enterance fee.

				    Soccer or Tennis fee is: 100
				    Otherwise fee is: 50

				   NOTE: MUST APPLY TERNARY

	3. write a program that checks for the bigger of 3 numbers.
		you get 3 int variables with different values: n1 , n2 and n3
			if n1 is biggest output: "n1 is bigger"
			if n2 is biggest output: "n2 is bigger"
			if n3 is biggest output: "n3 is bigger"

			NOTE: MUST APPLY TERNARY

	4. In Cybertek we have three batch types: US morning, US evening, EU.
		Depending on a batch type (String) print information about the batch.

		First figure out is is a US batch or EU batch

		    - for US batches:

		        > Figure out is it a morning batch or evening batch
		            > morning - print: Class times are 10-5 EST. M, T, Th, F.
		            > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

		    - for EU batches:

		        > print: Class times are  10-5 EST. M, T, W, Th, F.

        If Batch type is not EU or US, print Invalid Batch

        		NOTE: MUST APPLY NESTED IF

	5. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

                  NOTE: MUST APPLY NESTED IF


If statements short quiz due by 12 pm






 if block  					()?
 else if block  			:()?
 else block    				:

{}

switch statements: switch, case, default, break

	syntax:
		switch(Data){ 5 ,

			case data1:
					statement1;
					break;  // closes the block and exits the switch

			case data2:
					statement2;
					break;

			case data3:
					statement3;
					break;

			default:
					statemnt4
					break;

		}

		case value MUST match with switch' dataType and Unique

		break: used for exiting the switch
				if we dont give the break statement in case blocks, the next block gets executed until reaches break statement or closing curly braces of switch

		default: gets executed if none of the cases are matched
				there can only be one default block

		4 data types cannot be passed ins switch:
				long, double, float, boolean


		|| logic we can use in the switch by declaring the cases back to back with break statement



  10
  10L



in if: != , ==, >= , <=, >, < ....


lunch break:
	1. StatusCode:
	2. NameOfMonth: 1~12

	3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

	4. Given two double variables n1, n2 and a char variable named operator. use swith statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /



&&, ||




 */
}