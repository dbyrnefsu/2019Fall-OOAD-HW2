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
     * Guitar Woods that can be used
     */

public enum Wood {

    BRAZILLIAN_ROSEWOOD,
    INDIAN_ROSEWOOD,
    MAHOGANY,
    MAPLE,
    COCOBOLO,
    CEDAR,
    ADIRONDACK,
    ALDER,
    SITKA;

    @Override
    public String toString() {

        switch (this) {
            case INDIAN_ROSEWOOD:
            return name().toLowerCase();
            case BRAZILLIAN_ROSEWOOD:
                return name().toLowerCase();
            case MAHOGANY:
                return name().toLowerCase();
            case MAPLE:
                return name().toLowerCase();
            case COCOBOLO:
                return name().toLowerCase();
            case CEDAR:
                return name().toLowerCase();
            case ADIRONDACK:
                return name().toLowerCase();
            case ALDER:
                return name().toLowerCase();
            case SITKA:
                return name().toLowerCase();
            }

            return String.valueOf(this);
        }
}
