package structural.Composite;

import org.example.structural.Composite.Book;
import org.example.structural.Composite.Chapter;
import org.example.structural.Composite.Topic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class BookTest
{
    @Test
    public void shouldReturnBookContent(){
        Chapter chapter = new Chapter("Character build");

        Chapter chapter2 = new Chapter("Classes");
        Topic topic1 = new Topic("How to build a warrior","Warrior");
        Topic topic2 = new Topic("How to build a Thief","Thief");
        chapter2.addContent(topic1);
        chapter2.addContent(topic2);

        Chapter chapter3 = new Chapter("Weapons");
        Topic topic3 = new Topic("Dagger habilities","Dagger");
        Topic topic4 = new Topic("Shield habilities","Shield");
        chapter3.addContent(topic3);
        chapter3.addContent(topic4);

        Chapter content = new Chapter("DnD-Player handbook");
        content.addContent(chapter);
        content.addContent(chapter2);
        content.addContent(chapter3);

        Book book = new Book();
        book.setContent(content);

        assertEquals(" Chapter: DnD-Player handbook\n" +
                " Chapter: Character build\n" +
                " Chapter: Classes\n" +
                " Topic: Warrior Description: How to build a warrior\n" +
                " Topic: Thief Description: How to build a Thief\n" +
                " Chapter: Weapons\n" +
                " Topic: Dagger Description: Dagger habilities\n" +
                " Topic: Shield Description: Shield habilities\n",book.getContent());

    }

    @Test
    public void shouldReturnaInvalidBook() {
        try {
            Book book = new Book();
            book.getContent();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Content is null", e.getMessage());
        }
    }
}
