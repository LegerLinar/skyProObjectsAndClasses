package pro.sky.java.course1.objectsAndClasses1;

//Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
// Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
//Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
//Напишите конструкторы для обоих классов, заполняющие все поля.
//Создайте геттеры для всех полей автора и всех полей книги.
//Создайте сеттер для поля «Год публикации» у книги.
//В методе main создайте несколько объектов «Книга» (достаточно двух)
// и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
// Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
//Метод main не должен находиться в классах Book и Author.
//Создайте отдельный класс для запуска приложения и объявите метод main в нем.
//В том же методе main измените год публикации одной из книг с помощью сеттера.
public class Book {
    private String bookName;
    private Author author;
    private int issueYear;

    //    Constructor
    public Book(String bookName, Author author, int issueYear) {
        this.bookName = bookName;
        this.author = author;
        this.issueYear = issueYear;
    }

// getters

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author.toString();
    }

// setters

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    @Override
    public String toString() {
        return bookName + ". Автор - " + author.toString() + ". " + issueYear + "г.";
    }


    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName) && author.equals(c2.author) && issueYear == c2.issueYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}


//Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.