package pro.sky.java.course1.objectsAndClasses1;


public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String name, String authorSurname) {
        this.authorName = name;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String name) {
        authorName = name;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String surname) {
        authorSurname = surname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return authorName.equals(c2.authorName) && authorSurname.equals(c2.authorSurname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }
}

//Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.
