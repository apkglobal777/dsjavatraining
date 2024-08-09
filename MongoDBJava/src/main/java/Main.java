
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Note MongoDB is a no sql(Objects) database and high speed easy maintain
    //1. Establish the mongo database connection with java
    //2. Create the collection
    //3. Get the collections
    //4. Insert the document in collections
    //5. Update the document in collections
    //6. delete the document in collections
    //7. Get the document from collections
    //8. Get the specific document from collection
    public static void main(String[] args) {
        //create csv file and write 5 name of your friends
//        try {
//            FileWriter writer = new FileWriter("myfile.csv", true);
//            System.out.println("enter your friends name");
//            Scanner scanner = new Scanner(System.in);
//            writer.append(scanner.nextLine()+", ");
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //create the client connection for mongoDB to java
        MongoClient client = MongoClients.create("mongodb://localhost:27017/");

        //create new database using mongoClient
        //MongoDatabase database = client.getDatabase("railwayDB");
        var database = client.getDatabase("railwayDB");
        System.out.println("New Database is created "+ database.getName());

        //create new collection in database
//        database.createCollection("users");
//        System.out.println("new collection is created");

        //to delete the collection from database
        //var usersCollection = database.getCollection("users");
        //to drop the collection
        //usersCollection.drop();

        //to access the list of collection from database
        for (String collectionName : database.listCollectionNames())
        {
            System.out.println(collectionName);
        }

        //to insert the document into collection
        //to insert the user data into user collection
        var userCollection = database.getCollection("users");
        //create new document for users collection
        var userDocument = new Document();
        userDocument.append("name", "pawan sharma");
        userCollection.insertOne(userDocument);
        System.out.println("User data added");



    }
}