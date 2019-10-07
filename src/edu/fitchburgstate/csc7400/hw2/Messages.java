/**
 * Class: Object-Oriented Design and Analysis

 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2019-09-20
 */
package edu.fitchburgstate.csc7400.hw2;

import java.util.MissingResourceException;

import java.util.ResourceBundle;

/**
 * Messages is the resource bundle handler that will be used for transaction
 * 
 * @author omontalv
 *
 */
public class Messages {
	/**
	 * Returns a resource string given a resource key
	 * @param key the resource key
	 * @return the string for this resource key
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	/**
	 * Name of resource file we are using
	 */
	private static final String BUNDLE_NAME = "edu.fitchburgstate.csc7400.hw2.messages"; //$NON-NLS-1$

	/**
	 * The static resource bundle
	 */
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	/**
	 * Constructor - private because this is a utility class
	 */
	private Messages() {
	}

}
