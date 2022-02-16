package edu.wctc.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StepController {
    @RequestMapping("/step/{step_index}")
    public String showStep(@PathVariable("step_index") int step_index) {
        int step_total = 3;

        if (step_index > 0 && step_index <= step_total) {
            return "steps/step" + Integer.toString(step_index);
        }

        else { return "index"; }
    }
}