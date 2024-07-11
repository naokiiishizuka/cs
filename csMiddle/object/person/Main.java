package csMiddle.object.person;

class Person {
    final private String firstName;
    final private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getInitial() {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

}

class MyClass{
    public static void main(String[] args){
        // ② 問題文にある一つ目のテストケースをMyClass内に記述しましょう。
        Person mike = new Person("Michael", "Johnson");
        Person carly = new Person("Carly", "Angelo");
        Person jessie = new Person("Jessie", "Raelynn");

        // コンソール出力することでテストケースが正しい値であるかが判定されます。
        System.out.println(mike.getFullName());
        System.out.println(mike.getInitial());

        // ③ 上記を参考に他のテストケースを作成しましょう。
        // 問題文中のテストケースを全て満たすことで合格します。
        System.out.println(carly.getFullName());
        System.out.println(carly.getInitial());

        System.out.println(jessie.getFullName());
        System.out.println(jessie.getInitial());

        // ④ テストボタンを押して正しく出力されているかを確認しましょう。
        // メソッド名、文字列のスペースなどは注意深く確認しましょう。

        // ⑤ テストが確認できたら、提出ボタンを押して完了です。
    }
}