package com.DiogoSant0s.DesignPattern;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(drink.getText().charAt(i))){
                str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
            if(Character.isUpperCase(drink.getText().charAt(i))){
                str.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        drink.setText(str.toString());
    }
    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
