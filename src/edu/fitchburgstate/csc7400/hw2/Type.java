/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 *
 * Date: 2018-09-03
 *
 * Students: @Nodir Nabiev
 *          : @Chandralekha
 * Version 1.0
 * ModifiedDate: 2019-10-07
 */

package edu.fitchburgstate.csc7400.hw2;

/**
 *
 *Guitar Type that can be for Rick's Guitar
 */
public enum Type {

    ACOUSTIC,
    ELECTRIC;

    @Override
    public String toString() {

        switch (this) {
            case ACOUSTIC:
                return name().toLowerCase();
            case ELECTRIC:
                return name().toLowerCase();

        }

        return String.valueOf(this);
    }
}
