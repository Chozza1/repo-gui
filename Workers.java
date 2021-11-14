public class Workers {
    public String name;
    public String position;
    public String email;
    public String phone;
    public int pay;
    public int age;


    public Workers(String name, String position, String email, String phone, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public static void print(Workers worker){
        System.out.println(worker.name + " " + worker.position + " " + worker.email + " " + worker.phone + " " + worker.pay + " " + worker.age);
    }

    public static void main(String[] args) {
        Workers[]persons = new Workers[5];
        persons[0] = new Workers("Vasiliy","rabotyaga1","Vasilyi@mail.ru","89992223355",30000,35);
        persons[1] = new Workers("Ivan","rabotyaga2","Ivan@mail.ru","89992323885",30000,40);
        persons[2] = new Workers("Evgeniy","rabotyaga3","Evgeniy@mail.ru","89991112355",30000,29);
        persons[3] = new Workers("Nikodim","prorab","-","89992223355",50000,75);
        persons[4] = new Workers("Aleksandr","rabotyaga4","vasilyi@mail.ru","89990033944",30000,20);
        for (Workers person : persons) {
            if (person.age >= 40) {
                print(person);
            } else {
                break;
            }
        }

    }
}
