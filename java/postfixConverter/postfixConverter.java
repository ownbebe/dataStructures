/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postfixConverter;

/**
 *
 * @author owens
 */
public class postfixConverter {
    
    private static int order(char x){
        switch(x){
            case '+', '-':
                return 0;
            case '*', '/':
                return 1;
            case '^': 
                return 3;
        }
        return -1;
    }
    public static String convertToPostfix(String infix){
        StackInterface<Character> operators = new Stack<>(5);
        char[] ch = infix.toCharArray();
        String postfix = "";
        char topOperator;
        
        for(int i = 0; i < ch.length; i++){
            char nextCharacter = ch[i];
            switch(nextCharacter){
                case '^':
                    operators.push(nextCharacter);
                    
                    break;
                case '*', '/', '+', '-':
                    while(!operators.isEmpty() && order(nextCharacter) <= order(operators.peek()) ){
                        postfix += operators.peek();
                        operators.pop();
                    }
                    operators.push(nextCharacter);
                    
                    break;
                case '(':
                    operators.push(nextCharacter);
                    
                    break;
                case ')':
                    topOperator = operators.pop();
                    while(topOperator != '('){
                        postfix += topOperator;
                        topOperator = operators.pop();
                    }
                    
                    break;
                default: 
                    postfix += nextCharacter;
                    break;
            }
        }
        while(!operators.isEmpty()){
            char top = operators.pop();
            postfix += top;
        }
        return postfix;
    }
}
