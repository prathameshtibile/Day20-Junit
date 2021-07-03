/**
 *  @author PRATHAMESH TIBILE
 * @since 3-7-21
 * validate Email ID using Junit test:
 */

package Day20_Junit;

import java.util.regex.Pattern;

public class ValidateEmail {
	 public boolean validateEmail(String email) {
	        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
	    }
}
