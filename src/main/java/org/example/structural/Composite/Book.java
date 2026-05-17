package org.example.structural.Composite;

public class Book
{
    private Content content;

    public void setContent(Content content)
    {
        this.content = content;
    }

    public String getContent(){
        if(content == null){
            throw new NullPointerException("Content is null");
        }
        return this.content.display();
    }

}
