package web.controller;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/")
public class CarController {

    CarService service = CarService.getInstance();

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printWelcome(@RequestParam Map<String,String> allRequestParams, ModelMap model) {
        //интернационализации spring
        if(allRequestParams.size()!=0) {
            if(allRequestParams.get("locale").equals("ru")) {
                model.addAttribute("handler", "МАШИНЫ");
            } else if(allRequestParams.get("locale").equals("en")) {
                model.addAttribute("handler", "CARS");
        } else {
                model.addAttribute("handler", "Список машин | локаль не выбрана");
            }
        } else { model.addAttribute("handler", "Список машин | локаль не выбрана");}

        //singletone

        List<Car> listCars = service.getCars();
        model.addAttribute("list",listCars);

        return "cars";
    }
}
