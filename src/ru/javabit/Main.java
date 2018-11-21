package ru.javabit;

import ru.javabit.gameField.GameField;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Game();
    }
    /*
    Написать программу (начальный прототип Морского Боя), которая будет:

1. Приветствовать игрока (выводя сообщения консоль).
2. Запрашивать его имя/ник
3. Содержать константы, которые в будущем могут пригодиться для игры (количество кораблей одного типа и другого и третьего, общее количество кораблей и т.д.)
4. Разработать отдельный класс для корабля, у которого есть поля класса специфичные для кораблей (тип корабля, координаты, если нужны)
5. Создать нужное для морского боя количество объектов-кораблей и вывести сообщение о том, что корабли созданы.
6. Вывести сообщение о победителе (пока в качестве заглушки можно использовать функцию для генерирования случайных чисел, или же выбирать всегда одного победителя, если пока не знаете, как случайные числа получать)
7. Помним о правилах по оформлению кода.
    Второй шаг:
    Программа должна вывести на экран в текстовом виде поле игрока и поле компьютера.
    Примерно в таком виде:
    А B C D ...
            1 | | | | |
            2 | | | | |
            3 | | | | |
    Доп. задание:
    Написать метод (подумайте, кому он должен принадлежать, и кто его будет вызывать) по добавлению всех кораблей на поле случайным образом, даже если они пересекаются друг с другом.
    Учтите план на будущее: возможно когда-то потом потребуется реализовать еще и метод по ручному добавлению кораблей (сам этот метод пока делать не нужно).
    Серьезное усложнение: а теперь добавьте проверку на то, чтобы корабли не пересекались при добавлении на поле, то есть корабли не могут располагаться вплотную друг к другу.


    Доп. задание
    Реализуйте переключатель в программе, между автоматическим размещением кораблей и ручным.
    Автоматическая расстановка жизненно необходима для тестирования всей логики работы программы,
    ручная же расстановка является всего лишь дополнительной опцией.
    Ручную расстановку лучше пока не делать, так как текстом это вводить очень долго в консоли,
    а в графическом интерфейсе придется все равно переделывать.
    Реализуйте метод автоматической стрельбы: как для пользователя, так и для компьютера — ничего не запрашивает,
    просто стреляет, выводит результат и обновленное поле.
    Метод ручной стрельбы тоже не имеет большого смысла делать в консольном варианте,
    лучше сразу в графическом. Но если хотите, попробуйте.
    Задание со звездочкой: так как в дальнейшем планируется перенос игры с текстового движка на графический,
    поэтому постарайтесь разделить логику программы и визуальное отображение.
    В этом вам поможет знание интерфейсов и абстрактных классов.
    Для этого создайте интерфейс (или абстрактный класс),
    который бы содержал в себе все методы вывода чего-либо вообще на экран.
    В самой логике программы не должно остаться вызовов System.out.println() вообще.
    Вместо такого вывода вы должны вызывать соответствующие методы из экземпляра, реализующего этот интерфейс
    (абстрактный класс). Тем самым все классы, которые у вас отвечают за логику работы программы станут тем,
     что называется Моделью в паттерне Model-View-Controller. https://ru.wikipedia.org/wiki/Model-View-Controlle...
    */
}