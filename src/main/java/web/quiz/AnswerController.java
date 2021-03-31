package web.quiz;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class AnswerController {
    Answer answer = new Answer("The Java Logo", "What is depicted on the Java logo?", List.of("Robot", "Tea leaf", "Cup of coffee", "Bug"));

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Answer getAnswer() {
        return answer;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Result answer(@RequestParam int answer) {
        return answer == 2 ? Result.SUCCESS : Result.FAILURE;
    }
}
