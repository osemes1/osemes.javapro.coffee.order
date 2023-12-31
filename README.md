# osemes.javapro.coffee.order

Виконання ДЗ 29. Логування

1. Створити новий пакет coffee.order
2. Створити клас CoffeeOrderBoard. Клас є цифровим поданням черги замовлень у кав'ярні. Цей клас містить список замовлень.
3. Створити клас Order. Клас є цифровим поданням замовлення. Даний клас містить номер замовлення та ім'я людини, що його замовила. 
4. Реалізувати метод add у класі CoffeeOrderBoard. Даний метод додає нове замовлення та надає замовленню номер (натуральний порядок).
5. Натуральний порядок (natural ordering) означає, що й у останнього замовлення номер 86, то наступний буде 87. 
6. Не може бути такої ситуації, що номер повторюється у межах одного об'єкта типу CoffeeOrderBoard.
7. Реалізувати метод deliver у класі CoffeeOrderBoard. Цей метод видає найближче на черзі замовлення. Видача супроводжується видаленням замовлення зі списку.
8. Реалізувати метод deliver у класі CoffeeOrderBoard. Даний метод видає замовлення з певним номером. Видача супроводжується видаленням замовлення зі списку.
Даний метод обробляє ситуацію, коли замовлення, що надійшло пізніше, готове раніше.
9. Реалізувати метод draw у класі CoffeeOrderBoard. Цей метод виводить у консоль інформацію про поточний стан черги у порядку найближчого до видачі замовлення.
Наприклад:
=============
Num | Name
4 | Alen
27 | Yoda
33 | Obi-van
34 | John Snow

Підключити логування
1. Конфігурувати логування для виведення інформації в консоль і запису файл
2. Застосувати логування до всіх операцій на рівні info. Крім методів: constructor, getter, setter
3. Логування має відображати хід операції, містити достатню інформацію для аналізу операції.

Логування вілбувається:
10:03:27.577 [main] INFO  osemes.javapro.coffee.order.Order - Created order for customer: Alen
10:03:27.579 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Added order: 1 | Alen
10:03:27.579 [main] INFO  osemes.javapro.coffee.order.Order - Created order for customer: Yoda
10:03:27.579 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Added order: 2 | Yoda
10:03:27.579 [main] INFO  osemes.javapro.coffee.order.Order - Created order for customer: Obi-van
10:03:27.579 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Added order: 3 | Obi-van
10:03:27.579 [main] INFO  osemes.javapro.coffee.order.Order - Created order for customer: John Snow
10:03:27.579 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Added order: 4 | John Snow
10:03:27.580 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - ================
10:03:27.580 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Num | Name
10:03:27.580 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 1 | Alen
10:03:27.580 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 2 | Yoda
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 3 | Obi-van
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 4 | John Snow
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - ================
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Delivering order: 1 | Alen
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Delivering order: 2 | Yoda
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - ================
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Num | Name
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 3 | Obi-van
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 4 | John Snow
10:03:27.581 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - ================
10:03:27.582 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Order with number 33 not found.
10:03:27.582 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - ================
10:03:27.582 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - Num | Name
10:03:27.582 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 3 | Obi-van
10:03:27.582 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - 4 | John Snow
10:03:27.582 [main] INFO  osemes.javapro.coffee.order.CoffeeOrderBoard - ================

4. У разі виключення, stacktrace має бути залогований на рівні error

Виконання 4 пункту логування на рівні error можна використовувати для виведення stacktrace у випадку виключення, наприклад:

java
Copy code
try {
    // Операції, які можуть викликати виключення
} catch (Exception e) {
    logger.error("An error occurred: {}", e.getMessage(), e);
}
