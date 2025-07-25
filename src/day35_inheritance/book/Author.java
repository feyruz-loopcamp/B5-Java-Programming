package day35_inheritance.book;

import my_util.StringUtil;

// Custom Class
public class Author {
    private String name;
    private int age;
    String gender;

    public Author(String name, int age) {
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
    }


    public void setName(String name) {
        name = name.trim();
        if (name.contains(" ")){
            this.name = StringUtil.fixFormatForFullName(name);
        }
    }

    public void setAge(int age) {
        if (age > 3) {
            this.age = age;
        }
    }


    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
