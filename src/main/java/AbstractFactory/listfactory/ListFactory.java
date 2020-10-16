package AbstractFactory.listfactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
