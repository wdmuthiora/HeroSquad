import models.Squad;
import models.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        Hero hulk =  new Hero("Hulk",21, "Durability","Anger","Avengers","The Abomination", 5 );
        Hero flash = new Hero("flash",30,"Super speed","no brakes","Justice League","Reverse Flash", 1000);
        Hero thor = new Hero("Thor", 2000, "Durability", "Pride", "Avengers","Loki",2000);
        Squad justiceLeague = new Squad("Justice League", "Superman",  7, "Be as cool as the Avengers");
        Squad avengers= new Squad("Avengers","Captain America", 10,"Destroy Hydra");

        //home
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //Create a Hero
        get("/hero-form", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        //hero creation.
        post("/heroes/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int age=Integer.parseInt(request.queryParams("age"));
            String power=request.queryParams("power");
            String weakness=request.queryParams("weakness");
            String squadMembership=request.queryParams("squadMembership");
            String nemesis=request.queryParams("nemesis");
            int experience=Integer.parseInt(request.queryParams("experience"));
            Hero newHero = new Hero(name, age, power, weakness, squadMembership, nemesis, experience);
            model.put("hero", newHero);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        //Create a Squad
        get("/squad-form", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        //squad creation
        post("/squads/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String leader=request.queryParams("leader");
            int maximumSize=Integer.parseInt(request.queryParams("maximumSize"));
            String teamMembers=request.queryParams("teamMembers");
            String mission=request.queryParams("mission");
            Squad newSquad = new Squad(name, leader, maximumSize, mission);
            model.put("squad", newSquad);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());


        //get all heroes
        get("/hero-view", (req, res) -> {
            Map<String, ArrayList<Hero>> model = new HashMap<>();
            ArrayList<Hero> heroes = Hero.allHeroes(); //From Hero class, get all hero instances and put them into the ArrayList.
            model.put("heroes", heroes);
            return new ModelAndView(model, "hero-view.hbs");
        }, new HandlebarsTemplateEngine());

        //get all squad
        get("/squad-view", (req, res) -> {
            Map<String, ArrayList<Squad>> model = new HashMap<>();
            ArrayList<Squad> squads = Hero.allHeroes(); //From Squad class, get all hero instances and put them into the ArrayList.
            model.put("squads", squads);
            return new ModelAndView(model, "squad-view.hbs");
        }, new HandlebarsTemplateEngine());


        //get hero by ID.
        get("/hero-view/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfHeroToFind = Integer.parseInt(req.params(":id")); //pull id - must match route segment
            Hero foundHero = Hero.findById(idOfHeroToFind); //use it to find hero
            model.put("post", foundHero); //add it to model for template to display
            return new ModelAndView(model, "hero-view.hbs"); //individual hero page.
        }, new HandlebarsTemplateEngine());

        //get squad by ID.
        get("/squad-view/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfSquadToFind = Integer.parseInt(req.params(":id")); //pull id - must match route segment
            Squad foundSquad = Squad.findById(idOfSquadToFind); //use it to find squad
            model.put("post", foundSquad); //add it to model for template to display
            return new ModelAndView(model, "squad-view.hbs"); //individual squad page.
        }, new HandlebarsTemplateEngine());
    }
}