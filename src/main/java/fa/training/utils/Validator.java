/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	//check email
	private static final String VALID_EMAIL_REGEX ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]"
							+ "+\\.[a-zA-Z]{2,6}$";
	public static boolean isEmail(String email) {
		Pattern pattern = Pattern.compile(VALID_EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	
	// check gender
	public static boolean isGender(byte gender) {
		if(gender==0 || gender ==1) {
			return true;
		}else {
			return false;
		}
	}

}
