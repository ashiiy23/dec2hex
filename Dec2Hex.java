import java.util.Scanner;

class Dec2Hex {
    public static int Arg1;
    
    public static void main(String args[]) {
        try {
            // Check if argument is provided
            if (args.length == 0) {
                throw new IllegalArgumentException("Error: No input argument provided");
            }
            
            // Try to parse the input argument
            try {
                Arg1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Input must be an integer value");
                System.exit(1);
            }
            
            // Check for negative numbers
            if (Arg1 < 0) {
                throw new IllegalArgumentException("Error: Input must be a positive integer");
            }
            
            char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            int rem, num;
            num = Arg1;
            String hexadecimal="";
            
            System.out.println("Converting the Decimal Value " + num + " to Hex...");
            
            // Handle zero case separately
            if (num == 0) {
                hexadecimal = "0";
            } else {
                while(num != 0) {
                    rem = num % 16;
                    hexadecimal = ch[rem] + hexadecimal;
                    num = num / 16;
                }
            }
            
            System.out.println("Hexadecimal representation is: " + hexadecimal);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
