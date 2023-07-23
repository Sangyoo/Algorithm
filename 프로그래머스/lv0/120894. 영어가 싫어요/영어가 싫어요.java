import java.util.*;

class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();
        while(numbers.length() != 0){
            switch(numbers.charAt(0)){
                case 'z': 
                    sb.append("0");
                    numbers = numbers.substring(4);
                    break;
                case 'o' : 
                    sb.append("1");
                    numbers = numbers.substring(3);
                    break;
                case 't':
                    if(numbers.charAt(1) == 'w'){
                        sb.append("2");
                        numbers = numbers.substring(3);
                    }
                    else{
                        sb.append("3");
                        numbers = numbers.substring(5);
                    }
                    break;
                case 'f':
                    if(numbers.charAt(1) == 'o'){
                        sb.append("4");
                        numbers = numbers.substring(4);
                    }
                    else{
                        sb.append("5");
                        numbers = numbers.substring(4);
                    }
                    break;
                case 's':
                    if(numbers.charAt(1) == 'i'){
                        sb.append("6");
                        numbers = numbers.substring(3);
                    }
                    else{
                        sb.append("7");
                        numbers = numbers.substring(5);
                    }
                    break;
                case 'e': 
                    sb.append("8");
                    numbers = numbers.substring(5);
                    break;
                case 'n': 
                    sb.append("9");
                    numbers = numbers.substring(4);
                    break;
            }
        }
        
        // numbers.replaceAll("zero", "0");
        // numbers.replaceAll("one", "1");
        // numbers.replaceAll("two", "2");
        // numbers.replaceAll("three", "3");
        // numbers.replaceAll("four", "4");
        // numbers.replaceAll("five", "5");
        // numbers.replaceAll("six", "6");
        // numbers.replaceAll("seven", "7");
        // numbers.replaceAll("eight", "8");
        // numbers.replaceAll("nine", "9");
        return Long.valueOf(sb.toString());
        
    }
}