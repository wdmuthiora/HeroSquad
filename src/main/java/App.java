import models.Squad;
import models.Hero;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("username", request.session().attribute("username"));
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero-view", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes = (ArrayList<Hero>) Hero.allHeroes();
            model.put("heroes", heroes);
            return new ModelAndView(model, "hero-view.hbs");
        }, new HandlebarsTemplateEngine());
    }
}