package csMiddle.object.dog;

class Dog {
    final private String name;
    final private int size;
    final private int age;

    public Dog(String name, int size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public String bark() {
        if(size >=  50) return "Wooof! Woof!";
        else if(size >= 20) return "Ruff! Ruff!";
        else return "Yip! Yip!";
    }

    public int calcHumanAge() {
        return 12 + (age - 1) * 7;
    }
}

class MyClass{
    public static void main(String[] args){
        // ② 問題文にある一つ目のテストケースをMyClass内に記述しましょう。
        Dog goldenRetriever = new Dog("Golden Retriever", 60, 10);
        Dog siberianHusky = new Dog("Siberian Husky", 55, 6);
        Dog poodle = new Dog("poodle", 10, 1);
        Dog shibaInu = new Dog("shibaInu", 35, 4);
        // コンソール出力することでテストケースが正しい値であるかが判定されます。
        System.out.println(goldenRetriever.bark());
        System.out.println(goldenRetriever.calcHumanAge());

        System.out.println(siberianHusky.bark());
        System.out.println(siberianHusky.calcHumanAge());

        System.out.println(poodle.bark());
        System.out.println(poodle.calcHumanAge());

        System.out.println(shibaInu.bark());
        System.out.println(shibaInu.calcHumanAge());

        // ③ 上記を参考に他のテストケースを作成しましょう。
        // 問題文中のテストケースを全て満たすことで合格します。


        // ④ テストボタンを押して正しく出力されているかを確認しましょう。
        // メソッド名、文字列のスペースなどは注意深く確認しましょう。

        // ⑤ テストが確認できたら、提出ボタンを押して完了です。
    }
}
