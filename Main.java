import javax.swing.JLabel;

/**
 * Quick-print template for Employment Authorization Cards
 * @author Chele
 */
public class Main
{
	public static void main(String[] args)
	{
		//CONSTANTS SECTION
		//FINAL String ANSI_BG_RED = "\u201B[41m";
		final String TITLE_USA = "UNITED STATES OF AMERICA";

		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
		char sex;

		//parts of fields
		String birthMonth;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear,
		validDay, validMonth, validYear, expireMonth, expireDay, expireYear;

		//INPUT SECTION
		surname = "TAJIRI";
		givenName = "SATOSHI";
		category = "C09";
		cardNum = "A2-B30-PK-2026";
		birthCountry = "JAPAN";
		termsAndConditions = "PK ETHICS AGREEMENT";
		sex = 'M'; //note sigle quotes - due to symbol not phrase

		birthMonth = "MAY";
		uscisNum1 = 7452;
		uscisNum2 = 7452;
		uscisNum3 = 24888;
		birthDay = 22;
		birthYear = 2013;
		validDay = 22;
		validMonth = 05;
		validYear = 2025;
		expireMonth = 01;
		expireDay = 01;
		expireYear = 2030;

		//INPUT SECTION
		//N/A
		//CALCULATION SECTION
		//N/A
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("║        	 " + TITLE_USA + "    		                                       ║");
		System.out.println("║                              				   EMPLOYMENT AUTHORIZATION CARD.      ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⠛⠉⠀⡀⢉⠉⠙⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ 			                       ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⢀⠠⠐⡀⠂⠠⢁⠐⠠⢈⠐⠠⠂⠄⡀⠉⢛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ Surname                                     ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⣿⠋⠀⠄⡁⠂⠄⠡⠐⠀⡁⠂⠌⡐⢀⠊⠄⡁⠂⠄⠡⠈⢷⡙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ " + surname + "                                      ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⡇⠀⠌⡐⠠⠁⠌⡠⠁⠀⠠⢁⠂⠐⡠⢈⠐⠠⠁⢌⠠⠁⠈⣧⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ Given Name                                  ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⠀⠌⡐⠠⠁⠌⠀⠀⠀⠀⠀⠀⠀⠀⠐⠠⠈⠄⡁⠂⠄⡁⠂⢹⡆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ " + givenName + "                                     ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⠀⠰⢀⠁⡈⠀⠀⠀⢠⠀⡀⢀⠀⠀⡈⢀⠱⠈⡀⠁⠆⡀⢡⠸⡇⠹⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ USCIS#           Category  Card#            ║");
		System.out.println("║ ⣿⣿⣿⣿⡗⠀⡁⢂⠐⠀⢀⣠⣬⣤⡤⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⠤⠀⠀⠀⠀⠀⠀⠈⠙⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ " + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "  " + category + "       " + cardNum +"   ║");
		System.out.println("║ ⡿⠿⠟⠋⠀⠀⠀⣀⣈⠉⠻⠿⣿⠇⢀⡄⠀⠀⠀⢀⣼⠿⠋⡁⢠⣤⡄⠀⠀⠀⠀⠀⠀⠀⢀⠈⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ Country of Birth                            ║");
		System.out.println("║ ⣿⣶⡶⠖⠀⠀⠀⢸⣿⡟⣠⣖⢦⠀⣀⢿⠂⠀⠀⡐⣄⣡⢰⢩⢻⣆⢻⣿⡄⠀⠀⠀⠀⠀⠀⠀⢀⣄⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿ " + birthCountry + "                                       ║");
		System.out.println("║ ⡿⢉⣠⠀⠀⠀⠀⠈⢿⡇⣿⠘⠈⣦⣿⣿⡆⣀⣾⣿⣿⣿⢸⠘⢸⣿⡈⡿⠁⢀⠀⠀⠀⠀⠀⠀⠀⢉⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿ Terms and Conditions                        ║");
		System.out.println("║ ⣿⡿⠁⠀⠀⠀⣘⡐⠘⠁⣿⡇⠀⣝⣿⣿⣿⣿⣿⣿⣿⣿⣸⡀⣼⣿⢁⡡⢐⣁⡃⠀⠀⠀⠀⠀⡐⢩⣭⣍⢻⣿⣿⣿⣿⣿⣿⣿ " + termsAndConditions + "                         ║");
		System.out.println("║ ⣿⠔⠁⠀⠀⠀⠸⠃⡄⣶⡘⡛⢐⠋⣿⣿⣟⠀⣿⣿⣿⣿⠦⠀⠀⣀⣾⠀⢸⣿⣿⣆⠀⠀⠀⠙⣰⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿ Date of Birth   Sex                         ║");
		System.out.println("║ ⣟⠀⠀⠀⠀⠀⠀⠑⠀⢘⣅⣠⣴⣶⡿⠿⠟⠛⢛⡉⣉⢄⠀⣶⣾⡟⣽⡄⠸⣿⣿⣿⡀⠏⠝⠀⢿⣿⣿⡏⠀⠙⠿⣿⡿⠿⣿⣿ " + birthDay + " " + birthMonth + " " + birthYear + "     " + sex + "                           ║");
		System.out.println("║ ⣿⣿⣿⣷⣶⣶⣤⣄⣀⠸⢿⣿⣿⣿⣷⡀⠸⣘⠦⡱⢎⠂⣼⣿⡿⢡⡟⠁⢀⡙⠿⠟⠁⠀⠠⢀⠈⠻⠋⠀⢀⠂⠀⣠⣾⣿⠄⢿ Valid From:   " + validMonth + "/" + validDay + "/" + validYear +"		       ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣍⡛⢿⣿⣿⣄⠑⠎⠑⣠⣾⣿⠟⠡⠚⠀⢠⠉⠀⡀⠠⠐⠈⠄⠂⠀⠄⢀⠂⠄⠂⣼⣿⣿⠟⣡⣾ Card Expires:   " + expireMonth + "/" + expireDay + "/" + expireYear +"		       ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣬⠙⠿⢿⣶⣿⡿⠟⡁⢠⣶⠅⠀⠄⡀⢂⠀⠡⠀⠀⢀⣀⡀⠀⠀⠂⡐⠀⠈⠉⠁⠸⣿⣿ 		                       	       ║");
		System.out.println("║ ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢛⣩⣤⣶⠀⣦⣤⣤⡴⠞⣡⣾⣿⠀⠀⠀⠄⠀⠀⠀⠂⠀⡇⠷⢸⠆⠐⠢⠠⠄⠄⠀⣠⣤⣭⡛        NOT VALID FOR REENTRY TO U.S.	       ║");
		System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════╝");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
