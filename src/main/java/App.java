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
        //home
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("username", request.session().attribute("username"));
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

       //to view heroes.
        get("/hero-view", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes = (ArrayList<Hero>) Hero.allHeroes();
            model.put("heroes", heroes);
            return new ModelAndView(model, "hero-view.hbs");
        }, new HandlebarsTemplateEngine());
        //to view squads
        get("/squad-view", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Squad> squads = (ArrayList<Squad>) Squad.allSquads();
            model.put("heroes", squads);
            return new ModelAndView(model, "squad-view.hbs");
        }, new HandlebarsTemplateEngine());
        //to view hero-form.
        get("/hero-form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());
    }
}