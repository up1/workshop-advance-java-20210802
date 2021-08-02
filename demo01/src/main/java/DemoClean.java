public class DemoClean {
    public static void main(String[] args) {
        // Fail fast and return early
        // Type 1
        if(true) {
            if(true) {
                if(true) {
                    // TODO Sth
                }
            }
        }

        // Type 2
        if(false) { throw new RuntimeException("1"); }
        if(false) { throw new RuntimeException("2"); }
        if(false) { throw new RuntimeException("3"); }

        // TODO Sth

    }

    String demo02(int score) {
        String result = "";
        if(score >= 80) {
            result = "A";
        }
        if(score >= 70) {
            result = "B";
        }
        return result;
    }

    String demo03(int score) {
        if(score >= 80) {
            return "A";
        }
        if(score >= 70) {
            return "B";
        }
        return "";
//        throw new RuntimeException();
    }
}
