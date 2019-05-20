public class CountCharacter    
{    
    public static void main(String[] args) {    
        String string = "The best of both worlds";    
        
        string=string.replaceAll(" ", "");
        char[] charArray = string.toCharArray();
        System.out.println(charArray.length);
        
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
        System.out.println(string.length());
        
       
    }    
}     