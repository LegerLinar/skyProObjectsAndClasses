package pro.sky.java.course1.objectsAndClasses1;

public class Main {
    public static void main(String[] args) {
        // В методе main создайте несколько объектов «Книга» (достаточно двух)
        //// и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
        //// Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
        ////Метод main не должен находиться в классах Book и Author.
        ////Создайте отдельный класс для запуска приложения и объявите метод main в нем.
        ////В том же методе main измените год публикации одной из книг с помощью сеттера.

        Author ostrovskiy = new Author("Николай", "Островский");
//        Author ostrovskiy2 = new Author("Николай", "Островский");
        Author tolstoy = new Author("Лев", "Толстой");

        Book asTheSteelWasTempered = new Book("Как закалялась сталь", ostrovskiy, 1934);
        Book asTheSteelWasTemperedEqualityTest = new Book("Как закалялась сталь", ostrovskiy, 1934);
        Book stormBorne = new Book("Рождённые бурей", ostrovskiy, 1937);
        Book warPeace = new Book("Война и Мир", tolstoy, 1867);
        Book annaKarenina = new Book("Анна Каренина", tolstoy, 1877);

        warPeace.setIssueYear(2023);


        System.out.println(stormBorne.getAuthor());
        System.out.println(annaKarenina.hashCode());

//        System.out.println(ostrovskiy.equals(tolstoy));
//        System.out.println(ostrovskiy);
//        System.out.println(tolstoy);
//        System.out.println(ostrovskiy.hashCode());
//
//        System.out.println(stormBorne);
//
//        System.out.println(asTheSteelWasTempered.equals(asTheSteelWasTemperedEqualityTest));

    }
}
