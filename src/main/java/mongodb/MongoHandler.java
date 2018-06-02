package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import model.Person;
import org.bson.Document;

public class MongoHandler {

    MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");

    MongoClient mongoClient = new MongoClient(connectionString);

    MongoDatabase db = mongoClient.getDatabase("mydb");

    public void savePerson(Person person) {

        Document doc = new Document("name", person.getName())
                .append("surname", person.getSurname())
                .append("age", person.getAge());
        db.getCollection("Persons").insertOne(doc);

    }

}
