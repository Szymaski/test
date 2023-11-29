package workshop;

import workshop.tool;

import java.util.ArrayList;
import java.util.List;

public class worker {

    public void uruchom() {
        tool tool1 = new tool("pneumat");
        tool1.useTool();

        tool tool2 = new tool("latarka");

        List<tool> tools = new ArrayList<>();
        tools.add(tool1);
        tools.add(tool2);

        for (tool tool : tools) {
            System.out.println("narzedzie : " + tool.toolType);
        }
    }

}