public class WorkingWithJARfile {
    public static void main(String[] args) {
        

        // jar files means (java archive files)
        // it is java level zip file.

        // JAR usages:
        /*
        a) represents java api's.
        b) represents JDBC drivers software
        c) represents App/Project that has to be released.(StandAlone)
        d) represents web application as war file( war-(web application archive) is extension of jar file)
        e) represents EJB component (used to developed distibuted application)
        f) represents Enterprise application in form of ear(enterprise application archive) file
            ear file = jar file + jar file + ....
            ear file = war file + war file + ....
            ear file = jar file + war file + ....
        g) as a normal zip file (Combining multiple files)

        to extract files into jar or from jar we will use jar command or jar tool which is built in jdk
        */
        
        // To create a jar file
        /*
        ->Go to working folder in cmd
        -> command is (jar cf App1.jar .)
            here c means create and f means name of jar file and at last . means convert all files and folder to jar.
        -> command is (jar cvf App1.jar .)
            here v means verbose mode that gives the info of jar creation.
         */

         // To see the table of content of jar file
         /*
         -> go to the jar file location in cmd
         -> use command jar tf App1.jar(file name)
            here t means table of content.
         -> for verbose mode use tvf
         */

         // To update the jar file by adding new file.
         /*
         -> to create c.txt in jardemo folder.
         -> use command jar uf App1.jar c.txt this will add c.txt in jar file.
            u means update jar file
         */

         // Extract specific file from jar file
         /*
         -> go to the directory where jar file is stored in cmd
         -> use command jar xf App1.jar a.txt
            here x means extract file
         -> and at last file will extract particular file.
         -> to extract all file dont mention file name at last just leave as it is.         
         */
    }
}
