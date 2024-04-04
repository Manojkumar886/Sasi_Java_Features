package Stream_API.Java_Featurs;

public class textblock
{
    public static void main(String[] args) {
        String address="7/149-Rasipuram "+"\n Namakkal,Tamilnadu"+"\n pincode-6372903";

//        text block
        String htmlcode= """
                <html>
                    <head>
                    </head>
                    <body>
                    </body>
                 </html>
                """;

        System.out.println(htmlcode==address);//

        System.out.println(address);
        System.out.println(htmlcode);
    }
}
