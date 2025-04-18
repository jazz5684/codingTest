package middleTest;

public class Test02 {
    public static void main(String[] args) {
        int sp,start,end;
        String str = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.1\" 200 \" ";
        sp = str.indexOf("\"");
        start = str.indexOf("/",sp);
        end = str.indexOf(" ",start);
        System.out.println(str.substring(start, end));
    }
}
