public class NeedForJDBC {
    public static void main(String[] args) {
        // JDBC is a part of JSE module.
        
        // JDBC is not abbreviation is only term.
        // Basically when we run program in any language the program uses RAM memory to execute the program.
        // So when the program execution is over the memory will be deallocated,
        // and with that we will lose our data used in throught of the program.

        // So if we have to save the data permenantly we will use databases.
        // Persistance => means saving and managing data for long time is called persistance.
        // To do persistance process we will need Persistance store. EG. Files, Folders etc in oor computer.
        // Persistant Data => Data which is there in persistance store is known Persistet Data.
        // Persistence Operation => Like insert update delete are persistence operation also known as CRUD operation.
        
        // Persistence logic => it is a logic that used to perform persistence opertaion is known as persistence logic. eg. io stream.
        // persistence technology/Framework => it is technology/ framework used to develop persistence logic.
        // Eg. JDBC technology, Hibernate Framework
        // Persistance technology/ framework is used to create persistence logic to perfom persistence operation to,
        // manipulate the persistence data stored is persistence store.

        // If java app has to interact with flat files(text files) as persistence store then we will use I/O stream.
        // ^Using Concept of Serelization and Deserialization
        // The process of capturing object and writing data into file is known as serialization.
        // Reading data from the file and constructing object with data is known as deserialization.
        // In serialzation we get bits and bytes of the object and that bits and bytes is written in the file.
        // We never Write object in the file.

        // If java has to use RDBMS as a persistence store. then we will use JDBC and some SQL queries.


    }
}
