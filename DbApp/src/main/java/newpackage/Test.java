package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {

        try{

            Class.forName("org.postgresql.Driver"); //memory me load ho rhi driver class
            //procotal:vendorname"//serverInstalLoc/databsename
            String url="jdbc:postgresql://localhost:5432/technicalblog";
            String uname="postgres";
            String pwd="root";


//                String name=null;
//                String pass=null;
            // driver class ko register krna driver manager saath
            //Connection is interface iske andr
            //getconn is static as calling diretly
            //url se dekhenga konsa get connection call krna


            Connection con= DriverManager.getConnection(url,uname,pwd);

            Statement stmt=con.createStatement();

            String q="select * from post";

            ResultSet rs=stmt.executeQuery(q);



            while(rs.next())
            {
//                  if(rs.getString(1).equals(name) && rs.getString(2).equals(pass))
//                  {
//                      System.out.println("True");
//                      break;
//                  }
//                  else {
//                      System.out.println("False");
//                  }

                System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" :"+rs.getString(4));
            }

            con.close();

        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

}

}


//try{
//        Class.forName("com.mysql.jdbc.Driver");
//
//        String url = "jdbc:mysql://localhost:3306/technicalblog";
//        String uname = "root";
//        String pwd = "root";
//
//        Connection con = DriverManager.getConnection(url,uname,pwd);
//
//        Statement stmt = con.createStatement();
//
//        String q = "select * from student";
//
//        ResultSet rs = stmt.executeQuery(q);
//
////            String name = null;
////            String pass = null;
//
//        while(rs.next()){
//
//
//        System.out.println(rs.getInt(1)+" : "+rs.getString(2)+":"+rs.getInt(3));
//

//                if(rs.getString(1).equals(name) && rs.getString(2).equals(pass)){
//                    System.out.println("True");
//                    break;
//                }else{
//                    System.out.println("False");
//                }


 //       }

//            String q2 = "insert into student values(104,'abc')";
//
//            stmt.executeUpdate(q2);

  //              con.close(


          //      try{
//        Class.forName("com.mysql.jdbc.Driver");
//
//        String url = "jdbc:mysql://localhost:3306/technicalblog";
//        String uname = "root";
//        String pwd = "root";
//
//        Connection con = DriverManager.getConnection(url,uname,pwd);
//
//        Statement stmt = con.createStatement();
//
//        String q = "select * from student";
//
//        ResultSet rs = stmt.executeQuery(q);
//        }catch(Exception e){}
//
