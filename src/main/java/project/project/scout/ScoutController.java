package project.project.scout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/scout")
public class ScoutController {

    private final ScoutService scoutService;

    @Autowired
    public ScoutController(ScoutService scoutService) {
        this.scoutService = scoutService;
    }

    @GetMapping
    public List<Scout> getScouts() {
        return scoutService.getScouts();
    }

}
