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
 *Guitar Manufacturer that can be for Rick's Guitar
 */
public enum Manufacturer {

    FENDER,
    MARTIN,
    GIBSON,
    COLLINGS,
    OLSON,
    RYAN,
    PRS;

    Manufacturer() {
    }

    @Override
        public String toString() {

            switch (this) {
                case FENDER: return name().toLowerCase();
                case MARTIN: return name().toLowerCase();
                case GIBSON: return name().toLowerCase();
                case COLLINGS: return name().toLowerCase();
                case OLSON: return name().toLowerCase();
                case RYAN: return name().toLowerCase();
                case PRS: return name().toLowerCase();
            }

            return String.valueOf(this);
        }
}

