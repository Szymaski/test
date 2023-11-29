package workshop;

public class tool {

    String toolType;

    public tool(String toolType) {
        this.toolType = toolType;
    }

    public void useTool() {
        System.out.println("Typ narzedzia: " + toolType);
    }

}