package app;

import controllers.PersonController;
import mongodb.MongoHandler;

import static spark.Spark.get;
import static spark.Spark.post;

public class SparkTesting {

    public static MongoHandler mongoHandler;

    public static void main(String[] args) {

        mongoHandler = new MongoHandler();

        get("/hello", (req, res) -> "Hello World Spark");

        post("/persons", PersonController.savePerson);

    }

}
