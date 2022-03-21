class Scratch {
    public static void main(String[] args) {
        methodWithUnusedParameter("first", "second");
        methodWithUnusedParameter("used", "unused");
    }

    private static void methodWithUnusedParameter(String used, String redundant) {
        System.err.println("It is used parameter: " + used);
    }

    public int intentionExample(boolean z, boolean a, boolean b) {
        if (!(z ? a : b)) return 1;
        return 2;
    }
}
