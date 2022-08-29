package project.project.scout;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoutService {
    public List<Scout> getScouts() {
        return List.of(
                new Scout(
                        1L,
                        "Victor Wong",
                        22,
                        "Member",
                        "Queens Road East",
                        "xxx@gmail.com"
                )
        );
    }
}
