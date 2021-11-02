import models.Squad;
import models.Hero;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

//        get("/layout", (request, response) -> { //request for route happens at this location
//            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
//            return new ModelAndView(model, "layout.hbs"); // assemble individual pieces and render
//        }, new HandlebarsTemplateEngine());
//
//        get("/hello", (request, response) -> { //request for route happens at this location
//            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
//            return new ModelAndView(model, "hello.hbs"); // assemble individual pieces and render
//        }, new HandlebarsTemplateEngine());
    }
}