package inception;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Stack;
import javax.imageio.IIOException;

public class Inception {

    public static void main(String[] args) {
        Scanner input=null;
        try{input=new Scanner(Paths.get("inception.in"));}
        catch(IOException io){System.out.println("io");}
        int t=input.nextInt();
        Stack stack=new Stack();
        for(int i=0;i<t;i++){
            String s=input.next();
            if(s.equals("Sleep"))
                stack.push(input.next());
            else if(s.equals("Kick")){
                    if(stack.empty())
                        continue;
                    stack.pop();}
                else if(s.equals("Test")&&!(stack.empty()))
                          System.out.println(stack.peek());
                    else if(stack.empty())
                        System.out.println("Not in a dream");
        }


    }
    
}
