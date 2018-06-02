package controllers;

import com.google.gson.Gson;
import model.Person;
import spark.Request;
import spark.Response;
import spark.Route;
import static app.SparkTesting.mongoHandler;

public class PersonController {


    public static Route savePerson = (Request req, Response resp) -> {

        Person person = new Gson().fromJson(req.body(), Person.class);
        mongoHandler.savePerson(person);

        return "Saved";
    };

}
