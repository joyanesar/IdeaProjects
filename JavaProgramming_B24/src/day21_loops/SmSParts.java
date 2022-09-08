package day21_loops;

public class SmSParts {
    /*
    [SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
Separate these parts and print them separately: Sender: actualSender
Number: actualNumber Message: actualMessage”


       1)we need to find all the index
       2)  sender find the index of < and >
       3) number find the index of the [ and ]

       4) with our indexes we can now pull from the string with substring
     */
    public static void main(String[] args) {

        String  msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        int indexOfSenderBegin = msg.indexOf("<");
        int indexOfSenderClosing = msg.indexOf(">");

        int indexOfNumberBegin = msg.indexOf("[");
        int indexOfNumberClose = msg.indexOf("]");

        int indexOfMsgBegin = msg.indexOf("{");
        int indexOfMsgClose = msg.indexOf("}");


        String sender =msg.substring(indexOfSenderBegin+1,indexOfSenderClosing);
        String number =msg.substring(indexOfNumberBegin+1,indexOfNumberClose);
        String message = msg.substring(indexOfMsgBegin+1,indexOfMsgClose);

        System.out.println(indexOfSenderBegin);
        System.out.println(indexOfSenderClosing);
        System.out.println(indexOfNumberBegin);
        System.out.println(indexOfNumberClose);
        System.out.println(indexOfMsgBegin);
        System.out.println(indexOfMsgClose);
        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);


    }
}
