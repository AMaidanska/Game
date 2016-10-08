package com.nana;

/**
 * Created by NaNa on 10/7/2016.
 */
public enum LabelConstants {
    INFO("Type number from 0 to 99"),
    WRONG_NUMBER("Your number is > 99 or < 0. Please type number from 0 to 99"),
    WRONG_INPUT_TYPE(" Oops, you typed word. Type number please!"),
    WIN_MSG(" You won!"),
    LOSE_MSG(" Oops. You lose, but you can try again!");

    String label;

    LabelConstants(String label){
       this.label = label;
    }
}
