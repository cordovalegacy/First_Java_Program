import static java.lang.System.out; // !allows us to shorten print statement

public class First{ // !define class

    public static int addNums(int a, int b){ // !define return type
        out.println(a+b); // !print statement
        return a + b; // !ensure return matches return type
    }

    public static void main(String[] args){ // !CLI, also parent function
        String name = "Brendan"; 
        String age = "27";
        String hometown = "Henderson, NV";
        out.println("My name is: " + name);
        out.println("My age is: " + age);
        out.println("My hometown is: " + hometown);
        out.println(addNums(5, 10)); // !how to invoke functions

        // !how to call main function
        for(String var: args){out.println("This is a: " + var);}
    }

}

