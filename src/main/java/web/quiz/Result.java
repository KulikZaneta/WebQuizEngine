package web.quiz;

public class Result {
    public final static Result SUCCESS = new Result(true, "Congratulations, you're right!");
    public final static Result FAILURE = new Result(false, "Wrong answer! Please, try again.");

    private final boolean success;
    private final String feedback;

    public Result(boolean success, String feedback) {
        this.success = success;
        this.feedback = feedback;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getFeedback() {
        return feedback;
    }
}
