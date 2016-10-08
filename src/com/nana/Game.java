package com.nana;

class Game {

     static String parseNumber (String text){
         int number;

            try {
                 number = Integer.parseInt(text);
                if (number>99 || number < 0){
                   return LabelConstants.WRONG_NUMBER.label;
                }
            }
            catch (NumberFormatException e){
                return LabelConstants.WRONG_INPUT_TYPE.label;
            }
         return versus(number);
        }

    private static String versus(int number){
     int randomNumber = (int) (Math.random() *100);
        String text;
       if (randomNumber == number){
           text = number + " = " + randomNumber + LabelConstants.WIN_MSG.label;
           return text;
       }
       else {
           text = number + " vs " + randomNumber + LabelConstants.LOSE_MSG.label;
           return text;
       }
    }
}
