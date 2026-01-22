class Animal{
void eat(){
Sytem.out.println("animal can eat");
}
}
class dog extend animal{
void bark(){
System.out.println("dogs can bark");
}
}
public calss Singleinheritance{
public static void main(String[] args){
dog d=new dog();
d.eat();
d.bark();
}
}