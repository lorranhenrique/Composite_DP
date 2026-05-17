package org.example.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Chapter extends Content
{

    private List<Content> contentList;

    public Chapter(String description) {
        super(description);
        this.contentList = new ArrayList<Content>();
    }

    public void addContent(Content content)
    {
        this.contentList.add(content);
    }

    @Override
    public String display() {
        String output = "";
        output = " Chapter: " + this.getDescription() + "\n";
        for (Content content : this.contentList) {
            output += content.display();
        }
        return output;
    }
}
