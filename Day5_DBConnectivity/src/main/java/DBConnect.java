import java.sql.*;

public class DBConnect 
{
    static Connection conn;
    static PreparedStatement stmt;
    static ResultSet  rs;
    static String USER = "root";
    static String PASS = "";
    
    
    public static void main(String [] args)
    {
          connectDB();
          selectDB();
         // insertDB();
         // deleteDB();
          updateDB();
         // closeDB(); 
    }
    
    static void connectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/MADWinter2018",USER,PASS);
        }
        catch(Exception e)
                {
                   e.printStackTrace(); 
                }
    }
    
    static void insertDB()
    {
        try
        {
           stmt = conn.prepareStatement("insert into Person values(?,?,?,?)");
           stmt.setInt(1,103);
           stmt.setString(2,"Kirti");
           stmt.setString(3,"Ranga");
           stmt.setInt(4,14); 
           
           int i = stmt.executeUpdate();
           System.out.println(i+ "RECORD INSERTED");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
    }
    static void selectDB()
    {
        try
                {
                  stmt = conn.prepareStatement("Select * from Person"); 
                  rs = stmt.executeQuery();
                  
                  while(rs.next())
                  {
                      System.out.println("ID:" + rs.getInt(1) + "First Name:" + rs.getString("First Name") + "Last Name:" + rs.getString("Last Name") + "Age:" + rs.getInt("Age") );
                  }
                }
        catch(SQLException e)
                {
                    e.printStackTrace(); 
                }
    }
    
    static void deleteDB()
    {
        try
        {
            stmt = conn.prepareStatement("delete from Person where ID = ?"); 
            stmt.setInt(1,103);

           int nrec = stmt.executeUpdate();
           System.out.println(nrec+ "RECORD DELETED");

        }
         catch(SQLException e)
         {
             e.printStackTrace();
         }
    } 
    static void updateDB()
    {
        try
        {
            stmt = conn.prepareStatement("UPDATE Person SET First Name = ?, Last Name = ?, Age = ? WHERE ID = ?");    // update table column
            stmt.setString(1,"Kirti");
           stmt.setString(2,"Sharma");
           stmt.setInt(3,20); 
           stmt.setInt(4,103);
           
           int nrec = stmt.executeUpdate();
           System.out.println(nrec + "RECORD UPDATED");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
      
    }
static void closeDB()
    {
        try
        {
          if(conn!= null)
          {
              conn.close();
          }
            
        }
         catch(SQLException e)
         {
             e.printStackTrace();
         }
    } 
   
}
