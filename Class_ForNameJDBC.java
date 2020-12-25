public class Class_ForNameJDBC {
    public static void main(String[] args) {
        
        // This is for how class.forname() registers JDBC drivers software with driver manager service.

        // Driver manager service
        /*
        This is built in java service in every java application
        Ability to maintain JDBC drivers software in java application.
        */
        // Type 1 JDBC driver software registration
        /*
        From java 8 Type 1 driver is removed.
        we will first create an object of the JDBC driver and put that object in DriverManager
        obj creation as below:
        sun.jdbc.odbc.JdbcOdbcDriver driver = new sun.jdbc.odbc.JdbcOdbcDriver();
        putting that driver in Driver manager
        DriverManager.registerDriver(driver);

        No one uses above 2 lines of code 
        They will use below Altenate:
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Class.forName() is responsible to load any class at runTime
        This method loads the driver class.
        This will not create the object of the class but uses the class.
        Some internal working will happen and it will interact with the DriverManager.

        This class and method name will have static block which will already have above two lines of code so,
        this line of code will directly register the driver class with drivermanager

        Now if we hae oracle then we will use:
        Class.forName("oracle.jdbc.driver.OracleDriver");

        for posgresql:
        Class.forName("org.posgresql.Driver");

        for mysql:
        Class.forName("org.gjt.mm.mysql.Driver");
        */
    }
}
