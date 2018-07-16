package xyz.barbaruiva.main;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
    public static void main(String[] args) {

        get("/hello", (req, res) -> {

            HashMap mapa = new HashMap();
            mapa.put("msg", "Mundo");
            return render(mapa, "teste.vm");
        });
    }

    
    public static String render(Map<String, Object> model, String templatePath) {
        return new VelocityTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
