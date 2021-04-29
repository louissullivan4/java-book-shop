# java-book-shop
Java assessment that creates instances of people and books using interfaces and enum classes. (No inheritance allowed).

HERE IS THE QUESTION:


Continuous Assessment for Intro to Java.

Implement a class extension-free collection of classes for books, authors, and readers. Yourclasses should use interfaces, enumerated classes, and concrete final classes. You may useexisting interfaces and classes (including generic and enumerated classes) but you may notextend classes and implement your own generic classes.◦Each book has a title, which may have a sub-title, an author, and a price.◦Books can be printed books (hardbacks, paperbacks, ...) or audio books.◦A hardback costs 12 Euro, a paperback costs 10 Euro, and an audio book costs 15 Euro.◦Printed books have a page count (number of pages), e.g. 110.◦Audio books have a duration in minutes, e.g. 120.75.◦Both authors and readers are persons. The only difference is that authors can write books.◦Each person (author/reader) can buy books.◦Each person has a collection of books which they own and which they can print.◦Each author has a collection of published books, which they can print.◦Each person has earnings, which is a monetary value (initially zero).?The instance methodreceive( x )increases the earnings byx.?The instance methodcharge( x )decreases the earnings byx.◦The instance methodbuy( b )is a person’s attempt to purchase the bookb. The purchaseshould only succeed if the person’s earnings are greater than or equal to the price ofb.◦When a person successfully purchases a book, they should be charged for the book’s price, thebook should be added to their owned books, and the book’s author should earn0.10times thebook’s price.◦You must implement authors using an enumeratedAuthorclass.◦Please include aMainclass with amainmethod which demonstrates your constructor andmethod calls.◦Careful: The implementation of the printing of lists should be shared.The instances of some of your concrete (delegate) classes will be used as delegates in otherclasses. The names of these concrete (delegate) classes should start with the wordConcrete.The following shows a possible scenario of an author/buyer simulation. Each book construc-tor automatically publishes the book for its author, i.e. it adds the book to the author’s list ofpublished books.

final Title t1 = new Title( "The Hobbit", "An Unexpected Journey" ); // create title #1: main title and subtitle final Title t2 = new Title( "Catcher in the Rye" ); // create title #2: main title only final Author a1 = Author.JJR_Tolkien; // ‘‘create’’ author #1 final Author a2 = Author.JD_Sallinger; // ‘‘create’’ author #2 final Book b1 = new AudioBook( a1, t1, 1800.5 ); // create and publish book #1 final Book b2 = new Paperback( a2, t2, 100 ); // create and publish book # 2final Reader r1 = new Reader( "Joe", "Soap" ); // create reader #1 a1.receive( 100 ); // author #1 receives some money to spend a1.buy( b2 ); // author #1 buys book worth 10 Euror1.buy( b1 ); // reader #1 tries to buy book worth 15 Euro: fails r1.receive( 100 ); // reader #1 receives some money to spend r1.buy( b1 ); // reader #1 buys book worth 15 Euro: now works r1.buy( b2 ); // reader #1 buys book worth 10 Euro2 a1.printBooksOwned( ); a1.printBooksPublished( ); r1.printBooksOwned( ); // a1 owns 100 - 10 + 0.10 * 15 = 91.5 Euro System.out.println( a1 + " owns " + a1.getEarnings( ) + " Euro" );

The following is the output.

You don’t have enough money to buy AudioBook[ author = JJR Tolkien, title = The Hobbit / An Unexpected Journey, price = 15.0, duration = 1800.5 ] JJR Tolkien owns: Catcher in the Rye JJR Tolkien published: The Hobbit / An Unexpected Journey Joe Soap owns The Hobbit / An Unexpected Journey Catcher in the Rye JJR Tolkien owns 91.5 Euro
