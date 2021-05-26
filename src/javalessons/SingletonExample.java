package javalessons;

public class SingletonExample {

    //проверка посредством счетчика
    public static int counter = 0;

    //хранение статического объекта Singleton
    private static volatile SingletonExample instance = null;

    private SingletonExample() {

        // инкрементация внутри конструктора
        counter++;
    }

    public static SingletonExample getInstance() {

        //инициализация объекта, вхождение объектов по потоку
        if (instance == null) {
            //синхронизация одного из объектов
            synchronized (SingletonExample.class) {
                if (instance == null)
                    //создание только 1-го объекта
                    instance = new SingletonExample();
            }
        }
            //при последующих циклах(после первого) новые объекты не создаются, возвращается только существующий экземпляр
            return instance;
        }
    }


