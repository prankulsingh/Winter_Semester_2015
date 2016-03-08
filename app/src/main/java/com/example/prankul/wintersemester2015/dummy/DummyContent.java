package com.example.prankul.wintersemester2015.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static
    {
        // Add some sample items.
        addItem(new DummyItem("1","CN - Notes", "http://www.cse.iitk.ac.in/users/dheeraj/cs425/"));
        addItem(new DummyItem("2","DBMS - Resources","https://www.usebackpack.com/iiitd/w2016/cse202/resources"));
        addItem(new DummyItem("3","DBMS - Book","http://www.db-book.com/"));
        addItem(new DummyItem("4","DBMS - Notes","http://www.mathcs.emory.edu/~cheung/Courses/377/Syllabus/syl.html#CURRENT"));
        addItem(new DummyItem("5","ADA - Resources","https://www.usebackpack.com/iiitd/w2016/cse222/resources"));
        addItem(new DummyItem("6","GT - Course Overview","https://sites.google.com/a/iiitd.ac.in/graph-theory-w16/"));
        addItem(new DummyItem("7","GT - Classroom","https://classroom.google.com/u/0/c/NzYyMTA1OTE4"));
        addItem(new DummyItem("8","EVS - Resources","https://www.usebackpack.com/iiitd/w2016/esc205a/resources"));
        addItem(new DummyItem("9","T. Comm - Videos","https://www.youtube.com/playlist?list=PLcauF92vqKh-ifba4Vbk4MEcwKuTgngJr"));
        addItem(new DummyItem("10","FooBar", "http://foobar.iiitd.edu.in/contest/team/"));
        addItem(new DummyItem("11","Backpack", "https://www.usebackpack.com/"));
        addItem(new DummyItem("12","IIIT Delhi", "https://www.iiitd.ac.in/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static String makeDetails(int position) {
        /*StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();*/
        return ITEM_MAP.get(position).toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String name ;
        public final String url;

        public DummyItem(String id, String name, String url) {
            this.id = id;
            this.name = name;
            this.url = url;
        }

        @Override
        public String toString() {
            return url;
        }
    }
}
