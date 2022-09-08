package Office_Hour_Nov_30_2021;
public abstract class SocialMedia {

    public String personalUrl;
    public int accountLength;
    public static String platform;
    public abstract void  directMassage(SocialMedia other, String message);
    public abstract void  post(String body);
    public abstract void  notification();



}
/*
Social Media
• Create an abstract class for Social Media that has the following features:
- Direct messaging(String username, String message) - Post(String body)
- Notifications()
• The Social Media will also have the following fields:
- Personal URl (String) - Account length (int)
- Platform (static String)
 */
